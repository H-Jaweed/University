package Service;

import Person.Person;
import Person.Student;
import Person.Teacher;
import csvFiles.Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShowAllPersonService {
    private static void readDataFromFile(String path) {
        FileReader reader = null;
        String dataLine = "";
        try {
            reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while ((dataLine = bufferedReader.readLine()) != null) {
                System.out.println(dataLine.replace(',', ' '));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Runtime error");
        }
    }

    public static void showPerson(String persomType) {
        Person person = PersonFactory.getPerson(persomType);
        if (person instanceof Student) {
            readDataFromFile(Data.studentPath);
        } else if (person instanceof Teacher) {
            readDataFromFile(Data.teacherPath);
        }
        System.out.println();
    }
}
