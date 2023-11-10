import java.util.List;
import java.util.function.Predicate;

public interface Filter {
    List<Student> filter(List<Student> students, Predicate<Student> predicate);
    List<Course> coursesFromAStudent(List<Student> students, String name);
}
