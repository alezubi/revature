package Day11;

class Table1{

    public void printTable(int number){
        synchronized (this){

            for(int i = 1; i <= 5;i++){

                System.out.println(number + "x" + i + "=" + (number * i));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }

    }

}

class MyThread1 extends Thread{
    Table1 table1;

    public MyThread1(Table1 table1){
        this.table1=table1;
    }

    @Override
    public void run() {
        table1.printTable(5);

    }
}

class MyThread2 extends Thread{
    Table1 table1;
    public MyThread2(Table1 table1){
        this.table1=table1;
    }

    @Override
    public void run() {
        table1.printTable(10);
    }
}



public class Learning_Threads2 {
    public static void main(String[] args) {
        Table1 table1 = new Table1();
        MyThread1 t1 = new MyThread1(table1);
        MyThread2 t2 = new MyThread2(table1);

        t1.start();
        t2.start();

    }
}
