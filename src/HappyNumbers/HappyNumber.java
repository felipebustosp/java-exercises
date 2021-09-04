package HappyNumbers;

public class HappyNumber {

	public static int sumDigits(int value){
		String temp = Integer.toString(value);
		int res = 0;
		for (char c : temp.toCharArray()){
			System.out.println(c);
			res += Character.getNumericValue(c);
		}
		return res;
	}

	public static boolean isHappy(int value){
		if (value == 1){
			return true;
		}
		else {
			
			if (value > 1 && Integer.toString(value).length() == 1){
				return false;
			}

			else {
				
				return isHappy(sumDigits(value));

			}
			
		}
	}

	public static  void main(String [] args){
		int value = Integer.valueOf(args[0]);
		System.out.println("Is number "+value+" happy?");
		System.out.println(sumDigits(value));	
		if (isHappy(value)){
			System.out.println("Number "+value+" is happy!");
		}
		else {
			System.out.println("Number "+value+" is unhappy!");
		}
	}


}
