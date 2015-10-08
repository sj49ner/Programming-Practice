//Collection: sort a map by value
import java.util.TreeMap; 

public class SampathCollectionSortMapByValue
{
  public static void main(String[] args)
  {
    TreeMap<Integer, String> employees = new TreeMap<Integer, String>();
    
    employees.put(1, "Joe");
    employees.put(5, "Billy");
    employees.put(3, "Ahmed");
    
    for(Integer i: employees.keySet())
    {
    	System.out.println(employees.get(i));
    }
      
  }
}
