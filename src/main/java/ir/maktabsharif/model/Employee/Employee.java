package ir.maktabsharif.model.Employee;

import ir.maktabsharif.model.Address.Address;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "employee_code", nullable = false, unique = true)
    private Long employeeCode;

    @Column(name = "salary")
    private Double salary;

    @OneToMany(mappedBy = "employee", cascade = {CascadeType.REMOVE,CascadeType.MERGE, CascadeType.PERSIST})
    private List<Address> address;

    public Employee() {
    }

    public Employee(String name, Long employeeCode, Double salary) {
        this.name = name;
        this.employeeCode = employeeCode;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(Long employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeCode=" + employeeCode +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
