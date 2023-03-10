package Sort;

import Person.Person;

import java.util.Comparator;

public class sortByDate implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getBirthdate().isAfter(o1.getBirthdate())) {
            return 1;
        } else if (o1.getBirthdate().isBefore(o2.getBirthdate())) {
            return -1;
        } else return 0;
    }
}
