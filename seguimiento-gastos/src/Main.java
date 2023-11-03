import Entities.Expense;
import Entities.ExpenseCategory;
import Exceptions.InvalidExpenseException;
import Intefaces.ExpenseAmountValidator;
import Intefaces.ExpenseAmountValidatorImpl;
import Intefaces.ExpenseCalculator;
import Intefaces.ExpenseCalculatorImpl;

import java.util.Scanner;

public class Main {
    public static int counter = 1;
    public static void main(String[] args) throws InvalidExpenseException {
        Scanner scanner = new Scanner(System.in);

        boolean isWrongType = false;
        int index = 0;
        Double amount;
        int cantGastosAIngresar = 0;

        ExpenseAmountValidator expenseAmountValidator = new ExpenseAmountValidatorImpl();
        ExpenseCalculator expenseCalculator = new ExpenseCalculatorImpl();

        do {
            System.out.println("Cuantos gastos va a ingresar a registrar: ");
            if (scanner.hasNextInt()) {
                cantGastosAIngresar = scanner.nextInt();
            } else {
                System.out.println("Dato erroneo");
            }
        } while (isWrongType);

        Expense[] arrayExpenses = new Expense[cantGastosAIngresar];

        do {
            Expense expense = new Expense();
            ExpenseCategory expenseCategory = new ExpenseCategory();
            System.out.println("Ingresa el valor del gasto: ");
            amount = scanner.nextDouble();

            if (!expenseAmountValidator.validateAmount(amount)) {
                System.out.println("Monto válido");
            }

            scanner.nextLine();

            System.out.println("Ingrese la categoria del gasto: ");
            String name = scanner.nextLine().toLowerCase().trim();
            expenseCategory.setName(name);

            System.out.println("Ingrese la fecha del gasto (dd/mm/yyyy)");
            String date = scanner.nextLine().toLowerCase().trim();

            expense.setId(counter);
            expense.setAmount(amount);
            expense.setCategory(expenseCategory);
            expense.setDate(date);

            arrayExpenses[index] = expense;
            counter++;
            index++;
        } while (index < cantGastosAIngresar);

        System.out.println("El total de gastos ingresados fue de: " + expenseCalculator.calculateTotalExpense(arrayExpenses));

        for (Expense expense : arrayExpenses) {
            System.out.println(expense);
        }
    }
}