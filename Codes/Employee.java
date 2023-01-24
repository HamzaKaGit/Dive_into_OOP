public class Employee{
	private int code;
	private String name;
	private String email;
	private String address;
	private String shift;
	
	public void setcode(int code){
		this.code = code;
	}
	public void setname(String name){
		this.name = name;
	}
	public void setemail(String email){
		this.email = email;
	}
	public void setaddress(String address){
		this.address = address;
	}
	public void setshift(String shift){
		this.shift = shift;
	}
	//We have made setters.
	
	public int getcode(){
		return this.code;
	}
	public String getname(){
		return this.name;
	}
	public String getemail(){
		return this.email;
	}
	public String getaddress(){
		return this.address;
	}
	public String getshift(){
		return this.shift;
	}
}
	