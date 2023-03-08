/*
package Service;

import IMPL.Scan;
import Person.Person;
import Person.Student;
import Person.Teacher;
import Sort.*;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class PersonService implements Service {
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static void addByDefaultStuden() {
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


    @Override
    public void showAll(Person person) {
        if (person instanceof Student) {
            sortPersonList(defaultSort(), students);
            System.out.println(students.toString());
        } else if (person instanceof Teacher) {
            sortPersonList(defaultSort(), teachers);
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
                    System.out.println("ID: " + teachers.get(i).getID() + " remove succcessfully!");
                    teachers.remove(i);
                }
            }
        } else if (person instanceof Student) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).hashCode() == id) {
                    System.out.println("ID: " + students.get(i).hashCode() + " remove succcessfully!");
                    students.remove(i);
                }
            }
        } else System.err.println("ID not found!!!");
        System.out.println();
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
        } else System.err.println("ID not found!!!");
        System.out.println();
    }

    public void sortPersonList(Enum sortedEnumList, List<? extends Person> list) {
        if (sortedEnumList.name() == SortType.BYID.name()) {
            list.sort(new sortByID());
        } else if (sortedEnumList.name() == SortType.BYNAME.name()) {
            list.sort(new sortByName());
        } else if (sortedEnumList.name() == SortType.BYSURNAME.name()) {
            list.sort(new sortBySurname());
        } else if (sortedEnumList.name() == SortType.BYDATE.name()) {
            list.sort(new sortByDate());
        }
    }

    public Enum defaultSort() {
        String byDefaultSortValue = null;
        try (FileReader reader = new FileReader("./src/Sort/DefaultSortProp")) {
            Properties properties = new Properties();
            properties.load(reader);
            byDefaultSortValue = properties.getProperty("sortType");
        } catch (Exception exception) {
            System.out.println("File not found!!!");
        }
        return SortType.valueOf(byDefaultSortValue);
    }
}
*/
