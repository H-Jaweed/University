package Sort;


import Person.Person;

import java.util.Comparator;

public class sortByID implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.hashCode() > o2.hashCode()) {
            return 1;
        } else if (o1.hashCode() < o2.hashCode()) {
            return -1;
        }
        return 0;
    }
}
