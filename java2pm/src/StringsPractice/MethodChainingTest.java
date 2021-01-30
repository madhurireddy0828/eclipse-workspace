package StringsPractice;

public class MethodChainingTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("madhuri").append("reddy").reverse().insert(2,"abc").delete(3,5);	
		System.out.println(sb);
		}

}
