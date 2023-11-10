import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterImpl implements Filter {
    @Override
    public List<Student> filter(List<Student> students, Predicate<Student> predicate) {
        List<Student> result = new ArrayList<>();
        students.forEach(student -> {
            if (predicate.test(student)) result.add(student);
        });
        return result;
    }

    @Override
    public List<Course> coursesFromAStudent(List<Student> students, String name) {
        List<Course> result = new ArrayList<>();
        students.forEach(student -> {
            if (student.getName().equals(name)) {
                result.addAll(student.getCourses());
            }
        });
        return result;
    }
}
