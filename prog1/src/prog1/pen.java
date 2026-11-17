package prog1;

public class pen {
	String col;
	String com;
	float price;
	
	public pen() {
		System.out.println("constructor");
	}
	public pen(String col,String com,float price) {
		System.out.println(col);
		System.out.println(com);
		System.out.println(price);
	}
	public static void main(String[] args) {
		 System.out.println("Main");
		 pen p1=new pen();
		 System.out.println(p1);
		 pen p2=new pen("red","cello",10.0f);
		 System.out.println(p2);
	}

}
