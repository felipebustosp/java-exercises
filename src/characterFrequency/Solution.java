package characterFrequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	
	public static Map<Character,Integer> frequencyMap = new HashMap<Character, Integer>();
	
    public static String frequencySort(String s) {
    	String result = "";
    	for (int i=0;i<s.length();i++) {
    		if (! frequencyMap.containsKey(s.charAt(i))) {
    			frequencyMap.put(s.charAt(i), 1);
    		}
    		else {
    			frequencyMap.put(s.charAt(i), frequencyMap.get(s.charAt(i))+1);
    		}
    	}
    	
    	List <Map.Entry<Character, Integer>> frequencyList = new ArrayList<Map.Entry<Character,Integer>>(frequencyMap.entrySet());
    	
    	Collections.sort(frequencyList,new Comparator<Map.Entry<Character, Integer>>() {
    		@Override
    		public int compare(Entry<Character, Integer> current, Entry<Character,Integer> next) {
    			return current.getValue().compareTo(next.getValue());
    		}
		});
    	
    	for (Map.Entry<Character, Integer> entry : frequencyList) {
    		int count = entry.getValue();
    		while (count > 0) {
    			result += entry.getKey();
    			count--;
    		}
    	}
    	return result;
    	
    }
    
    public static void main(String[] args) {
    	
    	String test = "cccaaa";
    	String sorted = frequencySort(test);
    	System.out.println("Original string: "+test);
    	System.out.println("Sorted string: "+sorted);
    }
}
