import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {

        // создание первой группы
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);  // вывод группы

        for(Student std : group4580)  // вывод учеников группы используя итератор
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());
        // вывод отсортированных учеников по возврасту, потом по ID
        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }

        //создание второй группы
        Student s7 = new Student("Андрей", 22, 103);
        Student s8 = new Student("Данил", 22, 155);
        List<Student> listStud2 = new ArrayList<>(Arrays.asList(s7, s8));
        StudentGroup group4335 = new StudentGroup(listStud2, 4335);

        //cоздание третьей группы
        Student s9 = new Student("Илья", 22, 128);
        Student s10 = new Student("Леонид", 25, 129);
        List<Student> listStud3 = new ArrayList<>(Arrays.asList(s9, s10));
        StudentGroup group4337 = new StudentGroup(listStud3, 4590);

        
        
        //создание потока из трёх групп
        StudentStream stream123 = new StudentStream(
                123, Arrays.asList(group4580, group4335, group4337));

        System.out.println("=====до сортировки потока=====");
        for (StudentGroup studentGroup : stream123) {
            System.out.println(studentGroup);
        }
        
        System.out.println("=====после сортировки потока=====");
        Collections.sort(stream123.getStream());
        for (StudentGroup studentGroup : stream123) {
            System.out.println(studentGroup);
        }
        
        System.out.println("=====вывод всего потока с информацией потока=====");
        System.out.println(stream123);
    }
}
