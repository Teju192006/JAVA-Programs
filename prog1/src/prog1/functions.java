package prog1;

public class functions {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		add();
		add(a,b);
		sum();
		sum(a,b,c);
	}
	static int add(int a,int b) {
		return(a+b);
	}
	static void add() {
		System.out.println(10+20);
	}
	static int sum() {
		return(10+20+30);
	}
	static void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
