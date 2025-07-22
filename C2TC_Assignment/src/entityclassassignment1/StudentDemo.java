package entityclassassignment1;

public class StudentDemo {

	public static void main(String[] args) {
		Student st = new Student();
		
		st.setRollNo(101);
		st.setName("Riya");
		st.setAge(15);
		st.setCity("Pune");
		
		System.out.println(st);
		
		Student st1 = new Student();
		
		st1.setRollNo(102);
		st1.setName("Uday");
		st1.setAge(16);
		st1.setCity("Yanam");
		
		System.out.println(st1);
		
		Student st2 = new Student();
		
		st2.setRollNo(103);
		st2.setName("Baby");
		st2.setAge(14);
		st2.setCity("Paris");
		
		System.out.println(st2);


	}

}
