package Day10;

class ThreadDemo1 extends Thread{

    public void run(){
        System.out.println("Thread is running...");
    }

}

public class Learning_Thread {
    public static void main(String[] args){
        ThreadDemo1 thread = new ThreadDemo1();
        thread.start();

    }

}

