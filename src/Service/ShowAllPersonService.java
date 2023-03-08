package Service;

import Person.Person;
import Person.Student;
import Person.Teacher;

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
                System.out.println( dataLine.replace(',', ' '));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Runtime error");
        }
    }

    public static void showAll(String persomType) {
        Person person = PersonFactory.getPerson(persomType);
        if (person instanceof Student) {
            readDataFromFile("University/src/csvFiles/csvStudent.csv");
        } else if (person instanceof Teacher) {
            readDataFromFile("University/src/csvFiles/csvTeacher.csv");
        }
        System.out.println();
    }
}
