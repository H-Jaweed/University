public class Implement {
    public static void ImplementProject() {


        Student student = new Student();
        Teacher teacher = new Teacher();
        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();
        teacherService.addByDefaultStuden();

        boolean exit = true;

        while (exit) {
            Menu.mainMenu();
            int selectedMenu = Scan.getScannerInt("Choose menu: ");
            switch (selectedMenu) {
                case 1:
                    studentService.add(student);
                    break;
                case 2:
                    teacherService.add(teacher);
                    break;
                case 3:
                    teacherService.showAll(teacher);
                    break;
                case 4:
                    studentService.showAll(student);
                    break;
                case 5:
                    studentService.searchByID(teacher);
                    break;
                case 6:
                    teacherService.searchByID(student);
                    break;
                case 7:
                    studentService.deleteByID(student);
                    break;
                case 8:
                    teacherService.deleteByID(teacher);
                    break;
                case 9:
                    break;
                case 10:
                    Menu.sortedMenu();
                    int sortTypeMenu = Scan.getScannerInt("Choose sort type: ");
                    switch (sortTypeMenu) {
                        case 1:

                            break;
                        case 2:
                            System.out.println("Menu2");
                            break;
                        default:
                            System.out.println("Wrong operator!!!");
                            break;
                    }
                case 11:
                    exit = false;
                    break;
                default:
                    System.out.println("Wrong operator!!!");
            }
        }
    }
}
