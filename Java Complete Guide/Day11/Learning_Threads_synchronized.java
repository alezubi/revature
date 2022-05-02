package Day11;

class Table {

    public synchronized void printTable(int number){

        for(int i = 1; i <= 10; i++){

            System.out.println(number + " x " + i + " = " + (i * number));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class Thread1 extends Thread{
    Table table;

    public Thread1(Table table){
        this.table=table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

class Thread2 extends Thread{
    Table table;

    public Thread2(Table table){
        this.table=table;
    }

    @Override
    public void run() {
        table.printTable(500);
    }
}

class Thread3 extends Thread{
    Table table;

    public Thread3(Table table){
        this.table=table;
    }

    @Override
    public void run() {
        table.printTable(10);
    }
}

public class Learning_Threads_synchronized {
    public static void main(String[] args) {
        Table table = new Table();
        Thread1 t1 = new Thread1(table);
        Thread2 t2 = new Thread2(table);
        Thread3 t3 = new Thread3(table);

        t1.start();
        t2.start();
        t3.start();


    }
}
