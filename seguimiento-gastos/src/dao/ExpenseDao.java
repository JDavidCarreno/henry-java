package dao;

import Entities.Expense;
import dao.dto.ExpenseDto;

public interface ExpenseDao extends CRUD<Expense, Integer, ExpenseDto>{
}
