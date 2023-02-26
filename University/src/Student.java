import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private String name;
    private String surName;

    private final int admissionScore;
    private LocalDate birthdate;
    private LocalDate admissionDate;
    private int ID;

    public Student(String name, String surName, int admissionScore, LocalDate birthdate, LocalDate admissionDate) {
        this.name = name;
        this.surName = surName;
        this.admissionScore = admissionScore;
        this.birthdate = birthdate;
        this.admissionDate = admissionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return ID++;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " Name: " + name + " Surname: " + surName + " " +
                "Admission score: " + admissionScore + " Admission date: " + admissionDate;
    }
}
