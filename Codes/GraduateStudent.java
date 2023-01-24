public class GraduateStudent extends Student {
	private String Thesis;
	public GraduateStudent(int rollNumber, String Name, String Email, String Address, String Thesis) {
		super(rollNumber, Name, Email, Address);
		this.Thesis = Thesis;
	}
	public String getThesis() {
		return Thesis;
	}
	public void setThesis(String thesis) {
		Thesis = thesis;
	}
		public void printdata(){
		System.out.println("The roll no of student is :"+super.getRollNumber());
		System.out.println("The name of the student is :"+super.getName());
		System.out.println("The email of the student is :"+super.getEmail());
		System.out.println("The address of the student is :"+super.getAddress());
		System.out.println("The student is of :"+this.getThesis());
	}
	
}