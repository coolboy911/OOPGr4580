package Controllers;

import Services.TeacherService;

public class TeacherController implements iPersonController {
    private final TeacherService dataService = new TeacherService();

    //Метод регистрации Учителя в базе данных
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName, age);
        dataService.sortByFIOteacherLst();
    }
    
}
