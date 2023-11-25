import dao.EmployeeDao;
import dao.dto.EmployeeDto;
import dao.impl.EmployeeDaoImpl;
import model.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();

        //EmployeeDto employeeDto = new EmployeeDto("Sebastian", 900);

        //employeeDao.createEmployee(employeeDto);

        //Employee employee = new Employee(2, "Natalia", 1200);

        //employeeDao.updateEmployee(employee);

        employeeDao.deleteEmployee(3);

        List<EmployeeDto> employeeDtosList = employeeDao.getAll();

        employeeDtosList.forEach(e -> {
            System.out.println("Nombre: " + e.getName());
            System.out.println("Salario: " + e.getSalary());
            System.out.println("-----------------------------");
        });
    }
}