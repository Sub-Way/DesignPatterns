package BuilderPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User.Builder("JINSUB", "LIM")
				.build();
		
		System.out.println(user.getFirstName() + " " +
				user.getLastName() + " " +
				user.getAge() + " " +
				user.getPhone() + " " +
				user.getAddress());
	}
}
