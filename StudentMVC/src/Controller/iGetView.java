package Controller;

import java.util.List;

import Model.Student;

public interface iGetView {
    // Метод выводит информацию о каждом студенте на консоль
    /**
     * Выводит в консоль список студентов
     * @param students список студентов, который будет выведен
     */
    void printAllStudents(List<Student> students);

    // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
    /**
     * 
     * @param msg сообщение для вывода в консоль
     * @return строка, которую введет пользователь
     */
    String prompt(String msg);

    // Метод для получения id студента, которого нужно удалить.
    Long getStudentIdToDelete();

    // Метод для чтения данных о студенте.
    Student readStudent();

    // Метод для получения id студента, которого пользователь хочет обновить.
    Long getStudentIdToUpdate();
    
}

// import java.util.List;
// import Model.Student;

// /**
//  * Интерфейс для создания блока view в модели MVC
//  */
// public interface iGetView {
//     // Метод выводит информацию о каждом студенте на консоль
//     void printAllStudent(List<Student> students);

//     // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
//     String prompt();

//     // Метод для получения id студента, которого нужно удалить.
//     Long getStudentIdToDelete();

//     // Метод отображает информацию о каждом студенте
//     void displayStudents(List<Student> students);

//     // Метод для чтения данных о студенте.
//     Student readStudent();

//     // Метод для получения id студента, которого пользователь хочет обновить.
//     Long getStudentIdToUpdate();
// }