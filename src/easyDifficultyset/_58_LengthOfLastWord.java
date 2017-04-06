package easyDifficultyset;

import java.util.Scanner;

public class _58_LengthOfLastWord {

	/*Given a string s consists of upper/lower-case alphabets and 
	empty space characters ' ', return the length of last word in the string.

		If the last word does not exist, return 0.

		Note: A word is defined as a character sequence consists of non-space characters only.

		For example, 
		Given s = "Hello World",
		return 5.
	 */	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str;
		System.out.println("Enter The String : ");
		str=sc.nextLine();
		System.out.println("The length of the last word in the string is "+lengthOfLastWord(str));
		sc.close();
	}
	public static int lengthOfLastWord(String s) {
		s=s.trim();
		int a=0,b=0,count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				a=i;
				b=1;
			}
		}
		if(b==1){
			count=s.length()-a-1;
		}else{
			count=s.length();
		}
		return count;
    }
}
