/* 2013112015 ¿”¡¯º∑ */

package ProtoType;

class HiVolCustomer extends Customer implements Cloneable
{

	public HiVolCustomer(){	
		super();
	}

	public HiVolCustomer( String c_name ) {
		super( c_name );
	}

	public Object clone(){
		return new HiVolCustomer( e_name );
	}

	public String getpick_type(){
		return "High volume";
	}

}