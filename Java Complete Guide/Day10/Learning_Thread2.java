package Day10;

class ThreadSleep extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
            System.out.println("*****");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class Learning_Thread2 {
    public static void main(String[] args) {

        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        t1.start();
        t2.start();


    }
}
