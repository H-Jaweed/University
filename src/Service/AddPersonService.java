package Service;

import IMPL.Scan;
import Person.Person;
import Person.Student;
import Person.Teacher;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddPersonService {
    private static void writeStudentData(String path,Student student) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("\n" + student.hashCode() + "," + student.getName() + "," + student.getSurName() + "," + student.getBirthdate() + "," + student.getAdmisionDate() + "," + student.getAdmisionScore());
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Runtime exeption");
        }
    }
    private static void writeTeachertData(String path,Teacher teacher) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("\n" + teacher.hashCode() + "," + teacher.getName() + "," + teacher.getSurName() + "," + teacher.getBirthdate() + "," + teacher.getSubject());
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Runtime exeption");
        }
    }


    public static void add(String personType) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Person person = PersonFactory.getPerson(personType);
        String name = Scan.getScannerString("Enter Name :");
        String surName = Scan.getScannerString("Enter SurName :");
        LocalDate birhdate = LocalDate.parse(Scan.getScannerString("Enter your birh date: "), dateTimeFormatter);
        if (person instanceof Student) {
            int admisionScore = Scan.getScannerInt("Enter your admission score :");
            LocalDate admisionDate = LocalDate.parse(Scan.getScannerString("Enter your admision date: "), dateTimeFormatter);
            Student student = new Student(name, surName, admisionScore, birhdate, admisionDate);
            writeStudentData("University/src/csvFiles/csvStudent.csv",student);
            System.out.println("successful");
        } else if (person instanceof Teacher) {
            String subject = Scan.getScannerString("Enter subject: ");
            Teacher teacher = new Teacher(name, surName, birhdate, subject);
            writeTeachertData("University/src/csvFiles/csvTeacher.csv", teacher);
            System.out.println("successful");
        }
        System.out.println();
    }
}

