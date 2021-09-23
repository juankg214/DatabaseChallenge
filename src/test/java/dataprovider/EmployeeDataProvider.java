package dataprovider;

import dataprovider.utils.DataProcessing;
import org.testng.annotations.DataProvider;
import utils.DataDeliver;
import utils.EmployeeBuilder;

import java.util.Date;


public class EmployeeDataProvider {
    @DataProvider(name = "Employee")
    public Object[][] employees() {
        Object[][] data = DataDeliver.getInstance("src/main/resources/data/data.xlsx").getData("Employee");
        return DataProcessing.buildEmployees(data);
    }

    @DataProvider(name = "UpdateEmployee")
    public Object[][] employeesUpdated() {
        Object[][] data = DataDeliver.getInstance("src/main/resources/data/data.xlsx").getData("UpdateEmployee");
        return DataProcessing.buildEmployees(data);
    }

    @DataProvider(name = "employeesDeleted")
    public Object[][] employeesDeleted() {
        Object[][] data = DataDeliver.getInstance("src/main/resources/data/data.xlsx").getData("EmployeeToDelete");
        return DataProcessing.buildEmployees(data);
    }

    @DataProvider(name = "LastNames")
    public Object[][] lastNames() {
        return DataDeliver.getInstance("src/main/resources/data/data.xlsx").getData("lastNames");
    }
}
