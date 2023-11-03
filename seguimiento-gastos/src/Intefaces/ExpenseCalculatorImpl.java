package Intefaces;

import Entities.Expense;

public class ExpenseCalculatorImpl implements ExpenseCalculator {
    @Override
    public double calculateExpense(Expense expense) {
        return expense.getAmount();
    }

    @Override
    public double calculateTotalExpense(Expense[] expenses) {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }
}
