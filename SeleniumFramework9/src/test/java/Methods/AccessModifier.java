package Methods;

public class AccessModifier {
	static int a =0;

	public static void main(String[] args) {
		int a=1;
		System.out.println(a);
		abc();
		def();
		System.out.println(a);

	}
	
	public static void abc() {
		System.out.println(a);
	}
	
	private static void def() {
		System.out.println(a);
		int a = 4;
		System.out.println(a);
	}

}
