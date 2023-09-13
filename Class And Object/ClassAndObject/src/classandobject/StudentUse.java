package classandobject;

public class StudentUse {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "naresh";
		s1.rollNo = 55;
		
		
		
		s2.name = "suresh";
		s2.rollNo = 56;
		System.out.println(s1.name + " " + s1.rollNo);
		System.out.println(s2.name + " " + s2.rollNo);
		
	}

}
