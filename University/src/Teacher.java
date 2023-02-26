import java.time.LocalDate;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String surname, LocalDate birthdate, String subject) {
        super(name, surname, birthdate);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
