package View;

import java.util.List;
import Model.Student;
// унаследование от View Потому что нужно переписать только 1 метод, остально оставим
public class ViewEng extends View {
    
    @Override
    public void printAllStudents(List<Student> students)
    {
        System.out.println("------Student List--------");  // the only difference from rus version
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }
    
}
