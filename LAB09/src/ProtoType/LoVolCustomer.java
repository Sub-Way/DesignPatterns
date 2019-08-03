/* 2013112015 ¿”¡¯º∑  */

package ProtoType;

class LoVolCustomer extends Customer implements Cloneable
{

	public LoVolCustomer(){
		super();
	}

	public LoVolCustomer( String c_name ) {
		super( c_name );
	}

	public Object clone(){	
		return new LoVolCustomer( e_name );
	}

	public String getpick_type(){
		return "Low volume";
	}

}