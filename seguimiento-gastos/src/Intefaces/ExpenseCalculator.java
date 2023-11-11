package Intefaces;

import Entities.Expense;

import java.util.List;

public interface ExpenseCalculator {
    double calculateExpense(Expense expense);
    double calculateTotalExpense(List<Expense> expenses);
}
