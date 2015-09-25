import java.util.Stack;

public class SampathStringIsParenthesisBalance {

	public static void main(String[] args) {
        if(args.length != 0) {
            if(isBalanced(args[0]))
                System.out.println(args[0] + " is balanced");
            else
                System.out.println(args[0] + " is not balanced");
        }	
	}
    public static boolean isBalanced(String in)
    {
        Stack<Character> st = new Stack<Character>();

        for(char chr : in.toCharArray())
        {
            switch(chr) {

                case '{':
                case '(':
                case '[':
                    st.push(chr);
                    break;

                case ']':
                    if(st.isEmpty() || st.pop() != '[') 
                        return false;
                    break;
                case ')':
                    if(st.isEmpty() || st.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(st.isEmpty() || st.pop() != '{')
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
	
	
}
