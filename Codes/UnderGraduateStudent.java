public class UnderGraduateStudent extends Student {
	private String info;
	public UnderGraduateStudent(int rollNumber, String Name, String Email, String Address, String info) {
		super(rollNumber, Name, Email, Address);
		this.info = info;
    }
	public UnderGraduateStudent(){
	}
	public String getinfo(){
		return info;
	}
	public void setinfo(String info){
		this.info = info;
	}
		public void printdata(){
		System.out.println("The roll no of student is :"+super.getRollNumber());
		System.out.println("The name of the student is :"+super.getName());
		System.out.println("The email of the student is :"+super.getEmail());
		System.out.println("The address of the student is :"+super.getAddress());
		System.out.println("The student is of :"+this.getinfo());
	}
}