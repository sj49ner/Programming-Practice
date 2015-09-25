import java.util.Scanner;

public class SampathArrayFindCommonNumber {

	public static void main(String[] args) {
		int num,count, numSearch, array[];
		
		Scanner garlic = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		num=garlic.nextInt();
		array = new int[num];
		
		System.out.println("Please enter " + num + " intergers");
		
		for (count=0; count<num; count++)
			array[count]=garlic.nextInt();
		
		System.out.println("Enter the number to compare: ");
		numSearch= garlic.nextInt();
		 
		for(count=0; count<num; count++){
			if(numSearch==array[count]){
				System.out.println(numSearch + " is locate " + (count+1) +".");
				break;
			}
		}
	}

}
