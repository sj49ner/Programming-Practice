import java.util.Scanner;

public class SampathLoopsArmstrongNumber {
	
	public static void main(String[] args) {
		int num;
		int check=0;

		
		Scanner scannedNum = new Scanner(System.in);  //Initialize Scanner class
		System.out.println("Please enter a number: ");
		num = scannedNum.nextInt();
		int n=num;
		
		while(num>0){
			int remainder=num%10;
			check=check+(int)Math.pow(remainder,3);
			num=num/10;
		}
		
		if(check==n){
			System.out.println(n + " is a Armstrong number.");
		}
		else{
			System.out.println(n + " is not a Armstrong number.");
		}
	}

}
