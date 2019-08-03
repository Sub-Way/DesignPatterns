/* 2013112015 ¿”¡¯º∑ */

package ProtoType_TEST;

import java.util.HashMap;

public class PrototypeService {
	private HashMap hash = new HashMap<>();
	public void register(String name, Product proto) {
		hash.put(name, proto);
	}

	public Product create(String protoName) {
		return ((Product)hash.get(protoName)).createClone();
	}
}