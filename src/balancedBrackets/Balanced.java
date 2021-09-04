package balancedBrackets;

import java.util.*;

public class Balanced{

	public static boolean isOpenCharacter(char c){
		return ((c=='(') || (c=='{') || (c=='['));
	}

	public static boolean isCloseCharacter(char c){
		return ((c==')') || (c=='}') || (c==']'));
	}

	public static boolean isBalanced(String s){
		Deque<Character> stack = new ArrayDeque<Character>();
		char[] characters = s.toCharArray();

		for (char c : characters){
			if (isOpenCharacter(c)){
				stack.push(c);
			}
			else {
				if (isCloseCharacter(c)){
					if (stack.isEmpty()){
						return false;
					}
					else {
						if ((c == ')') && (stack.pop() != '(')){
							return false;
						}
						if ((c == '}') && (stack.pop() != '{')){
							return false;
						}
						if ((c == ']') && (stack.pop() != '[')){
							return false;
						}
						else return true;
					}
				}
			}
		}
		return false;
	}

	public static void main (String[] args){
		String [] cases = {"{[()]}","{[()]}","{{[[(())]]}}"};

		for (String test : cases){
			if (isBalanced(test)){
				System.out.println(test+" is balanced");
			}
			else {
				System.out.println(test+" is not balanced");
			}
		}
	}
}
