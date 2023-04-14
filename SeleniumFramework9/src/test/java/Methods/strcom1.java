package Methods;

import java.util.Scanner;

public class strcom1 {

	public static void main(String[] args) {
		//class and a method
		//it will compare 2 strings and give a boolean response and also print the result
		
		strcmp1();

	}
	
	public static void strcmp1() {
		System.out.println("Enter the First String \n");
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		String str1 = sc1.nextLine();
		
		
		System.out.println("Enter the Second String \n");
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		String str2 = sc2.nextLine();
		
		
		if (str1.equals(str2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		System.out.println("First String is:" +str1);
		
		System.out.println("Second String is:"+str2);
		
	}

}
