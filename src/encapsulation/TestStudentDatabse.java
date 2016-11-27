package encapsulation;

public class TestStudentDatabse {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setStudentID(101);
		st1.setStudentName("Salma");
		st1.setStudentSSN("108-89-7643");
		st1.setStudentDOB("12-05-1992");
		
		System.out.println(st1.getStudentID()+ " " + st1.getStudentName()+ " "+ st1.getStudentSSN()+" "+st1.getStudentDOB());
		
		Student st2 = new Student();
		st2.setStudentID(102);
		st2.setStudentName("Bob");
		st2.setStudentSSN("106-76-3267");
		st2.setStudentDOB("11-25-1995");
		
		System.out.println(st2.getStudentID()+ " " + st2.getStudentName()+ " "+ st2.getStudentSSN()+" "+st2.getStudentDOB());
		
	}

}
