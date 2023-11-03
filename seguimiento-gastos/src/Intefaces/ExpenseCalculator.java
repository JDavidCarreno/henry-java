package Intefaces;

import Entities.Expense;

public interface ExpenseCalculator {
    double calculateExpense(Expense expense);
    double calculateTotalExpense(Expense[] expenses);
}
