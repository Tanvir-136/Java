public class exm1 {
    public static void main(String[] args) {
        // Create and start two threads
        Thread t1 = new Thread(new MyRunnable("Thread 1"));
        Thread t2 = new Thread(new MyRunnable("Thread 2"));
        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + name + ": " + i);
            try {
                Thread.sleep(300); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread " + name + " interrupted.");
            }
        }
        System.out.println("Thread " + name + " finished.");
    }
}
