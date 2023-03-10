package IMPL;

import Service.AddPersonService;
import Service.DeletePersonService;
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
                    AddPersonService.addPerson("Teacher");
                    break;
                case 2:
                    AddPersonService.addPerson("Student");
                    break;
                case 3:
                    ShowAllPersonService.showPerson("Teacher");
                    break;
                case 4:
                    ShowAllPersonService.showPerson("Student");
                    break;
                case 5:
                    SearchPersonService.searchPerson("Teacher");
                    break;
                case 6:
                    SearchPersonService.searchPerson("Student");
                    break;
                case 7:
                    DeletePersonService.deletePerson("Teacher");
                    break;
                case 8:
                    DeletePersonService.deletePerson("Student");
                    break;
                case 9:
                    exit = false;
                    break;
                default:
                    System.out.println("Wrong operator!!!");
            }
        }
    }
}/*
ID, Name,Surname,Birthday,Subject
        226,Ismayil,Azizov,1995-05-14,Java Practic
        223,Ulvi,Aghajanov,1988-01-12,Java Theory*/