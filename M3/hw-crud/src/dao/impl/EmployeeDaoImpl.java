package dao.impl;

import config.JdbcConfig;
import dao.EmployeeDao;
import dao.dto.EmployeeDto;
import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private final Connection connection;

    public EmployeeDaoImpl() {
        this.connection = JdbcConfig.getConnectionDB();
    }

    @Override
    public void createEmployee(EmployeeDto employeeDto) {
        try {
            Employee employee1 = new Employee();
            employee1.setName(employeeDto.getName());
            employee1.setSalary(employeeDto.getSalary());

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO empleadoshomework (name, salary) VALUES(?, ?)");
            preparedStatement.setString(1, employee1.getName());
            preparedStatement.setDouble(2, employee1.getSalary());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<EmployeeDto> getAll() {
        List<EmployeeDto> employeeList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM empleadoshomework");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");

                EmployeeDto employeeDto = new EmployeeDto(name, salary);
                employeeList.add(employeeDto);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return employeeList;
    }

    @Override
    public void updateEmployee(Employee employee) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE empleadoshomework SET name = ?, salary = ? WHERE id = ?");
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setDouble(2, employee.getSalary());
            preparedStatement.setInt(3, employee.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteEmployee(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM empleadoshomework WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
