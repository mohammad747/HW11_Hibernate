package ir.maktabsharif.model.DAO;


import ir.maktabsharif.BaseDao.BaseDAOImpl;
import ir.maktabsharif.model.Employee.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl extends BaseDAOImpl<Employee> implements EmployeeDAO {

    public EmployeeDAOImpl(SessionFactory factory) {
        super(factory);
    }

    @Override
    protected String getEntityName() {
        return "Employee";
    }


    \    public List<Employee> maxSalaryBaseOnCity(String str){
        Session session = factory.openSession();

        List<Employee> employees = new ArrayList<>();

        employees = session.createQuery("select e.address.city, MAX(salary) from  Employee e where e.address.city =:str")
                .setParameter("str", str)
                .getResultList();


        session.close();

        return employees;
    }

    public List<Employee> findByPostalCode(Long postalCode){
        Session session = factory.openSession();

        List<Employee> employees;

        employees = session.createQuery("from Employee e where e.address.postalCode =:postalCode")
                .setParameter("postalCode", postalCode)
                .getResultList();;

        session.close();

        return employees;
    }

    public List<Employee> findByPhoneNumber(Long phoneNumber){
        Session session = factory.openSession();

        List<Employee> employees;

        employees = session.createQuery("from Employee e where e.phoneNumber.mobileNumber =:phoneNumber")
                .setParameter("phoneNumber", phoneNumber)
                .getResultList();

        session.close();

        return employees;
    }
}
