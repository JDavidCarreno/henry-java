public class Main {
    public static void main(String[] args) {
        primeraParte();
    }

    public static void primeraParte() {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("primera tarea");
        taskManager.addTask("segunda tarea");
        taskManager.addTask("eliminada tarea");

        taskManager.printTaskList();

        taskManager.markTaskAsCompleted(0);
        taskManager.removeTask(2);
        System.out.println("-----LUEGO DE ELIMINAR:");
        taskManager.printTaskList();
    }
}