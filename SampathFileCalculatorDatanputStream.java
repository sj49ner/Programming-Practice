import java.io.*;

public class SampathFileCalculatorDatanputStream {

	public static void main(String[] args) 
	throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in); 
		System.out.println("Enter First number: ");
		int a = Integer.parseInt(dis.readLine());
		System.out.println("Enter Second number: ");
		int b = Integer.parseInt(dis.readLine());
		
		int answer = a*b;
		System.out.println("The answer is: " + answer);
	}

}
