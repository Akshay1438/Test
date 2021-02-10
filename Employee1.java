package task;


class name1
{
	String firstname;
	String lastname;
	public name1(String firstname, String lastname)
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override
	public String toString() 
	{
		return "name1 [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}

public class Employee1 {

	public static void main(String[] args) {
		
     name1 NAME=new name1("akshay","kiranigi");
     name1 NAME1=new name1("krishna","tej");
     name1 NAME2=new name1("ravi","tej");
     System.out.println(NAME);
     System.out.println(NAME1);
     System.out.println(NAME2);
	}

}
