package Day10;

class ThreadDemo extends Thread{
    @Override
    public void run() {
        for(int i=0; i < 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class Learning_Thread4 {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();

        t1.run();
        t2.run();

    }
}
