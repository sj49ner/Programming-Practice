
public class SampathArrayFindCommonFrom2ArrayList {

	public static void main(String[] args) {
		int[] array1={1,5,8,10};
		int[] array2={5,9,10,4};
		
		for(int i=0; i<array1.length; i++){
			for(int j=0; j<array2.length; j++){
				if(array1[i]==array2[j]){
					System.out.println(array1[i]);
				}
			}
		}
	}

}
