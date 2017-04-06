package easyDifficultyset;

import java.util.Scanner;

public class _20_ValidParantheses {

	/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
	determine if the input string is valid.

	The brackets must close in the correct order, "()" and "()[]{}" are 
	all valid but "(]" and "([)]" are not.
	
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		while(flag){
			System.out.print("Enter the String: ");
			String str=new String();
			str=sc.next();
			if(isValid(str)) 
				System.out.println("It is Valid");
			else
				System.out.println("It is Invalid");
			System.out.println("Want to continue: Yes :'1' and No : '0' : ");
			
			if(sc.nextInt()!=1){
				flag=false;
			}
			
		}
		sc.close();
	}
	public static boolean isValid(String s) {
		s.trim();
		char[] charset=new char[s.length()];
		int j=0,k=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
				
				charset[j]=s.charAt(i);
				++j;
				++k;
				
			}else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
				if(j==0){
					return false;
				}
				switch (s.charAt(i)) {
				case ')':if(charset[j-1]=='(') { --j; --k;}
						else return false; 
						break;
				case '}':if(charset[j-1]=='{') { --j; --k;}
				else return false;
					break;
				case ']':	if(charset[j-1]=='['){ --j; --k;}
				else return false;
					break;
				}
			}
		}
		if(k==0) return true;
		else return false;
	}
}
