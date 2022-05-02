package Day4;

class Revature{

    private String revFullName;
    private int revID;
    private int revPass;

    public String getRevFullName() {
        return revFullName;
    }

    public void setRevFullName(String revFullName) throws Exception {
        if (revFullName.isBlank()) {
            throw new Exception("The name can not be blank");
        }
        this.revFullName = revFullName;
    }

    public int getRevID() {
        return revID;
    }

    public void setRevID(int revID) {
        this.revID = revID;
    }

    public int getRevPass() {
        return revPass;
    }

    public void setRevPass(int revPass) {
        this.revPass = revPass;
    }

    public void printInfo(){
        System.out.println("Name: " + revFullName);
        System.out.println("ID: " + revID);
        System.out.println("Pass" + revPass);

    }
}

public class Obj_SetAndGet2 {
    public static void main(String[] args) throws Exception {

        Revature revature = new Revature();
        revature.setRevFullName("Alejandro");
        revature.setRevPass(4);
        revature.setRevID(78);

       // System.out.println("Revature Name: " + revature.getRevFullName());
       // System.out.println("Revature Pass: " + revature.getRevPass());
        //System.out.println("Revature ID: " + revature.getRevID());

        Revature revature1 = new Revature();
        revature1.setRevFullName("Fernando");
        revature1.setRevPass(6);
        revature1.setRevID(34);

        revature1.printInfo();
        revature.printInfo();


    }
}
