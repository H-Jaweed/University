public class Implement {
   static Student student = new Student();
   static Teacher teacher = new Teacher();
   static PersonService personService = new PersonService();

    public static void ImplementProject() {
        PersonService.addByDefaultStuden();
        boolean exit = true;

        while (exit) {
            Menu.mainMenu();
            int selectedMenu = Scan.getScannerInt("Choose menu: ");
            switch (selectedMenu) {
                case 1:
                    personService.add(student);
                    break;
                case 2:
                    personService.add(teacher);
                    break;
                case 3:
                    personService.showAll(teacher);
                    break;
                case 4:
                    personService.showAll(student);
                    break;
                case 5:
                    personService.searchByID(teacher);
                    break;
                case 6:
                    personService.searchByID(student);
                    break;
                case 7:
                    personService.deleteByID(student);
                    break;
                case 8:
                    personService.deleteByID(teacher);
                    break;
                case 9:
                    Menu.sortedTeacherMenu();
                    int sortedTeacherMenuIndex = Scan.getScannerInt("Choose sort type: ");
                    SortedTeacher(sortedTeacherMenuIndex);
                    break;
                case 10:
                    Menu.sortedStudenMenu();
                    int sortedStudentMenuIndex = Scan.getScannerInt("Choose sort type: ");
                    SortedStudent(sortedStudentMenuIndex);
                    break;
                case 11:
                    exit = false;
                    break;
                default:
                    System.out.println("Wrong operator!!!");
            }
        }
    }
    public static void SortedTeacher(int menuIndex) {
        switch (menuIndex) {
            case 1:
                PersonService.teachers.sort(new sortByName());
                personService.showAll(teacher);
                break;
            case 2:
                System.out.println("Menu2");
                break;
            default:
                System.out.println("Wrong operator!!!");
                break;
        }
    }
    public static void SortedStudent(int menuIndex) {
        switch (menuIndex) {
            case 1:
                PersonService.students.sort(new sortByID());
                personService.showAll(student);
                break;
            case 2:
                System.out.println("Menu2");
                break;
            default:
                System.out.println("Wrong operator!!!");
                break;
        }
    }
}
