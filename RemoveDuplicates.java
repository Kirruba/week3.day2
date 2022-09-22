package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;

		String[] split = text.split(" ");

		List<String> list = new ArrayList<String>();
		list = Arrays.asList(split);
		//System.out.println(list);

		for (int i = 0; i < list.size() - 1; i++) {

			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
					list.set(j, "");
					// list.get(j).replaceAll(list.get(j), "");
				}
			}
		}
		if (count > 1) {
			for (String eachOne : list) {
				System.out.print(eachOne + " ");
			}
		}
	}

}

/*
 * Pseudo code
 * 
 * a) Use the declared String text as input String text =
 * "We learn java basics as part of java sessions in java week1"; b) Initialize
 * an integer variable as count c) Split the String into array and iterate over
 * it d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. f) if the count > 1 then
 * replace the word as ""
 * 
 * g) Displaying the String without duplicate words
 */
