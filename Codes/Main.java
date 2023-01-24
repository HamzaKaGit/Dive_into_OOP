public class Main {
	public static void main(String[] args) {
		UnderGraduateStudent ug1 =new UnderGraduateStudent(20,"Talha", "talha@gmail", "Islamabad", "Full year Project");
		System.out.println("This is undergraduate");
		ug1.printdata();
		
		UnderGraduateStudent ug2 =new UnderGraduateStudent();
		ug2.setRollNumber(29);
		ug2.setName("jack");
		ug2.setEmail("jack@gmail.com");
		ug2.setAddress("paris");
		ug2.printdata(); 
		
		GraduateStudent g1 = new GraduateStudent(35,"Imran","Imran@gmail.com","Rawalpindi","Thesis");
		System.out.println("This is graduate");
		g1.printdata();
		
	}
	
}