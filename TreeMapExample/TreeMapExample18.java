package TreeMapExample;

import java.util.NavigableSet;
import java.util.TreeMap;

/*
 * Example of firstKey() method.
 */
public class TreeMapExample18 {
	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(10, "Cat");
		treeMap.put(50, "Dog");
		treeMap.put(30, "Apple");
		treeMap.put(40, "Ball");
		treeMap.put(20, "Ball");

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Returns the first (lowest) key currently in this map.
		 */
		Integer firstKey = treeMap.firstKey();
		System.out.println("firstKey : " + firstKey);

		/*
		 * Returns the last (highest) key currently in this map.
		 */
		Integer lastKey = treeMap.lastKey();
		System.out.println("lastKey : " + lastKey);

		/*
		 * Returns the least key greater than or equal to the given key, or null
		 * if there is no such key.
		 */
		Integer key = treeMap.ceilingKey(24);
		System.out.println("ceilingKey(24) : " + key);

		key = treeMap.ceilingKey(20);
		System.out.println("ceilingKey(20) : " + key);

		key = treeMap.ceilingKey(54);
		System.out.println("ceilingKey(54) : " + key);

		/*
		 * Returns the greatest key less than or equal to the given key, or null
		 * if there is no such key.
		 */
		key = treeMap.floorKey(24);
		System.out.println("floorKey(24) : " + key);

		key = treeMap.floorKey(30);
		System.out.println("floorKey(30) : " + key);

		key = treeMap.floorKey(8);
		System.out.println("floorKey(8) : " + key);

		/*
		 * Returns a reverse order NavigableSet view of the keys contained in
		 * this map. The set's iterator returns the keys in descending order.
		 * The set is backed by the map, so changes to the map are reflected in
		 * the set, and vice-versa.
		 * 
		 * If the map is modified while an iteration over the set is in progress
		 * (except through the iterator's own remove operation), the results of
		 * the iteration are undefined. The set supports element removal, which
		 * removes the corresponding mapping from the map, via the
		 * Iterator.remove, Set.remove, removeAll, retainAll, and clear
		 * operations. It does not support the add or addAll operations.
		 */
		NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();

		System.out.println("navigableSet : " + navigableSet + "\n");

		for (Integer key1 : navigableSet) {
			System.out.println(key1);
		}

	}
}