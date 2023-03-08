package Person;

import java.time.LocalDate;


public abstract class Person {
    private String name;
    private String surName;
    private LocalDate birthdate;

    public Person() {
    }


    public Person(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surName = surname;
        this.birthdate = birthdate;
    }

    @Override
    public int hashCode() {
        int fistNumber = 0, secondNumber = 0;
        for (int i = 0; i < name.length(); i++) {
            fistNumber = name.charAt(i);
        }
        for (int i = 0; i < surName.length(); i++) {
            secondNumber = surName.charAt(i);
        }
        return fistNumber + secondNumber;
    }

    public int getName() {
        return name;
    }


    public String getSurName() {
        return surName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


    public String toString() {
        return " Name: " + name + " Surname: " + surName + "BirthDate: " + birthdate;
    }
}
