package utils;

import model.Employee;

import java.util.Date;

public  class EmployeeBuilder{

    private int idEmployee;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private int salary;
    private Date birthDate;
    private int idCompany;
    private int idInstitution;

    public EmployeeBuilder(int idEmployee){
        this.idEmployee = idEmployee;
    }

    public EmployeeBuilder withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public EmployeeBuilder withPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public EmployeeBuilder withAddress(String address){
        this.address = address;
        return this;
    }

    public EmployeeBuilder withSalary(int salary){
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder withBirthDate(Date birthDate){
        this.birthDate = birthDate;
        return this;
    }

    public EmployeeBuilder withIdCompany(int idCompany){
        this.idCompany = idCompany;
        return this;
    }

    public EmployeeBuilder withIdInstitution(int idInstitution){
        this.idInstitution = idInstitution;
        return this;
    }

    public Employee build(){

        Employee employee = new Employee();
        employee.setIdEmployee(idEmployee);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        employee.setPhoneNumber(phoneNumber);
        employee.setAddress(address);
        employee.setSalary(salary);
        employee.setBirthDate(birthDate);
        employee.setIdCompany(idCompany);
        employee.setIdInstitution(idInstitution);

        return employee;
    }



}