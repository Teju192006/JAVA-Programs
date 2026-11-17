package prog1;

public class p1 {

	public static void main(String[] args) {
		int a = 16, i, j, count;
		System.out.println("The Prime no. are:");
		for(i = 5; i <= a; i++) {
			count = 0;
			for(j = 1; j <= i; j++) {
				if((i % j) == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i);
			}
		}
	}
}
