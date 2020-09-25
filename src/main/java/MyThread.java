public class MyThread implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()) {
            try {
                System.out.print("Я поток " + current.getName());
                System.out.println(" Всем привет!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                current.interrupt();
            }
        }
    }
}
