package Serialization;

import java.io.*;

public class Main {
    final static String fileName = "enrollments.ser";

    public static void main(String[] args) {
        Student student = new Student(410, "John", 22);
        Course course = new Course("991", "Biology", "Joseph");
        Enrollment enrollment = new Enrollment(student, course, "1.1.2025");

        File f = new File(fileName);

        if (f.exists() && f.length() > 0) {
            try (FileInputStream inputStream = new FileInputStream(fileName);
                 ObjectInputStream objects = new ObjectInputStream(inputStream)) {
                Enrollment deserialize = (Enrollment) objects.readObject();
                System.out.println("Deserialized " + deserialize.getCourse().getCourseName() + ", " + deserialize.getStudent().getName());
            } catch (Exception e) {
                System.err.println("Reading : " + e);
            }

        } else {
            try (FileOutputStream outputStream = new FileOutputStream(fileName);
                 ObjectOutputStream objects = new ObjectOutputStream(outputStream)) {
                objects.writeObject(enrollment);
                System.out.println("Serialized");
            } catch (Exception e) {
                System.err.println("Writing : " + e);
            }


        }
    }
}