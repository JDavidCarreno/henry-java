package dao.impl;

import Entities.Expense;
import config.JdbcConfig;
import dao.ExpenseDao;
import dao.dto.ExpenseDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDaoImpl implements ExpenseDao {
    private final Connection connection;

    public ExpenseDaoImpl() {
        this.connection = JdbcConfig.getConnectionDB();
    }

    @Override
    public void create(ExpenseDto expenseDto) {
        try {
            Expense expense = new Expense();
            expense.setAmount(expenseDto.getAmount());
            expense.setDate(expenseDto.getDate());
            expense.setCategory(expenseDto.getCategoryId());
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO expense (amount, expensecategoryid, date) VALUES (?, ?, ?)");
            preparedStatement.setDouble(1, expense.getAmount());
            preparedStatement.setInt(2, expense.getCategoryId());
            preparedStatement.setString(3, expense.getDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ExpenseDto> getAll() {
        List<ExpenseDto> expenseDtoList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM expense");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Double amount = resultSet.getDouble("amount");
                Integer categoryId = resultSet.getInt("expensecategoryid");
                String date = resultSet.getString("date");
                ExpenseDto newExpenseDto = new ExpenseDto(amount, categoryId,date);
                expenseDtoList.add(newExpenseDto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return expenseDtoList;
    }

    @Override
    public void update(Expense expense) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "UPDATE expense SET amount = ?, expensecategoryid = ?, date = ? WHERE id = ?");
            preparedStatement.setDouble(1, expense.getAmount());
            preparedStatement.setInt(2, expense.getCategoryId());
            preparedStatement.setString(3, expense.getDate());
            preparedStatement.setInt(4, expense.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer integer) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM expense WHERE id = ?");
            preparedStatement.setInt(1, integer);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
