package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.ModelList;
import Model.Student;
import View.View;

public class Controller {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students)
    {
        return students.size()>0;
    }

    public void update()
    {
        //MVP
        students = model.getAllStudents();
        if(testData(students))
        {
           view.printAllStudents(students);
        }
        else
        {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите номер студента, которого хотите удалить:");
                    if (iScanner.hasNextInt()) {
                        int studNum = iScanner.nextInt();
                        model.removeStudent(studNum);
                    }
                    else {
                        System.out.println("Вы ввели не цифру, выход в главное меню");
                    }
                    break;
            }

        }
    }

    
}
