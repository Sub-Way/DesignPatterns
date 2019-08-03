/* 2013112015 임진섭 */

package ProtoType_TEST;

public interface Product extends Cloneable{
	String use(String s);
	Product createClone();
}