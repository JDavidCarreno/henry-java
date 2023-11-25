package dao;

import dao.dto.EmployeeDto;
import model.Employee;

import java.util.List;

public interface EmployeeDao {

    void createEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getAll();

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);

}
