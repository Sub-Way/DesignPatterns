/* 2013112015 ¿”¡¯º∑ */

package BuilderPattern;

public class User {
	private final String firstName;    //required
	private final String lastName;    //required
	private final int age;    //optional
	private final String phone;    //optional
	private final String address;    //optional

	public static class Builder {
		private final String firstName;    //required
		private final String lastName; 	  //required
		private int age = 26;    //optional
		private String phone = "";    //optional
		private String address = "";    //optional
		
		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;			
		}
		
		public Builder setAge(int a){
			age = a;
			return this;
		}
		
		public Builder setPhone(String p){
			phone = p;
			return this;
		}
		
		public Builder setAdderss(String ad){
			address = ad;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}

	private User(Builder builder){
		firstName = builder.firstName;
		lastName = builder.lastName;
		age = builder.age;
		phone = builder.phone;
		address = builder.address;
	}
	
	public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
}
