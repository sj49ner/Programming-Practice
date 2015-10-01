import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SampathFileCopyContentToAnotherFile 
{
	public static void main(String[] args) 
	throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\Jeff\\Desktop\\test1.txt");
			FileOutputStream fos=new FileOutputStream("file2.txt");
			int a=fis.read();
			while(a!=-1)
			{
				fos.write(a);
				a=fis.read();
			}
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
