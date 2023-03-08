package Service;

import Person.Person;
import Person.Student;
import Person.Teacher;

public class PersonFactory {
    public static Person getPerson(String personType) {
        switch (personType) {
            case "Student":
                return new Student();
            case "Teacher":
                return new Teacher();
            default:
                System.err.println("Wrong person type!!!");
                return null;
        }
    }
}
