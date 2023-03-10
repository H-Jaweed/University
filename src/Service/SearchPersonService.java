package Service;

import IMPL.Scan;
import Person.Person;
import Person.Student;
import Person.Teacher;
import csvFiles.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SearchPersonService {
    private static void search (String path) {

            int id = Scan.getScannerInt("Enter ID: ");
            try (FileReader reader = new FileReader(path)) {
                BufferedReader bufferedReader = new BufferedReader(reader);
                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    String[] array = str.split(",");
                    if (array[0].equals(String.valueOf(id))) {
                        System.out.println(str);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error occurred");
            }
    }

    public static void searchPerson(String personType) {
        Person person = PersonFactory.getPerson(personType);
        if (person instanceof Student) {
            search(Data.studentPath);
        }
        if (person instanceof Teacher) {
            search(Data.teacherPath);
        }
        System.out.println();
    }
}
