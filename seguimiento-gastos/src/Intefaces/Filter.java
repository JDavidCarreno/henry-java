package Intefaces;

import Entities.Expense;

import java.util.List;
import java.util.function.Predicate;

public interface Filter {
    List<Expense> filter(List<Expense> expenses, Predicate<Expense> predicate);
}
