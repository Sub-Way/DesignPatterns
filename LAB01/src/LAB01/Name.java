package LAB01;
//Basics 3
public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	private String centerName = "";

	public Name(String fName, String mName, String lName) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
	}
	public Name(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}

	public void setFirstName(String fn) {
		firstName = fn;
	}
	public void setMiddleName(String mn) {
		middleName = mn;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}

	public String getFirstName() {return firstName; }
	public String getMiddleName() { return middleName; }
	public String getLastName() {return lastName; }

	public void setCenterName(String cname){
		if(middleName.equals("")&&lastName.equals(""))
			centerName = firstName;
		else if(middleName.equals(""))
			centerName  = firstName +  " " + lastName;
		else
			centerName = firstName + " " + middleName.substring(0, 1) + " " + lastName;
	}

	public String getCenterName(){
		return centerName;
	}
	
	public String getFirstAndLastName() {
		return firstName + " " + lastName;
	}

	public String getLastCommaFirst() {
		return lastName + ", "+ firstName;
	}

	public String getInits() {
		String initial ="";
		if(middleName.equals("")&&lastName.equals(""))
			initial = firstName.substring(0,1);

		else if(middleName.equals(""))
			initial = firstName.substring(0,1) + lastName.substring(0,1);

		else
			initial = firstName.substring(0,1) + middleName.substring(0,1) + lastName.substring(0,1);


		return initial;
	}

}
