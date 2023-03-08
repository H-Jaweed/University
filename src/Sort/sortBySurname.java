package Sort;

import Person.Person;

import java.util.Comparator;


public class sortBySurname implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.toString().compareTo(o2.toString());
    }

}
