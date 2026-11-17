package prog1;

public class callfunction {
	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40;
		add(a);
		add(a,b);
		add(a,b,c);
		add(a,b,c,d);
	}
	static void add(int a) {
		System.out.println(a);
	}
	static void add(int a,int b) {
		System.out.println(a+b);
	}
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	static void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
}
