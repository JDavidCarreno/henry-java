package dao;

import dao.PersonDao;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    @Override
    public List<Person> listAll() {
        List<Person> list = new ArrayList<>();
        Person person = new Person();
        person.setId(1);
        person.setName("Juan");

        list.add(person);

        person = new Person();
        person.setId(2);
        person.setName("David");

        list.add(person);

        return list;
    }

    @Override
    public Person findById() {
        return null;
    }

    @Override
    public void register(Person person) {
        System.out.println("Persona " + person.getName() + " registrada");
    }

    @Override
    public void update(Person person) {
        System.out.println("Persona " + person.getName() + " actualizada");
    }

    @Override
    public void deletePerson(int id) {
        System.out.println("id " + id + " eliminado");
    }
}
