
public class SampathLoopsSwapNumber {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int retNum = swap1(a);
		a=b;
		b=swap2(retNum);
		
		System.out.println("The a value is now "+ a);
		System.out.println("The b value is now "+ b);

	}

	public static int swap1(int a){
		int temp;
	    temp=a;
	    
		return temp;
	}
	
	public static int swap2(int number){
		int b=number;
		
		return b;
	}
	

}
