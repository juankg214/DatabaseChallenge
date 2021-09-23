package crud;

import dao.Dao;
import dao.EmployeeDao;
import model.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.Formatter;

import java.util.List;

public class EmployeeCrud {

    private EmployeeDao employeeDao;
    private static final Logger logger = LogManager.getLogger(EmployeeCrud.class);

    public EmployeeCrud()
    {
        employeeDao = new EmployeeDao();
    }

    public List<Employee> getAllEmployees(){

        logger.info("Getting all employees ...");

        List<Employee> employees = employeeDao.getAll();
        if(employees == null || employees.size() == 0){
            logger.info("No se encontro empleado con el apellido seleccionado");
            return null;
        }
        Formatter.printAllEmployees(employees);
        return employees;
    }

    public Employee getEmployee(int id){
        logger.info("Getting employee by id " + id + " ...");
        Employee employee = employeeDao.get(id);

        if(employee == null ){
            logger.info("No se encontro empleado con el id seleccionado");
            return null;
        }

        return employee;
    }

    public List<Employee> getEmployeeByLastName(String lastName){
        logger.info("Getting employee by last name " + lastName + " ...");
        List<Employee> employees = employeeDao.findByLastName(lastName);

        if(employees == null || employees.size() == 0){
            logger.info("No se encontro empleado con el apellido seleccionado");
            return null;
        }
        Formatter.printAllEmployees(employees);
        return employees;
    }

    public Employee insertEmployee(Employee employee){
        logger.info("Inserting employee ....");
        boolean result = employeeDao.save(employee);
        Employee employeeDB = getEmployee(employee.getIdEmployee());

        if(result){
            logger.info("Employee inserted successfully");
            Formatter.printEmployee(employeeDB);
            return employeeDB;
        }

        System.out.println("Error inserting employee");
        return null;
    }

    public Employee updateEmployee(int id, Employee employee){
        logger.info("Updating employee with id " + id + " ...");

        boolean result = employeeDao.update(id, employee);
        Employee employeeDB = getEmployee(employee.getIdEmployee());

        if(result){
            logger.info("Employee updated successfully");
            Formatter.printEmployee(employeeDB);
            return employeeDB;
        }

        System.out.println("Error updating employee");
        return null;
    }

    public boolean deleteEmployee(int id){
        logger.info("Updating employee with id " + id + " ...");

        boolean result = employeeDao.delete(id);
        if(result){
            logger.info("Registro eliminado ");
            return true;
        }

        logger.info("Ocurrio un error al eliminar el registro");
        return false;
    }
}
