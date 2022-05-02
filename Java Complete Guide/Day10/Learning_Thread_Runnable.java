package Day10;

class ThreadDemo2 implements Runnable{

    @Override
    public void run() {

        System.out.println("Thread is running..");

    }
}

public class Learning_Thread_Runnable {
    public static void main(String[] args) {

        ThreadDemo2 thread = new ThreadDemo2();
        Thread t1 = new Thread(thread);
        t1.start();
    }
}
