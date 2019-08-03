/* 2013112015 ¿”¡¯º∑ */

package ProtoType;

abstract class Customer 
{
	protected String name = "name not assigned yet"; 
	protected String e_name = "e_namenot assigned yet";
	protected String pick_type = "pick_type not assigned yet";

	public Customer(){
		e_name = "default employer name";
	}

	public Customer( String name ){
		e_name = name;
	}

	public abstract Object clone();

	public void print(){	
		System.out.println( "Customer " + name + ", an employee of " + 
				e_name + ".  Spending category: " + getpick_type() + ".  Lots more ...." );
	}

	public abstract String getpick_type();

	public void setName( String aName ){
		name = aName;
	}

}
