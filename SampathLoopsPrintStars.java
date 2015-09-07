
public class SampathLoopsPrintStars {

	public static void main(String[] args) {
		int row, numberOfStars;
		
		for (row=1; row<=6; row++){
			for(numberOfStars=1; numberOfStars <= row; numberOfStars++){
				System.out.print("*");
			}
			System.out.println();  //goto next line
		}
	}

}
