//sort an array
import java.util.Arrays;

public class SampathArraySortArrayList {

	public static void main(String[] args) {
		int[] arrayNum;
		arrayNum = new int[3];
		
		arrayNum[0]=3;
		arrayNum[1]=2;
		arrayNum[2]=1;
		
		Arrays.sort(arrayNum);
		
		for (int i=0; i<arrayNum.length; i++){
			System.out.println(arrayNum[i]);
		}
	}

}
