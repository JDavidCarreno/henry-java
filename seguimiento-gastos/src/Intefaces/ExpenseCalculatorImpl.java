package Intefaces;

import Entities.Expense;

import java.util.List;

public class ExpenseCalculatorImpl implements ExpenseCalculator {
    @Override
    public double calculateExpense(Expense expense) {
        return expense.getAmount();
    }

    @Override
    public double calculateTotalExpense(List<Expense> expenses) {
        return expenses.stream()
                .mapToDouble(Expense::getAmount)
                .reduce(0, Double::sum);
    }
}
