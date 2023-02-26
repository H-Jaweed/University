public class Implement {
    public static void ImplementProject() {

        StudentService studentService = new StudentService();
        boolean exit = true;
        while (exit) {
            Menu.mainMenu();
            int selectedMenu = Scan.getScannerInt("Choose menu: ");
            switch (selectedMenu) {
                case 1:
                    studentService.add();
                    break;
                case 4:
                    Menu.sortedMenu();
                    int sortTypeMenu = Scan.getScannerInt("Choose sort type: ");
                    switch (sortTypeMenu) {
                        case 1:
                            System.out.println("Menu1");
                            break;
                        case 2:
                            System.out.println("Menu2");
                            break;
                        default:
                            System.out.println("Wrong operator!!!");
                            break;
                    }
                    studentService.showAll();

                    break;
                case 11:
                    exit = false;
                    break;
                default:
                    System.out.println("Wrong operator!!!");
            }
        }
    }
}
