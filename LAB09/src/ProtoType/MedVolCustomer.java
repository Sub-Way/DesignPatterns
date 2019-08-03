/* 2013112015 ÀÓÁø¼· */

package ProtoType;

class MedVolCustomer extends Customer implements Cloneable
{

	public MedVolCustomer(){
		super();
	}

	public MedVolCustomer( String c_name ) {
		super( c_name );
	}

	public Object clone(){
		return new MedVolCustomer( e_name );
	}

	public String getpick_type(){
		return "Medium volume";
	}

}