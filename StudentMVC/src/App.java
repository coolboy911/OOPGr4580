import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HashModel;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 111);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        ModelFile fModel = new ModelFile("StudentDB.txt");
        // fModel.saveAllStudentToFile(students);  // сохраняет список студентов в файл.txt

        iGetModel modelFile = fModel;
        iGetModel model = new ModelList(students);
        iGetModel modelHashMap = new HashModel(students); // подключение к контроллеру HashMap базы
        // iGetView view = new View();
        iGetView view = new ViewEng();  // подключили к контроллеру английскую версию
        
        // подключение модели и View в контроллер
        Controller control = new Controller(model, view);

        // control.update();
        control.run();

    }
}
