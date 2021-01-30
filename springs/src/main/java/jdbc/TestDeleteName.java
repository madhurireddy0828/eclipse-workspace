package jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeleteName {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/jdbc/springs.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter name to delete");
		String name = sc.next();

		int status = dao.deleteEmployeeByName(name);
		if (status == 0) {
			System.out.println("delete fail");
		} else {
			System.out.println("delete success");
		}
		System.out.println("rows delete:==" + status);

	}

}