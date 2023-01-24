public class Manager{
	public static void main (String []args){
	Employee e1 = new Employee();
	e1.setcode(2388);
	e1.setname("shams");
	e1.setemail("shams@gmail.com");
	e1.setaddress("RawalPindi");
	e1.setshift("Morning");
	
	System.out.println("First Employee");
	System.out.println("employee code: "+e1.getcode());
	System.out.println("employee name: "+e1.getname());
	System.out.println("employee email :"+e1.getemail());
	System.out.println("employee address: "+e1.getaddress());
	System.out.println("employee shift: "+e1.getshift());
	
	}
}