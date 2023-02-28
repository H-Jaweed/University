
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PersonService implements Service {
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static List<Student> students = new ArrayList<>();
    public static List<Teacher> teachers = new ArrayList<>();


    public static void  addByDefaultStuden() {
        Student nijat = new Student("Nijat", "Guliyev", 430, LocalDate.of(1994, 5, 15), LocalDate.of(2015, 1, 20));
        Student fariz = new Student("Fariz", "Hasanov", 418, LocalDate.of(1999, 2, 21), LocalDate.of(2014, 9, 29));
        Student mehman = new Student("Mehman", "Osmanov", 510, LocalDate.of(1998, 6, 14), LocalDate.of(2011, 6, 12));
        Student ashraf = new Student("Ashraf", "Shukurlu", 316, LocalDate.of(2001, 1, 30), LocalDate.of(2016, 11, 19));
        Student ayhan = new Student("Ayhan", "Bakhshiyev", 250, LocalDate.of(1988, 12, 25), LocalDate.of(2004, 2, 27));
        students.add(nijat);
        students.add(fariz);
        students.add(mehman);
        students.add(ashraf);
        students.add(ayhan);
        Teacher ismayil = new Teacher("Ismayil", "Azizov", LocalDate.of(1994, 4, 12), "Java practic");
        Teacher ulvu = new Teacher("Ulvu", "Aghacanov", LocalDate.of(1992, 6, 28), "Java theory");
        teachers.add(ismayil);
        teachers.add(ulvu);
    }

    @Override
    public void add(Person person) {
        String name = Scan.getScannerString("Enter Name :");
        String surName = Scan.getScannerString("Enter SurName :");
        LocalDate birhdate = LocalDate.parse(Scan.getScannerString("Enter your birh date: "), dateTimeFormatter);
        if (person instanceof Student) {
            int admisionScore = Scan.getScannerInt("Enter your admission score :");
            LocalDate admisionDate = LocalDate.parse(Scan.getScannerString("Enter your admision date: "), dateTimeFormatter);
            students.add(new Student(name, surName, admisionScore, birhdate, admisionDate));
        } else if (person instanceof Teacher) {
            String subject = Scan.getScannerString("Enter subject: ");
            teachers.add(new Teacher(name, surName, birhdate, subject));
        }
        System.out.println();
    }

    @Override
    public void showAll(Person person) {
        if (person instanceof Student) {
            System.out.println(students.toString());
        } else if (person instanceof Teacher) {
            System.out.println(teachers.toString());
        }
        System.out.println();
    }

    @Override
    public void deleteByID(Person person) {
        int id = Scan.getScannerInt("Enter ID: ");
        if (person instanceof Teacher) {
            for (int i = 0; i < teachers.size(); i++) {
                if (teachers.get(i).hashCode() == id) {
                    teachers.remove(i);
                }
            }
        } else if (person instanceof Student) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).hashCode() == id) {
                    students.remove(i);
                }
            }
        }
    }

    @Override
    public void searchByID(Person person) {
        int id = Scan.getScannerInt("Enter ID: ");
        if (person instanceof Teacher) {
            for (int i = 0; i < teachers.size(); i++) {
                if (teachers.get(i).hashCode() == id) {
                    System.out.println(teachers.get(i));
                }
            }
        } else if (person instanceof Student) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).hashCode() == id) {
                    System.out.println(students.get(i));
                }
            }
        }
        System.out.println();
    }
}
