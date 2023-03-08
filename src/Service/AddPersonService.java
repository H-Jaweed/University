package Service;

import IMPL.Scan;
import Person.Person;
import Person.Student;
import Person.Teacher;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddPersonService {
    public void writeData(String path, Person person) {

        try {

            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.

        } catch (IOException e) {
            System.out.println("Error!!!");
        }
    }


    public void add(String personType) {
        DateTimeFormatter dateTimeFormatter = null;

        String name = Scan.getScannerString("Enter Name :");
        String surName = Scan.getScannerString("Enter SurName :");
        LocalDate birhdate = LocalDate.parse(Scan.getScannerString("Enter your birh date: "), dateTimeFormatter);
        if (PersonFactory.getPerson(personType) instanceof Student ) {
            int admisionScore = Scan.getScannerInt("Enter your admission score :");
            LocalDate admisionDate = LocalDate.parse(Scan.getScannerString("Enter your admision date: "), dateTimeFormatter);
            Student student = new Student(name, surName, admisionScore, birhdate, admisionDate);
        } else if (PersonFactory.getPerson(personType) instanceof Teacher) {
            String subject = Scan.getScannerString("Enter subject: ");
            Teacher teacher = new Teacher(name, surName, birhdate, subject);
        }

    }
}

