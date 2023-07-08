package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "Group{Group ID: " + this.idGroup
                + " | Group Count: " + this.group.size()
                + " | List of Students: \n" + this.group + "}";
    }

    @Override  // определение итератора
    public Iterator<Student> iterator() {
       return new Iterator<Student>() {

        private int counter;

        @Override
        public boolean hasNext() {
            return counter<group.size();           
        }

        @Override
        public Student next() {            
            return group.get(counter++);
        }
       };
    }

    @Override  //сортировка по количеству студентов, а затем по идентификатору группы
    public int compareTo(StudentGroup o) {
        if (this.group.size() == o.group.size()) {
            return Integer.compare(this.idGroup, o.idGroup);
        }
        return Integer.compare(this.group.size(), o.group.size());
    }
}
