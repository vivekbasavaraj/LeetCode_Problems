package mediumDifficultyset;

import java.util.Scanner;

public class _151_ReverseWordsInString {

/*	Given an input string, reverse the string word by word.

	For example,
	Given s = "the sky is blue",
	return "blue is sky the".

	Clarification:
	What constitutes a word?
	A sequence of non-space characters constitutes a word.
	Could the input string contain leading or trailing spaces?
	Yes. However, your reversed string should not contain leading or trailing spaces.
	How about multiple spaces between two words?
	Reduce them to a single space in the reversed string.
	*/
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.println("Enter the String : ");
			String s = sc.nextLine();
			System.out.println("Reversed String is : "+reverseWords(s));
			System.out.println("Want to continue Yes: '1' or No: '0' :");
			if(Integer.parseInt(sc.nextLine())!=1){
				flag = false;
			}
		}
		sc.close();
	}
	public static String reverseWords(String s) {
		s = s.trim();
		String retstr = "";
		
		for(int i=0;i<s.length();i++){
			
		}
		
		return retstr;
	}
	public static String reverseWords1(String s) {
        s = s.trim();
		String[] setofstr = s.split(" ");
		String retstr = "";
		for(int i=setofstr.length-1;i>=0;i--){
			if(!setofstr[i].equals("")){
				retstr = retstr.concat(setofstr[i]);
				retstr = retstr.concat(" ");
			}
		}
		retstr = retstr.trim();
		return retstr;
    }
}
