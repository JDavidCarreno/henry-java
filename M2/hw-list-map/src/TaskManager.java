import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void markTaskAsCompleted(int index) {
        String marked = this.tasks.get(index).concat(" - completed! ");
        this.tasks.set(index, marked);
    }

    public void removeTask(int index){
        this.tasks.remove(index);
    }

    public void printTaskList(){
        int index = 0;
        for (String task : this.tasks) {
            System.out.println(index + ". " + task);
            index++;
        }
    }
}
