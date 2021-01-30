package JoinTable;



import org.hibernate.Session;

import Basics.HibernateUtil;


public class TestHier2 {


public static void main(String[] args) {
Session s = HibernateUtil.getSessionFactory().openSession();

// create person obj with data
Person2 p = new Person2();
p.setAge(23);
p.setUserName("test1");

// create emp obj with data
Employee2 emp = new Employee2();
emp.setAge(24);
emp.setUserName("test2");
emp.setProjId("pro123");
emp.setDeptId("dept11");

// create student obhj with data
Student2 st = new Student2();
st.setAge(25);
st.setUserName("test3");
st.setBranchId("csc");
st.setSemId("4");

s.getTransaction().begin();

// save objs
s.save(p);// 1 row in person table
s.save(emp);// 1 row in person table + 1 row in emp table
s.save(st);// 1 row in person table and 1 row in student table

s.getTransaction().commit();
s.close();
}
}
	


