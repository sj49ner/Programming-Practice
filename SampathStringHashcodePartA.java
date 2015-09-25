//hashCode() and equals() methods Part 1/2
public class SampathStringHashcodePartA {

	public static void main(String[] args) {
		Student stud1 = new Student("Yoshi", 1222, 456);
		Student stud2 = new Student("Yoshi", 1222, 456);

		System.out.println(stud1.hashCode());
		System.out.println(stud2.hashCode());

	}
}



