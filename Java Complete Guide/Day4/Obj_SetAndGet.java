package Day4;

class Student{
    private int studentID;
    private String studentName;
    private int studentPass=20;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Student ID has to be positive");

        }
        this.studentID = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) throws Exception {
        if(studentName.isBlank()){
            throw new Exception("Student name can not be blank");
        }
        this.studentName = studentName;
    }

    public int getStudentPass() {
        return studentPass;
    }

}

public class Obj_SetAndGet {
    public static void main(String[] args) throws Exception {

        Student student = new Student();
        student.setStudentID(235);
        student.setStudentName("Alejandro");

        System.out.println(student.getStudentID());
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentPass());

    }
}
