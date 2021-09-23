package tests;

import crud.EmployeeCrud;
import dataprovider.EmployeeDataProvider;
import model.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestEmployee extends EmployeeDataProvider {

    private static EmployeeCrud employeeCrud = new EmployeeCrud();

    @Test
    public void getAllEmployees(){
       List<Employee> employees = employeeCrud.getAllEmployees();
       Assert.assertNotNull(employees);
    }

    @Test(dataProvider = "LastNames")
    public void getEmployeesByLastName(String lastName){
        List<Employee> employees =  employeeCrud.getEmployeeByLastName(lastName);
        Assert.assertNotNull(employees);
        for(Employee employee:employees){
            Assert.assertEquals(employee.getLastName(),lastName);
        }
    }

    @Test(dataProvider = "Employee")
    public void insertEmployee(Employee employee){
       Employee employeeDB = employeeCrud.insertEmployee(employee);
       Assert.assertNotNull(employeeDB);
    }

    @Test(dataProvider = "UpdateEmployee")
    public void updateEmployee(Employee employee){
       Employee employeeDB =  employeeCrud.updateEmployee(employee.getIdEmployee(),employee);
       Assert.assertEquals(employeeDB.getFirstName(),employee.getFirstName());
    }

    @Test(dataProvider = "employeesDeleted")
    public void deleteEmployee(Employee employee){
        employeeCrud.insertEmployee(employee);
        boolean deletedComplete = employeeCrud.deleteEmployee(employee.getIdEmployee());
        Assert.assertTrue(deletedComplete);
    }
}
