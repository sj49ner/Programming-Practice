//check for a palindrome string
import java.util.*;
public class SampathStringIsItAPalindrome {

	public static void main(String[] args) {
		int x, y, sum;
		
		Scanner myscan = new Scanner(System.in);
		
		System.out.print("Enter 1st integer number: ");
		x=myscan.nextInt();
		
		System.out.print("Enter 2nd integer number: ");
		y=myscan.nextInt();
		
		sum = x + y;
		
		System.out.println("The sum is: " + sum);
	}

}
