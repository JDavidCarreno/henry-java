import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list_students = new ArrayList<>();

        Student student1 = new Student("Juan", 26);
        Student student2 = new Student("Camilo", 22);
        Student student3 = new Student("Sebastian", 25);
        Student student4 = new Student("Natalia", 25);
        Student student5 = new Student("Julian", 23);
        Student student6 = new Student("Alejo", 28);

        list_students.add(student1);
        list_students.add(student2);
        list_students.add(student3);
        list_students.add(student4);
        list_students.add(student5);
        list_students.add(student6);

        Course course1 = new Course("Introducción a la Programación");
        Course course2 = new Course("Introducción a la Seguridad Informática");
        Course course3 = new Course("Introducción al diseño");

        student1.setCourses(course1);
        student1.setCourses(course2);
        //student2.setCourses(course1);
        student2.setCourses(course2);
        student2.setCourses(course3);
        //student3.setCourses(course1);
        student3.setCourses(course3);
        student4.setCourses(course3);
        student5.setCourses(course2);
        student5.setCourses(course3);
        //student6.setCourses(course1);

        Filter filtering = new FilterImpl();

        List<Student> resultSpecificCourse = filtering.filter(list_students, e -> e.getCourses().stream().anyMatch(curso -> curso.getName().equals("Introducción a la Programación")));
        System.out.println("Que ven introduccion a la programacion: ");
        resultSpecificCourse.forEach(student -> System.out.println(student.getName()));

        System.out.println(" ");

        List<Student> resultGreaterThan25 = filtering.filter(list_students, student -> student.getAge() > 25);
        System.out.println("Mayores de 25: ");
        resultGreaterThan25.forEach(student -> System.out.println(student.getName()));

        System.out.println(" ");

        System.out.println("Cursos de Camilo: ");
        filtering.coursesFromAStudent(list_students, "Camilo").forEach(c -> System.out.println(c.getName()));

    }
}