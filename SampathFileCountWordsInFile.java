import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampathFileCountWordsInFile {

	public static void main(String[] args) throws IOException {
	       System.out.print ("Words counted: ");       
	       FileReader fr = new FileReader ("C:\\Users\\Jeff\\Desktop\\test1.txt");        
	       BufferedReader br = new BufferedReader (fr);     
	       String line = br.readLine ();
	       int count = 0;
	       while (line != null) {
	          String []parts = line.split(" ");
	          for( String w : parts)
	          {
	            count++;        
	          }
	          line = br.readLine();
	       }         
	       System.out.println(count);
	}

}
