//Collection: Copy arraylist to an array
import java.util.*;

public class SampathCollectionCopyArrayListToArray
{
  public static void main(String[] args)
  {
 	List<Integer> list = new ArrayList<Integer>();
    
    list.add(3);
    list.add(6);
    list.add(9);
    
    Integer tempArray[] = new Integer[list.size()];
    tempArray = list.toArray(tempArray);
    
    System.out.println(tempArray[0]);
    System.out.println(tempArray[1]);
    System.out.println(tempArray[2]);


  }
}
