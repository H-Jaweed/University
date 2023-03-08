package Service;

import Person.Person;
public interface Service {

    void add(Person person);

    void showAll(Person person);

    void deleteByID(Person person);

    void searchByID(Person person);
}
