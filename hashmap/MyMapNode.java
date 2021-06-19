/**************************************************
 * Purpose : Hash Map implementation
 * @author Rosy Rupali
 * @since 14-06-2021
 * @version 1.0
 *
 *************************************************/
package hashmap;

public class MyMapNode<K, V> {
	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
