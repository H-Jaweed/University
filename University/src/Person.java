import java.time.LocalDate;

public class Person {
    private int ID = 1;
    private String name;
    private String surname;




    private LocalDate birthdate;
    public Person(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        return ID++;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
