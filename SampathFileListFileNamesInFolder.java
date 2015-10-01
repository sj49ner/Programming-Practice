import java.io.File;

//show list of all file names in a folder

public class SampathFileListFileNamesInFolder {

	public static void main(String[] args) {
		File file = new File("C:/");
		String[] str = file.list();
		for(String string:str){
			System.out.println(string);
		}
	}

}
