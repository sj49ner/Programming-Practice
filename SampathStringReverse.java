//reverse a string
import java.util.Scanner;

public class SampathStringReverse {

	public static void main(String[] args) {
		String input, reversed="";
		int i,count;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		input=in.nextLine();
		count=input.length();
		
		for (i=count-1; i>=0; i--){
			reversed=reversed+input.charAt(i);
		}
		System.out.println(reversed);
		
	}

}
