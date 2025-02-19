package ThreadSafe;

class SafeListTest {
    public static void main(String[] args) throws InterruptedException {
        SafeList<String> safeList = new SafeList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                safeList.add("Thread1-" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                safeList.add("Thread2-" + i);
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                safeList.remove("Thread1-" + i);
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Size of the list: " + safeList.size());
    }
}
