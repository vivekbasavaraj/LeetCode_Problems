package easyDifficultyset;

import java.util.ArrayList;
import java.util.Scanner;

public class _125_ValidPalindrome {
	/*
	Given a string, determine if it is a palindrome, considering only 
	alphanumeric characters and ignoring cases.

	For example,
	"A man, a plan, a canal: Panama" is a palindrome.
	"race a car" is not a palindrome.

	Note:
	Have you consider that the string might be empty? This is a good question 
		to ask during an interview.

	For the purpose of this problem, we define empty string as valid palindrome.
 	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		String str;
		while(flag){
			System.out.println("Enter the string: ");
			str=sc.nextLine();
			if(isPalindrome1(str)) System.out.println("Soln1:The given string is a palindrome");
			else System.out.println("Soln1:The given string is not a palindrome");
			if(isPalindrome2(str)) System.out.println("Soln2:The given string is a palindrome");
			else System.out.println("Soln2:The given string is not a palindrome");
			System.out.println("Want to continue: yes:1 no:0 :");
			if(Integer.parseInt((sc.nextLine()))!=1) flag=false;
		}
		sc.close();
	}
	//solution 1
	public static boolean isPalindrome1(String s) {
        
		char charr[]=new char[s.length()];
		char charr2[]=new char[s.length()];
		char c;
		int j=0,l=s.length()-1;
		for(int i=0;i<s.length();i++){
			c=s.charAt(i);
			if(Character.isLetter(c)||Character.isDigit(c)){
				charr[j]=c;
				charr2[l]=c;
				++j;--l;
			}
		}
		for(int k=j;k<s.length();++k){
			charr[k]=' ';
		}
		for(int k=l;k>-1;--k){
			charr2[k]=' ';
		}
		String newstr1=new String(charr);
		newstr1=newstr1.trim();
		System.out.println(newstr1);
		String newstr2=new String(charr2);
		newstr2=newstr2.trim();
		System.out.println(newstr2);
		if(newstr1.equalsIgnoreCase(newstr2)) return true;
		else return false;
    }
	//solution 2
	public static boolean isPalindrome2(String s){
		s=s.toLowerCase();
		ArrayList<Character> lstchar=new ArrayList<Character>();
		char c;
		for(int i=0;i<s.length();i++){
			c=s.charAt(i);
			if(Character.isLetter(c)||Character.isDigit(c)){
				lstchar.add(c);
			}
		}
		for(int j=0,k=lstchar.size()-1;j<lstchar.size();j++,k--)
		{
			if(!(lstchar.get(j).equals(lstchar.get(k)))) return false;
		}
		return true;
	}

}
