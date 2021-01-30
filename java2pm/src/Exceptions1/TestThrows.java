package Exceptions1;

import java.sql.SQLException;
import java.util.Scanner;


public class TestThrows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = sc.nextInt();
		System.out.println("enter num2");
		int num2 = sc.nextInt();

		int output = 0;
		try {
			output = m2(num1, num2);
		} catch (SQLException e) {
			System.out.println("invalid input");
			System.out.println(e.getMessage());
		}
		System.out.println("output = " + output);

	}

	private static int m2(int num1, int num2) throws SQLException {
		System.out.println("entering m2");

		int v = m3(num1, num2);

		System.out.println("exit m2");

		return v;
	}

	private static int m3(int num1, int num2) throws SQLException {
		System.out.println("entering m3");

		int v = m4(num1, num2);

		System.out.println("exit m3");

		return v;
	}

	private static int m4(int num1, int num2) throws SQLException {
		System.out.println("entering m4");
		if (num2 == 0) {
			SQLException ex = new SQLException("num2 cannot be 0");
			throw ex;// control will go the catch block
		}
		System.out.println("exit m4");
		return num1 / num2;
	}
}
 
