package Service;

import IMPL.Scan;
import Person.Person;
import Person.Student;
import Person.Teacher;
import csvFiles.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeletePersonService {
    private static void delete (String path) {

        int id = Scan.getScannerInt("Enter ID: ");
        try (FileReader reader = new FileReader(path)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                String[] array = str.split(",");
                if (array[0].equals(String.valueOf(id))) {
                    continue;
                }
                try (FileWriter writer = new FileWriter(path)) {
                    writer.write(str);
                }
            }
         bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error occurred");
        }

    }
    public static void deletePerson(String personType) {
        Person person = PersonFactory.getPerson(personType);
        if (person instanceof Student) {
            delete(Data.studentPath);
            System.out.println("Student deleted successfully");
        }
        if (person instanceof Teacher) {
            delete(Data.teacherPath);
            System.out.println("Teacher deleted successfully");
        }
    }
}
