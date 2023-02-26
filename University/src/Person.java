import java.time.LocalDate;

public class Person {
    private int ID = 1;
    private String name;
    private String surName;
    private final LocalDate birthdate;

    public Person(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surName = surname;
        this.birthdate = birthdate;
    }

    public int getID() {
        return ID;
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
    public int hashCode() {
        return ID++;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public String toString() {
        return "ID: " + ID + " Name: " + name + " Surname: " + surName + "BirthDate: " + birthdate;
    }
}
