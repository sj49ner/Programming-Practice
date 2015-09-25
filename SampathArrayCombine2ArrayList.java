//merge 2 arrays*****

public class SampathArrayCombine2ArrayList {

	 public static void main(String[] args) {
		    int[] arrayA = {1, 5, 9, 19 };
		    int[] arrayB = { 5, 6, 8, 10, 33, 44};
		    int[] arrayC = new int[10];

		    merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		    for (int i : arrayC) {
		      System.out.println(i);

		    }
		  }

	public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		    int arrayAIndex = 0, arrayBIndex = 0, arrayCIndex = 0;

		    while (arrayAIndex < sizeA && arrayBIndex < sizeB)
		      if (arrayA[arrayAIndex] < arrayB[arrayBIndex])
		        arrayC[arrayCIndex++] = arrayA[arrayAIndex++];
		      else
		        arrayC[arrayCIndex++] = arrayB[arrayBIndex++];

		    while (arrayAIndex < sizeA)
		      arrayC[arrayCIndex++] = arrayA[arrayAIndex++];

		    while (arrayBIndex < sizeB)
		      arrayC[arrayCIndex++] = arrayB[arrayBIndex++];
		  }

}
