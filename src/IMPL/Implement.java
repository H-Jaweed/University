package IMPL;

import Person.Student;
import Person.Teacher;
import Service.AddPersonService;
import Service.SearchPersonService;
import Service.ShowAllPersonService;


public class Implement {
    //static Student student = new Student();
    //static Teacher teacher = new Teacher();
    //  static PersonService personService = new PersonService();

    public static void ImplementProject() {
        // PersonService.addByDefaultStuden();
        boolean exit = true;

        while (exit) {
            Menu.mainMenu();
            int selectedMenu = Scan.getScannerInt("Choose menu: ");
            switch (selectedMenu) {
                case 1:
                    AddPersonService.add("Teacher");
                    break;
                case 2:
                    AddPersonService.add("Student");
                    break;
                case 3:
                    ShowAllPersonService.showAll("Teacher");
                    break;
                case 4:
                    ShowAllPersonService.showAll("Student");
                    break;
                case 5:
                    SearchPersonService.searchPerson("Teacher");
                    break;
                case 6:
                    SearchPersonService.searchPerson("Student");
                    break;
                case 7:
                    //    personService.deleteByID(student);
                    break;
                case 8:
                    //      personService.deleteByID(teacher);
                    break;
                case 9:
                    exit = false;
                    break;
                default:
                    System.out.println("Wrong operator!!!");
            }
        }
    }
}
