package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		List<Integer> values = new ArrayList<Integer>();
		for (Integer eachOne : arr) {
			values.add(eachOne);

		}
		System.out.println("Values in List before sorting:" + values);
		Collections.sort(values);
		System.out.println("Values in List after sorting:" + values);

		for (Integer i : values) {
			if (values.get(i) != (i + 1)) {
				System.out.println("Missing Element in a List:" + (i + 1));
				break;
			}
		}
	}

}

//Here is the input
// int[] arr = {1,2,3,4,7,6,8};

// Sort the array

// loop through the array (start i from arr[0] till the length of the array)

// check if the iterator variable is not equal to the array values respectively

// print the number

// once printed break the iteration
