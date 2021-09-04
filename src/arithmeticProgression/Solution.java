package arithmeticProgression;

import java.util.Arrays;

public class Solution {

	public static void main (String[] args) {
		
		int [] test1 = {3,5,1};
		int [] test2 = {1,3,5,6,7,8,9,10};
		
		System.out.println("Test 1 is: "+canMakeArithmeticProgression(test1));
		System.out.println("Test 2 is: "+canMakeArithmeticProgression(test2));
		
	}

	private static boolean canMakeArithmeticProgression(int[] array) {
		Arrays.sort(array);
		return hasSameDifference(array);
	}

	private static boolean hasSameDifference(int[] array) {
		
		if (array.length < 2 ) return false;
		else {
			for (int i = 1; i < array.length - 1 ; i++) {
				if (array[i] - array[i-1] != array[i+1] - array[i]) {
					return false;
				}
				if (i==array.length-1) {
					if (array[i] != array[i-1]) {
						return false;
					}
				}
			}
			return true;
		}

	}
	
}
