//Collection: To create a hashmap; 
//To search for a key in the created map and then returns its value
import java.util.HashMap;

public class SampathCollectionHashMap {
  	static HashMap<String, Boolean> map = new HashMap<>();
  
    public static void main(String[] args) {
		map.put("Jack", false);
		map.put("John", true);
      	
      	System.out.println("The value of Jack is: " + map.get("Jack"));

    }
}
