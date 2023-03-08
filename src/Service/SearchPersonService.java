package Service;

import IMPL.Scan;
import Person.Person;
import Person.Student;
import Person.Teacher;

import java.util.List;

public class SearchPersonService {
    public static void searchPerson(String personType) {
        Person person = PersonFactory.getPerson(personType);

        if (person instanceof Student) {
            List<String> students = ReadData.readDataFromFile("University/src/csvFiles/csvStudent.csv");
            int id = Scan.getScannerInt("Enter ID: ");
            System.out.println(students.get(0));
            for (int i = 0; i < students.size(); i++) {
                if (students.contains(id)) {
                    System.out.println(students.get(i));
                }
            }
        }

        if (person instanceof Teacher) {
            List<String> students = ReadData.readDataFromFile("University/src/csvFiles/csvTeacher.csv");
            int id = Scan.getScannerInt("Enter ID: ");

        }
    }
}
