package Model;

import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i--);  // i-- потому что элементы свдинуться влево, и чтобы не перескочить
            }
        }
    }
}
