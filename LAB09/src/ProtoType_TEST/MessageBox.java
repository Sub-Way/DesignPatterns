/* 2013112015 ¿”¡¯º∑ */

package ProtoType_TEST;

public class MessageBox implements Product {
	private String st;

	public MessageBox(String deco) {
		this.st = deco;
	}

	@Override
	public String use(String s) {
		return st + s + st;
	}

	@Override
	public Product createClone() {
		Product product = null;
		try {
			product = (Product)clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return product;
	}
}