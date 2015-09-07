import java.util.Scanner;

class SampathLoopsCommandPrompt{
	public static void main(String args[]){
		String text;
		
		Scanner scannedText = new Scanner(System.in);  //Initialize Scanner class
		System.out.println("Please enter your text: ");
		text = scannedText.nextLine();
		System.out.println("Your text is: " + text);
	
	}
}
