import java.time.LocalDate;
import java.util.Objects;

public class Student extends Person {

    private int admisionScore;
    private LocalDate admisionDate;

    public Student(String name, String surname, LocalDate birthdate, int admisionScore,LocalDate admisionDate) {
        super(name, surname, birthdate);
        this.admisionDate = admisionDate;
    }
}
