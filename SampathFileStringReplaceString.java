import java.io.*;

public class SampathFileStringReplaceString{
    ArrayList<String> lines = new ArrayList<String>();
    String line= null;
    public void printThis(){
        try{
    FileReader fr = new FileReader("C:\\Users\\Jeff\\Desktop\\test1.txt");
    BufferedReader br = new BufferedReader(fr);
    FileWriter fw = new FileWriter("C:\\Users\\Jeff\\Desktop\\test2.txt");
    PrintWriter out = new PrintWriter(fw);
    while((line=br.readLine()) != null) {
        line = line.replace("Warriors", "Sharks");
        lines.add(line);
         
        }
        System.out.println(lines); // It takes string in the argument. But when I provide string, the  blank file being returned. With array I get an error "can not find symbol" 
     
     
        }
    catch(Exception e){}
    }
 
    public static void main(String [] args){
    	SampathFileStringReplaceString tr = new SampathFileStringReplaceString();
            tr.printThis();
        }
}
