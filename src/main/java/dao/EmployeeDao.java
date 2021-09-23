package dao;

import database.JPAUtil;
import model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao implements Dao<Employee> {

    private EntityManager entityManager;
    private Employee employee;
    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeDao(){
        entityManager = JPAUtil.getEntityManager().createEntityManager();
    }


    @Override
    public Employee get(int id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    public List<Employee> getAll() {
        Query query = entityManager.createQuery("From Employee ");
        return (List<Employee>) query.getResultList();
    }

    @Override
    public boolean save(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

        return entityManager.contains(employee);
    }

    @Override
    public boolean update(int id, Employee newEmployee) {
        Employee employee = get(id);

        if(employee != null){
            employee.setFirstName(newEmployee.getFirstName());
            employee.setLastName(newEmployee.getLastName());
            employee.setSalary(newEmployee.getSalary());
            employee.setEmail(newEmployee.getEmail());
            employee.setAddress(newEmployee.getAddress());
            employee.setBirthDate(newEmployee.getBirthDate());
            employee.setPhoneNumber(newEmployee.getPhoneNumber());
            employee.setIdInstitution(newEmployee.getIdInstitution());
            employee.setIdCompany(newEmployee.getIdCompany());

            return entityManager.contains(employee);
        }

        return false;
    }

    public List<Employee> findByLastName(String lastName){
        Query query = entityManager.createQuery("From Employee e where lastName = :custLastName")
                .setParameter("custLastName", lastName);

        return (List<Employee>) query.getResultList();
    }

    @Override
    public boolean delete(int id) {
        Employee employee = get(id);
        if(employee != null){
            entityManager.getTransaction().begin();
            entityManager.remove(employee);
            entityManager.getTransaction().commit();
            return true;
        }
        return false;
    }
}
