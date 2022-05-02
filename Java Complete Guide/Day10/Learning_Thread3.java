package Day10;

class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Learning_Thread3 {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();

        t1.start();
        t2.start();

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.setName("new name t1");
        t2.setName("new name t2");

        System.out.println("After changing name of t1: " + t1.getName());
        System.out.println("After changing name of t2: " + t2.getName());

    }
}
