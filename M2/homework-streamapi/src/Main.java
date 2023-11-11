import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Juan", "26", "programar"));
        people.add(new Person("David", "26", "programar"));
        people.add(new Person("Camilo", "1", "programar"));
        people.add(new Person("Sebastian", "25", "comer"));
        people.add(new Person("Julian", "23", "juagar"));
        people.add(new Person("Natalia", "25", "diseñar"));
        people.add(new Person("Andres", "16", "jugar"));


        System.out.println("Punto A:");
        List<Person> filteredPeople = people.stream().filter(person -> Integer.parseInt(person.getAge()) > 18 && person.getHobby().contains("programar")).toList();
        System.out.println(filteredPeople);
        System.out.println("---------------------------------");

        System.out.println("Punto B:");
        List<String> name_of_people = people.stream().map(Person::getName).toList();
        System.out.println(name_of_people);
        System.out.println("---------------------------------");

        System.out.println("Punto C:");
        System.out.println(people.stream().limit(3).toList());
        System.out.println("---------------------------------");

        System.out.println("Punto D:");
        people.forEach(person -> System.out.println(person.getName()));
    }
}