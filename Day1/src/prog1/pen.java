package prog1;

public class pen {
	String col;
	String com;
	float price;

	public pen() {
		System.out.println("constructor");
	}

	public pen(String color, String company, float priceData) {
		this("red", "class");// this call statement
		this.col = color;
		this.com = company;
		this.price = priceData;
		System.out.println("cons with 3 val");
	}

	public pen(String color, String company) {
		this("red");// this call statement
		this.col = color;
		this.com = company;
		System.out.println("cons with 2 val");
	}

	public pen(String color) {
		/* this("red","class",10.0f); Here the recursive error is been formed and the
		block is getting filled through threads*/
		System.out.println("cons with 1 val");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		pen p1 = new pen("red", "class", 10.0f);
		System.out.println(p1.col);
		System.out.println(p1.com);
		System.out.println(p1.price);
	}

}
