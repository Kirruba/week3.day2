package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i : arr) {

			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}

		}
		System.out.println(map);

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		int maxKey = 0;
		int maxoccurance = 0;

		List<String> list = new ArrayList<String>();
		String maxChar = "";

		for (Entry<Integer, Integer> entry : entrySet) {

			if (entry.getValue() >= maxoccurance) {
				maxKey = entry.getKey();
				maxoccurance = entry.getValue();
				maxChar = maxKey + "-->" + maxoccurance;
				list.add(maxChar);
			}
		}
		System.out.println(maxChar);

	}

}

/*
 * Input array numbers, each occurances
 * 
 * input: {2,3,5,6,3,2,1,4,2,1,6,-1}; output: 2 -> 3 , 3 -> 2, 4 -> 1
 * 
 * Order: Ascending Order
 * 
 */

/*
 * Psuedcode:
 * 
 * 1) Create Map -> TreeMap 2) For loop -> each number -> add to the map 3) If
 * it is exist -> update it with + 1 Else -> new entry with 1 as value
 * 
 */