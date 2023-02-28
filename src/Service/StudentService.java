
public class StudentService extends PersonService implements Service {


    @Override
    public void UpdateByID() {

    }

    /*
    List<Student> studentList = new ArrayList<>();
    public void addByDefaultPersons() {
        Student nijat = new Student("Nijat", "Guliyev", 430,LocalDate.of(1994, 5, 15),  LocalDate.of(2015, 1, 20));
        Student fariz = new Student("Fariz", "Hasanov", 418,LocalDate.of(1999, 2, 21),  LocalDate.of(2014, 9, 29));
        Student mehman = new Student("Mehman", "Osmanov", 510,LocalDate.of(1998, 6, 14),  LocalDate.of(2011, 6, 12));
        Student ashraf = new Student("Ashraf", "Shukurlu", 316,LocalDate.of(2001, 1, 30),  LocalDate.of(2016, 11, 19));
        Student ayhan = new Student("Ayhan", "Bakhshiyev", 250,LocalDate.of(1988, 12, 25),  LocalDate.of(2004, 2, 27));
        studentList.add(nijat);
        studentList.add(fariz);
        studentList.add(mehman);
        studentList.add(ashraf);
        studentList.add(ayhan);
    }

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
            studentList.add(new Student(name, surName, admisionScore, birhdate, admisionDate));
        }
        System.out.println();
    }

    @Override
    public void showAll() {
        for (Student st : studentList) {
            System.out.println(st);
        }
        System.out.println();
    }

    @Override
    public void searchByID() {
        int ID = Scan.getScannerInt("Enter ID: ");
        for (Student student : studentList) {
            if (student.hashCode() == ID) {
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void deleteByID() {
        int ID = Scan.getScannerInt("Enter ID: ");
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).hashCode() == ID) {
                studentList.remove(i);
            }
        }
        System.out.println("Student deleted successfully! ");
        System.out.println();
    }

    @Override
    public void UpdateByID() {

    }
*/

}
