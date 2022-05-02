package Day5;

interface StudentInfo{
    int studentID();


}

class getStudentID implements StudentInfo{


    public int studentID(int a) {
        System.out.println("The Student ID: " + a);
        return 0;
    }


    public void studentID(int a, String b) {
        System.out.println("The Student ID: " + a);
        System.out.println("Name of Student: " + b);

    }

    @Override
    public int studentID() {
        return 0;
    }
}

public class InterfaceReview {
    public static void main(String[] args) {
        getStudentID getStudentID = new getStudentID();
        getStudentID.studentID(12,"Alejandro");

    }
}
