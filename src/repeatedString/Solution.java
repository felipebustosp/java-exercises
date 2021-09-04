package repeatedString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	public static void main(String[] args) {
	
		Map<String,Integer> test = new HashMap<String, Integer>();
		test.put("abcac", 10);
		test.put("aba", 10);
	//	test.put("a", Long.valueOf("1000000000000"));
		
		for (Entry<String, Integer> entry : test.entrySet()) {
			
			String s = entry.getKey();
			int n = entry.getValue();
			System.out.println("s = "+s+" n = "+n+": "+repeatedString(s,n));
		}
		
	}

	/*
 * There is a string s of lowercase English letters that is repeated infinitely many times. 
 * Given an integer n find and print the number of letter a's in the first n letters of the infinite string.
 * */
	private static int repeatedString(String s, int n) {
		int result = 0;
		
		String sComplete = s.repeat(n);
		System.out.println(sComplete);
		result = sComplete.replaceAll("[^a*]", "").length();
		
		return result ;
	}
	
}
