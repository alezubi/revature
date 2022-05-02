package Day10;

class ThreadPriority extends Thread{
    @Override
    public void run() {
        System.out.println("This thread name is: " + currentThread().getName());
        System.out.println("The thread priority is: " + currentThread().getPriority());
    }
}

public class Learning_Thread_Priority {
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();

        t1.start();
        t2.start();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);


    }
}
