import java.util.Scanner;

public class SampathLoopsPingPongDivison {

	public static void main(String[] args) {
		int x, remain3, remain5;  //variable declaration
		
		Scanner scannedNum = new Scanner(System.in);  //Initialize Scanner class
		
		System.out.println("Please enter a number ");
		x = scannedNum.nextInt();
		
		remain3 = x%3;
		if (remain3==0){
				System.out.print("ping ");
		}

		remain5 = x%5;
		if (remain5==0){
			System.out.print("pong");
		}
		
		
	}

}
