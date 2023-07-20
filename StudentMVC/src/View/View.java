package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView {
    
    @Override
    public void printAllStudents(List<Student> students)
    {
        System.out.println("------список студентов--------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public String prompt(String msg) {
       Scanner in = new Scanner(System.in);
       System.out.print(msg);
       return in.nextLine();
    }

    @Override
    public Long getStudentIdToDelete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToDelete'");
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }
    
}
