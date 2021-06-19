/**************************************************
 * Purpose : Ability to find frequency of words in a large paragraph phase
 * @author Rosy Rupali
 * @since 14-06-2021
 * @version 1.0
 *
 *************************************************/
package hashmap;

public class Runner {
	public static void main(String[] args) {
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		String str = "Paranoids are not paranoid because they are paranoid but they are keep putting "
				+ "themselves deliberately into paranoid avoidable situations";
		String[] stringArray = str.split(" ");
		for (int i = 0; i < stringArray.length; i++) {
			Integer value = hashMap.get(stringArray[i]);
			value = (value == null) ? Integer.valueOf(1) : value + 1;
			hashMap.add(stringArray[i].toLowerCase(), value);
		}
		hashMap.show();
	}

}
