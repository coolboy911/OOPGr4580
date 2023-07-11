import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.AverageAge;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        //#region
        // // создание первой группы
        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);
        // Student s3 = new Student("Иван", 22, 121);
        // Student s4 = new Student("Игорь",  23, 444);
        // Student s5 = new Student("Даша",  23, 171);
        // Student s6 = new Student("Лена",  23, 104);

        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);

        // StudentGroup group4580 = new StudentGroup(listStud, 4580);
        // System.out.println(group4580);  // вывод группы

        // for(Student std : group4580)  // вывод учеников группы используя итератор
        // {
        //     System.out.println(std);
        // }

        // Collections.sort(group4580.getGroup());
        // // вывод отсортированных учеников по возврасту, потом по ID
        // for(Student std: group4580.getGroup())
        // {
        //     System.out.println(std);
        // }

        // //создание второй группы
        // Student s7 = new Student("Андрей", 22, 103);
        // Student s8 = new Student("Данил", 22, 155);
        // List<Student> listStud2 = new ArrayList<>(Arrays.asList(s7, s8));
        // StudentGroup group4335 = new StudentGroup(listStud2, 4335);

        // //cоздание третьей группы
        // Student s9 = new Student("Илья", 22, 128);
        // Student s10 = new Student("Леонид", 25, 129);
        // List<Student> listStud3 = new ArrayList<>(Arrays.asList(s9, s10));
        // StudentGroup group4337 = new StudentGroup(listStud3, 4590);

        
        
        // //создание потока из трёх групп
        // StudentStream stream123 = new StudentStream(
        //         123, Arrays.asList(group4580, group4335, group4337));

        // System.out.println("=====до сортировки потока=====");
        // for (StudentGroup studentGroup : stream123) {
        //     System.out.println(studentGroup);
        // }
        
        // System.out.println("=====после сортировки потока=====");
        // Collections.sort(stream123.getStream());
        // for (StudentGroup studentGroup : stream123) {
        //     System.out.println(studentGroup);
        // }
        
        // System.out.println("=====вывод всего потока с информацией потока=====");
        // System.out.println(stream123);
        //#endregion

        // следующий семинар
        Student s1 = new Student("Иван", 24, 121);
        Student s2 = new Student("Игорь", 23, 301);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        //comS.compare(s1, t2);
        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        //EmploeeController empControll = new EmploeeController();
        EmploeeController.paySalary(e1);
        //EmploeeController.paySalary(s1);
        //empControll.paySalary(e1);
        //empControll.paySalary(s1);

        // Начало Домашнего Задания
        List<Student> listStud4 = new ArrayList<>(Arrays.asList(s1, s2));
        System.out.println(AverageAge.mean(listStud4));

        List<Teacher> listTeachers = new ArrayList<>(Arrays.asList(t1, t2));
        System.out.println(AverageAge.mean(listTeachers));
    }
}
