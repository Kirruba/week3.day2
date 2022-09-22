package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 3, 2, 11, 4, 6, 7 };
		int secondLargestValue = 0;

		Set<Integer> values = new TreeSet<Integer>();
		for (Integer eachItem : data) {
			values.add(eachItem);

		}

		System.out.println("Values in Set: " + values);

		List<Integer> list = new ArrayList<Integer>(values);
		secondLargestValue = list.get(list.size() - 2);

		System.out.println("The Second Largest Value: " + secondLargestValue);
	}

}

/*
 * int[] data = {3,2,11,4,6,7}; Pseudo Code: 1) Arrange the array in ascending
 * order 2) Pick the 2nd element from the last and print it
 */
