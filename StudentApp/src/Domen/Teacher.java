package Domen;

public class Teacher extends Person{
    private String acadDegree;
    // добавлен id чтобы было проще вызывать учител из списка учителей и присваивать acadDegree
    private int id;
    public Teacher(String firstName, int age, int id, String acadDegree) {
        super(firstName, age);
        this.id = id;
        this.acadDegree = acadDegree;
    }

    // конструктор с id=-1 по умолчанию
    public Teacher(String firstName, int age, String acadDegree) {
        this(firstName, age, -1, acadDegree);
    }

    // добавлен конструктор без поля образования для налаживания с iPersonService который имеет только 2 поля
    public Teacher(String firstName, int age, int id) {
        this(firstName, age, id, "empty");
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }
    public String getAcadDegree() {
        return acadDegree;
    }

    @Override
    public String toString() {
        return "Teacher {age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id 
                + ", acadDegree=" + this.getAcadDegree() + "}";
    }
}
