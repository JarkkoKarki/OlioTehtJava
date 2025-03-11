package first;

import first.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "Los Angeles"));
        people.add(new Person("Charlie", 35, "New York"));
        people.add(new Person("David", 28, "Chicago"));
        people.add(new Person("Eve", 22, "New York"));

        people.sort(Comparator.comparingInt(Person::getAge));

        people.removeIf(person -> !person.getCity().equals("New York"));

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}