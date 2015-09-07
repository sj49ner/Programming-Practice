import java.util.Scanner;

class  {
	public static void main(String args[]){
		int n;
		int count = 0;
		
		Scanner scannedNum = new Scanner(System.in);  //Initialize Scanner class
		System.out.println("Please enter a number ");
		n = scannedNum.nextInt();
		
		for(int i=2; i<n; i++){
			if(n%i==0){
				count = 1;
				break;
			}
		}
		
		if(count ==1){
			System.out.println(n+ " is not a prime number.");
		}
		else{
			System.out.println(n+ " is a prime number.");
		}
		

	}
}
