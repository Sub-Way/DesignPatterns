package LAB01;
//Basics 5
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Name n1 = new Name("Jane", "Black");
//		System.out.println(n1.getInits() + " " + n1.getFirstAndLastName());
//		System.out.println(n1.getLastCommaFirst());
//		System.out.println();
//		System.out.println(n1.getCenterName());
//		System.out.println(n1.getInits());
//		
//		CardOrder c1 = new CardOrder(n1.getCenterName());
//		System.out.println(c1.getSampleCard());
		
		Name n2 = new Name("Mary", "Ann", "Smith");
		System.out.println(n2.getInits() + " " + n2.getFirstAndLastName());
		System.out.println(n2.getLastCommaFirst());
		System.out.println();
		System.out.println(n2.getCenterName());
		System.out.println(n2.getInits());
		
		CardOrder c2 = new CardOrder(n2.getCenterName());
		System.out.println(c2.getSampleCard());
		//System.out.println(c2.getInit());
	}

}
