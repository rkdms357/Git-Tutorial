import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int sum = a + b;
			
			if (a == 0 && b == 0) 
				break;
			System.out.println(sum);
	}
		scanner.close();
	}

}
