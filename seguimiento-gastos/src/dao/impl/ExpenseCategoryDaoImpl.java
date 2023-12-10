package dao.impl;

import Entities.ExpenseCategory;
import config.JdbcConfig;
import dao.ExpenseCategoryDao;
import dao.dto.ExpenseCategoryDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ExpenseCategoryDaoImpl implements ExpenseCategoryDao {
    Connection connection;

    public ExpenseCategoryDaoImpl() {
        this.connection = JdbcConfig.getConnectionDB();
    }

    @Override
    public void create(ExpenseCategoryDto expenseCategoryDto) {
        try {
            ExpenseCategory expenseCategory = new ExpenseCategory();
            expenseCategory.setAmount(expenseCategoryDto.getAmount());
            expenseCategory.setName(expenseCategoryDto.getName());
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO expensecategory (name, amount) VALUES (?, 1) ON DUPLICATE KEY UPDATE amount = amount + 1");
            preparedStatement.setString(1, expenseCategory.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ExpenseCategory getByName(String name) {
        ExpenseCategory expenseCategory = new ExpenseCategory();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM expensecategory WHERE name = ?");
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            expenseCategory.setName(resultSet.getString("name"));
            expenseCategory.setId(resultSet.getInt("id"));
            expenseCategory.setAmount(resultSet.getInt("amount"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return expenseCategory;
    }

    @Override
    public List<ExpenseCategoryDto> getAll() {
        return null;
    }

    @Override
    public void update(ExpenseCategory expenseCategory) {

    }

    @Override
    public void delete(Integer integer) {

    }

}
