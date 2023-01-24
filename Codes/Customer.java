public class Customer{
	private String name;
	private int age;
	private String address;
	private String email;
	private String phonenumber;
	
	public Customer(String name,int age,String address,String email,String phonenumber){
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public Customer(){
	}
	public void setname(String name){
		this.name = name;
	}
	public String getname(){
		return this.name;
	}
	public void setage(int age){
		this.age = age;
	}
	public int getage(){
		return this.age;
	}
	public void setaddress(String address){
		this.address = address;
	}
	public String getaddress(){
		return this.address;
	}
	public void setemail(String email){
		this.email = email;
	}
	public String getemail(){
		return this.email;
	}
	public void setphonenumber(String phonenumber){
		this.phonenumber = phonenumber;
	}
	public String getphonenumber(){
		return this.phonenumber;
	}
	public String SubscriptionFee(){
		return "Nothing defined here";
	}
	public String toString(){
		return this.name+" "+this.age+"Pays"+this.SubscriptionFee();
	}
	
}
	
	
	
	
	
	
		
		
	