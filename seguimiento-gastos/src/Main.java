import Entities.Expense;
import Entities.ExpenseCategory;
import Exceptions.InvalidExpenseException;
import Intefaces.*;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Expense> list_of_expenses = new ArrayList<>();
    static Map<String, Integer> map_categories = new HashMap<>();

    public static void main(String[] args){
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
                map_categories.forEach((key, value) -> System.out.println(key + " : " + value));
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
        System.out.println("1. Ver detalle de todos los gastos");
        System.out.println("2. Ver total de gastos");
        System.out.println("3. Ver gastos por filtro");
        System.out.println("4. Volver");

        String option2 = scanner.nextLine();

        if(option2.equals("1")){
            if (!list_of_expenses.isEmpty()) {
                Listing<Expense> list = new ListingImpl<>();
                list.listingElements(list_of_expenses);
            } else {
                System.out.println("No hay gastos ingresados aún!");
            }
            return;
        }

        if (option2.equals("2")) {
            ExpenseCalculator expenseCalculator = new ExpenseCalculatorImpl();
            System.out.println("El total de gastos es: " + expenseCalculator.calculateTotalExpense(list_of_expenses));
            return;
        }

        if(option2.equals("3")) {
            menuFilters();
            return;
        }

        if (option2.equals("4")) return;

        System.out.println("Esta opción no es válida");
        watchExpenses();
    }

    public static void menuFilters(){
        System.out.println("FILTROS-------");
        System.out.println("1. Gastos mayores a 100: ");
        System.out.println("2. Volver");

        String option3 = scanner.nextLine();

        if (option3.equals("1")){
            Filter filter = new FilterImpl();
            System.out.println("Los gastos mayores a 100 son:");
            System.out.println(filter.filter(list_of_expenses, expense -> expense.getAmount() > 100));
            return;
        }

        if (option3.equals("2")){
            return;
        }

        System.out.println("Opcion no válida");
        menuFilters();
    }
}