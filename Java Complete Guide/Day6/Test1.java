package Day6;




public class Test1 extends Test2 {


    public Test1(String fullName, int id) {
        super(fullName, id);
    }
}

class Test2 {

    public String fullName ;
    public  int id ;
    
    public Test2(String fullName, int id){
        this.fullName = fullName;
        this.id = id;

    }

    public void getStudent(){
        System.out.println(fullName);
        System.out.println(id);
    }

}
