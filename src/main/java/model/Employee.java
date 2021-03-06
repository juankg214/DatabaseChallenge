package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity(name = "Employee")
@Table(name = "Employee")
public class Employee {



    @Id
    @Column(name = "idEmployee ")
    protected int idEmployee;
    @Column(name = "firstName ")
    protected String firstName;
    @Column(name = "lastName")
    protected String lastName;
    @Column(name = "email")
    protected String email;
    @Column(name = "phoneNumber")
    protected String phoneNumber;
    @Column(name = "address")
    protected String address;
    @Column(name = "Salary")
    protected int salary;
    @Column(name = "birthDate")
    protected Date birthDate;
    @Column(name = "idCompany")
    protected int idCompany;
    @Column(name = "idInstitution")
    protected int idInstitution;



    public Employee(){}


    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public int getIdInstitution() {
        return idInstitution;
    }

    public void setIdInstitution(int idInstitution) {
        this.idInstitution = idInstitution;
    }

}
