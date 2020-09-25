public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("main");

        Thread thread1 = new Thread(threadGroup, new MyThread(), "1");
        Thread thread2 = new Thread(threadGroup, new MyThread(), "2");
        Thread thread3 = new Thread(threadGroup, new MyThread(), "3");
        Thread thread4 = new Thread(threadGroup, new MyThread(), "4");

        System.out.println("создаю потоки....");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(3000);

        threadGroup.interrupt();
        System.out.println("прерываю потоки....");
    }
}
