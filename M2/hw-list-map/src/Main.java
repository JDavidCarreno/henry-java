public class Main {
    public static void main(String[] args) {
        //primeraParte();
        //segundaParte();
        terceraParte();
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

    public static void segundaParte(){
        PartyGuestList partyGuestList = new PartyGuestList();
        partyGuestList.addGuest("Juan");
        partyGuestList.addGuest("David");
        partyGuestList.addGuest("Sebastian");
        partyGuestList.addGuest("Camilo");

        partyGuestList.isGuestInList("David");
        partyGuestList.getTotalGuests();

        System.out.println("¿Esta vacia? " + partyGuestList.getGuests().isEmpty());
    }

    public static void terceraParte(){
        StudentRecord studentRecord = new StudentRecord();
        studentRecord.addStudent("Juan", 10);
        studentRecord.addStudent("David", 9);
        studentRecord.addStudent("Camilo", 8);

        studentRecord.isStudentInRecord("Natalia");
        studentRecord.getGrade("Juan");
        studentRecord.removeStudent("Camilo");
        System.out.println("¿Esta el valor de 9? " + studentRecord.getGrades().containsValue(9));

        System.out.println(studentRecord.getGrades().keySet());
    }
}