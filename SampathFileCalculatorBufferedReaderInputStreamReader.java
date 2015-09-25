//BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SampathFileCalculatorBufferedReaderInputStreamReader {

	public static void main(String[] args) throws Exception {
		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(istream);
		
		System.out.println("Enter first number: ");
		String num1 = br.readLine();
		System.out.println("Enter second number: ");
		String num2 = br.readLine();
		
		int firstNum = Integer.parseInt(num1);
		int secondNum = Integer.parseInt(num2);
		
		int answer = firstNum - secondNum;
		
		System.out.println("The answer is: " + answer);
	}

}
