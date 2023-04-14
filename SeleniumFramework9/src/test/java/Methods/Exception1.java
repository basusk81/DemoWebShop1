package Methods;

import java.io.IOException;

public class Exception1 {

	public static void main(String[] args) throws IOException {
		math2();
		math1();

	}

	public static void math1() throws IOException {
			System.out.println("Math1 Function started");
			int i;
			i = 1/0;
			System.out.println("Result is:" +i);

	}
	
	public static void math2() {
		try{
			System.out.println("Math2 Function started");
			int j;
			j = 1/0;
			System.out.println("Result is:" +j);
		}
		catch(Exception e) {
			System.out.println("Code Error due to Math 2 Function");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}

}
