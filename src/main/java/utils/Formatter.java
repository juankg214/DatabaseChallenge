package utils;

import model.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Formatter {

    private static final Logger logger = LogManager.getLogger(Formatter.class);

    public static void printAllEmployees(List<Employee> employees){
        for(Employee employee : employees){
           printEmployee(employee);
        }
    }

    public static void printEmployee(Employee employee){

        String row =
        getText(employee.getIdEmployee()) +
        getText(employee.getFirstName()) +
        getText(employee.getLastName()) +
        getText(employee.getEmail()) +
        getText(employee.getAddress()) +
        getText(employee.getBirthDate()) +
        getText(employee.getPhoneNumber()) +
        getText(employee.getSalary()) +
        getText(employee.getBirthDate());

        logger.info(row);
    }

    private static String addSeparator(){
         return " - ";
    }

    private static String getText(Object text){
        return text + addSeparator();
    }

}
