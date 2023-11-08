import java.util.HashMap;
import java.util.Map;

public class StudentRecord {
    private Map<String, Integer> grades;

    public StudentRecord(){
        grades = new HashMap<>();
    }

    public void addStudent(String name, Integer grade) {
        grades.put(name, grade);
        System.out.println("Se agrego");
    }

    public void removeStudent(String name){
        grades.remove(name);
        System.out.println("Se elimino");
    }

    public void getGrade(String name) {
        System.out.println("La nota de " + name + " es de " + grades.get(name));
    }

    public void isStudentInRecord(String name) {
        System.out.println("¿El estudiante " + name + " tiene notas? " + grades.containsKey(name));
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}
