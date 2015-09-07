
public class SampathLoopsFibonacci {

	public static void main(String[] args) {
		int val, pre=0, pos=1;
		
		for(int x=3; x<=10; x++){
			val=pre+pos;
			pre=pos;
			pos=val;
			System.out.println(val);
		}
	}

}
