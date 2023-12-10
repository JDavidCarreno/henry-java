package dao;

import Entities.ExpenseCategory;
import dao.dto.ExpenseCategoryDto;

public interface ExpenseCategoryDao extends CRUD<ExpenseCategory, Integer, ExpenseCategoryDto>{
    ExpenseCategory getByName(String name);
}
