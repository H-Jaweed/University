package Person;

import java.time.LocalDate;


public class Teacher extends Person {
    public Teacher() {
        super();
    }

    private String subject;

    public Teacher(String name, String surname, LocalDate birthdate, String subject) {
        super(name, surname, birthdate);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "\nID: " + this.hashCode() + " Name: " + this.getName() + " Surname: " + this.getSurName()
                + " BirthDate: " + getBirthdate() + " Subject: " + subject;
    }
}
