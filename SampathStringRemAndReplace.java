
public class SampathStringRemAndReplace {

	public static void main(String[] args) {
		String sampleString = "Let's goto Garlic House Restaurant tonite.";
		
		System.out.println("before: " + sampleString);
		sampleString = sampleString.replaceAll("tonite", "tomorrow");
		System.out.println("after: " + sampleString);
		
		
	}

}
