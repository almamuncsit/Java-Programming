package multithreading;

public class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    RunnableDemo( String name ) {
        this.threadName = name;
        System.out.println("Creating : " + name);
    }

    @Override
    public void run() {
        System.out.println("Running : " + this.threadName);

        try {
            for (int i = 4; i < 0; i--) {
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(50);
            }
            System.out.println("Thread " +  threadName + " exiting.");
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }

    }


    public void start() {
        System.out.println("Starting " + threadName);
        if(t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
