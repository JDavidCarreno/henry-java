import Entities.Expense;
import Entities.ExpenseCategory;
import Exceptions.InvalidExpenseException;
import Intefaces.ExpenseAmountValidator;
import Intefaces.ExpenseAmountValidatorImpl;

import java.util.*;

public class Main {
    public static int counter = 1;
    static Scanner scanner = new Scanner(System.in);
    static List<Expense> list_of_expenses = new ArrayList<>();
    static Map<String, Integer> map_categories = new HashMap<>();

    //REVISAR EXCEPTIONS
    public static void main(String[] args) throws InvalidExpenseException {
        menu();
    }

    public static void menu(){
        while (true){
            System.out.println("----MENU APP EXPENSES----");
            System.out.println("1. Ingresar un gasto");
            System.out.println("2. Ver gastos");
            System.out.println("3. Ver categorias");
            System.out.println("4. Salir");
            System.out.print("Dijite el número de la acción que quiere realizar: ");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                createExpense();
                scanner.nextLine();
                continue;
            }

            if (option.equals("2")){
                watchExpenses();
                continue;
            }

            if (option.equals("3")){
                for (Map.Entry<String, Integer> entry : map_categories.entrySet()) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    System.out.println(key + " : " + value);
                }
                continue;
            }

            if (option.equals("4")) {
                break;
            }

            System.out.println("Opcion incorrecta, dijite 1, 2 o 3");
        }
    }

    public static void createExpense(){
        Expense expense = new Expense();
        System.out.print("Ingrese la fecha del gasto: (dd/mm/yyyy): ");
        String date = scanner.nextLine().trim();
        expense.setDate(date);

        System.out.print("Ingrese la categoría del gasto: ");
        ExpenseCategory expenseCategory = new ExpenseCategory();
        String name_category = scanner.nextLine().toLowerCase().trim();
        expenseCategory.setName(name_category);

        expense.setCategory(expenseCategory);

        while (true) {
            try {
                System.out.print("Ingrese el monto a guardar: ");
                Double amount = scanner.nextDouble();
                ExpenseAmountValidator expenseAmountValidator = new ExpenseAmountValidatorImpl();
                expenseAmountValidator.validateAmount(amount);
                expense.setAmount(amount);
                list_of_expenses.add(expense);

                map_categories.put(name_category, (map_categories.containsKey(name_category) ? map_categories.get(name_category) + 1 : 1));

                System.out.println("Gasto guardado exitosamente!");
                break;
            } catch (InvalidExpenseException | InputMismatchException e) {
                System.out.println("Valor inválido, recuerde que debe ser un número mayor a 0, intente de nuevo ");
                scanner.nextLine();
            }
        }

    }

    public static void watchExpenses(){
        if (!list_of_expenses.isEmpty()) {
            for (Expense expense : list_of_expenses){
                System.out.println(expense);
            }
        } else {
            System.out.println("No hay gastos ingresados aún!");
        }
    }
}