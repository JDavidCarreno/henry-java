import dao.CRUD;
import dao.PersonDaoImpl;
import model.Person;

public class Main {
    public static void main(String[] args) {
        CRUD<Person> dao = new PersonDaoImpl();
        dao.listAll().forEach(person -> System.out.println(person.getName()));
    }
}