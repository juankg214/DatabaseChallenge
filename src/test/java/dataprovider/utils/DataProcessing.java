package dataprovider.utils;

import utils.EmployeeBuilder;

import java.util.Date;

public class DataProcessing {

    public static int getInteger(Object data){
        return Integer.parseInt(data.toString().trim());
    }

    public static Object[][] buildEmployees(Object[][] data){
        int size = data.length;
        Object[][] employees = new Object[size][];
        for(int i =0; i<size;i++){
            employees[i] = new Object[1];
            employees[i][0] = new EmployeeBuilder(getInteger(data[i][0]))
                    .withFirstName(data[i][1].toString())
                    .withLastName(data[i][2].toString())
                    .withEmail(data[i][3].toString())
                    .withAddress(data[i][4].toString())
                    .withPhoneNumber(data[i][5].toString())
                    .withSalary(getInteger(data[i][6]))
                    .withBirthDate(new Date())
                    .withIdCompany(getInteger(data[i][8]))
                    .withIdInstitution(getInteger(data[i][9]))
                    .build();
        }
        return employees;
    }

}
