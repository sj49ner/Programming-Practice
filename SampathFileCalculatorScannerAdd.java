// Scanner: input 2 number and sum them
import java.util.Scanner;

public class SampathFileCalculatorScannerAdd {

	public static void main(String[] args) {
		int x, y, sum;
		
		Scanner myscan = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		x = myscan.nextInt();
		System.out.print("Enter 2nd number: ");
		y = myscan.nextInt();
		
		sum = x + y;
		
		System.out.println("Sum is: " + sum);
	}
}
	
