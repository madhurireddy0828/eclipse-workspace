package HQL;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import Basics.Employee;
import Basics.HibernateUtil;

public class TestCriteriaUserNameEq {
		public static void main(String[] args) {
			Session session = HibernateUtil.getSessionFactory().openSession();

			Criteria empCriteria = session.createCriteria(Employee.class);

			empCriteria.add(Restrictions.eq("userName", "sowmya"));
			// select * from EmployeeDetails where userName ='sowmya'
			
			List<Employee> employees = empCriteria.list();
			for(Employee e  : employees){
				System.out.println(e);
			}
			session.close();
		}

			


}
