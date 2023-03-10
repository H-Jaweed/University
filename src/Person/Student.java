package Person;
import java.time.LocalDate;


public class Student extends Person {
    public Student() {

    }
    private int admisionScore;
    private LocalDate admisionDate;

    public Student(String name, String surname, int admisionScore, LocalDate birthdate, LocalDate admisionDate) {
        super(name, surname, birthdate);
        this.admisionDate = admisionDate;
        this.admisionScore = admisionScore;
    }

    public int getAdmisionScore() {
        return admisionScore;
    }
    public LocalDate getAdmisionDate() {
        return admisionDate;
    }


    @Override
    public String toString() {
        return "\nID: " + this.hashCode() + " Name: " + super.getName() + " Surname: " + super.getSurName() +
                " BirthDate: " + super.getBirthdate() + " Score: " + this.admisionScore + " Admision Date: " + this.admisionDate;
    }

}