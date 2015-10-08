//Collection: takes an input series as a1,a2,a3....an,b1,b2,b3...bn and 
//  produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
import java.util.Arrays;

public class SampathCollectionA1A2B1B2BecomeA1B1A2B2 {
    public static void main(String[] args) {
        String[] inputString = { "a1", "a2", "a3", "a4", "a5", 
            "b1", "b2", "b3", "b4", "b5"};
        String[] outputString = new String[inputString.length];
        for (int i = 0; i < inputString.length / 2; i++) {
            outputString[i * 2] = inputString[i];
            outputString[i * 2 + 1] = inputString[i + inputString.length / 2];
        }

        System.out.println(Arrays.toString(inputString));
        System.out.println(Arrays.toString(outputString));
    }
}
