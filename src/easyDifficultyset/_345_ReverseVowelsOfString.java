package easyDifficultyset;

import java.util.ArrayList;
import java.util.Scanner;

public class _345_ReverseVowelsOfString {

	/*Write a function that takes a string as input and reverse only the vowels of a string.

	Example 1:
	Given s = "hello", return "holle".

	Example 2:
	Given s = "leetcode", return "leotcede".

	Note:
	The vowels does not include the letter "y".
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		String s;
		while(flag){
			System.out.println("Enter the string s : ");
			s=sc.nextLine();
			System.out.println("The string after after reversing is \n Before: "+s+" , After: "+reverseVowels(s));
			System.out.println("Want to continue: yes:1 no:0 :");
			if(Integer.parseInt((sc.nextLine()))!=1) flag=false;
		}
		sc.close();
	}
	public static String reverseVowels(String s) {
		ArrayList<Integer> vowellist=new ArrayList<Integer>();
		char[] charr=new char[s.length()];
		char[] newcharr=new char[s.length()];
		charr=s.toCharArray();
		newcharr=s.toCharArray();
		for(int i=0;i<charr.length;i++){
			if(charr[i]=='a'||charr[i]=='e'||charr[i]=='i'||charr[i]=='o'||charr[i]=='u'||charr[i]=='A'||charr[i]=='E'||charr[i]=='I'||charr[i]=='O'||charr[i]=='U'){
		
			vowellist.add(i);
			}
		}
		for(int i=0,j=vowellist.size()-1;i<vowellist.size();i++,j--){
			charr[vowellist.get(i)]=newcharr[vowellist.get(j)];
			
		}
		String s1=new String(charr);
		return s1;
			
    }
}
