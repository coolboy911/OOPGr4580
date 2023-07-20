package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class HashModel implements iGetModel {
    private Map<Long,Student> students;

    // Конструктор который в качестве аргументов принимает СПИСОК студентов 
    // и в качестве ключа использует их положение в листе
    public HashModel(List<Student> students) {
        Long i = (long) 0;
        this.students = new HashMap<Long, Student>();
        for (Student student : students) {
            this.students.put(i++, student);
        }
    }
    
    @Override
    // Кастим хэшмеп обратно в лист, потому что интерфейс это подразумевает
    public List<Student> getAllStudents() {
        List<Student> studentsList = new ArrayList<>();
        for (Map.Entry<Long, Student> student : students.entrySet()) {
            studentsList.add(student.getValue());
        }
        return studentsList;
    }

    @Override
    public void removeStudent(int id) {
        Iterator<Map.Entry<Long, Student>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Long, Student> entry = iterator.next();
            Student student = entry.getValue();
            
            if (student.getId() == id) {
                iterator.remove();
            }
        }
        
    }
    
}
