package Day8;

import java.util.ArrayList;
import java.util.Iterator;

class Student{

    int id;
    String fullName;
    String email;

    @Override
    public String toString() {
        return "Student Info:" + "\n" +
                 "ID:" + id + "\n" +
                "Student Name:" + fullName + "\n" +
                "Student Email:" + email + "\n";
    }

    public Student(int id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;


    }
}

public class Learning_UsingIterator2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(1,"Ale Zubi","a@gmail.com");
        Student student2 = new Student(2,"Moi Zubi","m@gmail.com");
        Student student3 = new Student(3,"Isa Correa","i@gmail.com");
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Iterator iterator = students.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
