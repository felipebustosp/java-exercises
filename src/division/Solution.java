package division;

public class Solution {

	public static int divide(int dividend, int divisor) {
		int quotient = 0;
		if (dividend == 0) {
			return quotient;
		}
		if (divisor == 0) {
			quotient = 99999;
		}
		else {
			if ((dividend > 0 && divisor > 0)) {
				
				while (dividend > 0) {
					dividend -= divisor;
					quotient++;

				}
				if (dividend < 0) {
					quotient--;
				}
			}
			else if ((dividend < 0 && divisor < 0)) {
				
				while (Math.abs(dividend) > 0) {
					dividend -= divisor;
					quotient++;

				}
				if (Math.abs(dividend) < 0) {
					quotient--;
				}
			}
			
			else if (dividend < 0 && divisor > 0 ) {
				
				while (dividend < 0) {
					dividend += divisor;
					quotient--;
				}
				
				if (dividend > 0) {
					quotient++;
				}
			}
			else if (dividend > 0 && divisor < 0) {
				while (dividend > 0) {
					dividend -= Math.abs(divisor);
					quotient--;
				}
				
				if (dividend < 0) {
					quotient++;
				}
			}
		}
		return quotient;
	}

	public static void main(String[] args) {
		System.out.println(divide(6, 2));
		System.out.println(divide(-6, 2));
		System.out.println(divide(10, 3));
		System.out.println(divide(10, -3));
		System.out.println(divide(-2147483647, -1));

	}

}
