import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class StudentService implements Service {
    List<Student> studentList = new ArrayList<>();


    @Override
    public void add() {
        int studentCount = Scan.getScannerInt("Enter the number of students you want to include: ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        while (studentCount-- != 0) {
            String name = Scan.getScannerString("Enter Name :");
            String surName = Scan.getScannerString("Enter SurName :");
            int admisionScore = Scan.getScannerInt("Enter your admission score :");
            LocalDate birhdate = LocalDate.parse(Scan.getScannerString("Enter your birh date: "),dateTimeFormatter);
            LocalDate admisionDate = LocalDate.parse(Scan.getScannerString("Enter your admision date: "), dateTimeFormatter);
            studentList.add(new Student(name, surName, birhdate, admisionScore, admisionDate));
        }
    }

    @Override
    public void showAll() {
        for (Student st : studentList) {
            System.out.println(st);
        }
    }

    @Override
    public void showByID() {

    }

    @Override
    public void deleteByID() {

    }

    @Override
    public void UpdateByID() {

    }




/*

    public void implemenetMenu() {
        while (true) {
            Menu.mainMenu();
            int choice = getScannerInt(ANSI_BLUE + "Enter choice: " + ANSI_RESET);
            System.out.println();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showAllStudent(students);
                    break;
                case 3:
                    searchStudentByIndex(students);
                    break;
                case 4:
                    return;
                default:
                    System.out.println(ANSI_RED+"Wrong operation!!!"+ANSI_RESET);
            }
        }
    }
    private void addStudent() {
        int count = getScannerInt("Enter the number of students you want to include: ");
        for (int i = lastIndexStudent; i <students.length; i++) {
            students[i] = new Student();
            scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            students[i].setName(scanner.nextLine());
            System.out.print("Enter surname: ");
            students[i].setSurName(scanner.nextLine());
            System.out.print("Enter age: ");
            students[i].setAge(scanner.nextInt());
            System.out.println(ANSI_YELLOW + "Student successfully added!" + ANSI_RESET);
            System.out.println();
            lastIndexStudent++;
        }
    }

    private void showAllStudent(Student[] students) {
       if (students.length!=0) {
            for (int i = 0; i < students.length; i++) {
                System.out.println(ANSI_CYAN + i + ") " + students[i].getName() + " " + students[i].getSurName() + " " + students[i].getAge()+" yas" + ANSI_RESET);
            }
        } else System.out.println(ANSI_RED + "Student list is empty!!!" + ANSI_RESET);
        System.out.println();
    }

    private void searchStudentByIndex(Student[] students) {
        if (students.length != 0) {
            int index = getScannerInt("Type the index of the student you want to search: ");
            System.out.println(ANSI_CYAN + students[index].getName() + " " + students[index].getSurName() + " " + students[index].getAge()+" yas" + ANSI_RESET);
        } else System.out.println(ANSI_RED + "Student list is empty!!!" + ANSI_RESET);
        System.out.println();
    }
*/

}
