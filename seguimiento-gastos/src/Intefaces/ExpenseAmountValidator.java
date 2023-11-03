package Intefaces;

import Exceptions.InvalidExpenseException;

@FunctionalInterface
public interface ExpenseAmountValidator {
    boolean validateAmount(double amount) throws InvalidExpenseException;
}
