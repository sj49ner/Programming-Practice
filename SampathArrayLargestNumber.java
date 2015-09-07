
public class SampathArrayLargestNumber {

	public static void main(String[] args) {
		int number[]={1,3,8,10,4,5,20};
		int temp=number[0];
		
		for(int i=0; i<number.length; i++){
			if(temp<number[i]){
				temp=number[i];
			}
		}
		
		System.out.println("The largest number is: " + temp);
	}

}
