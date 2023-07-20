package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    /**
     * 
     * @return список всех студентов
     */
    public List<Student> getAllStudents();    

    /**
     * Удаляет студента из БД по ID
     * @param id - ID студента
     */
    public void removeStudent(int id);
}
