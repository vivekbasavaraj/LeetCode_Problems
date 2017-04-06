package easyDifficultyset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _387_FirstUniqueCharInString {

	/*Given a string, find the first non-repeating character in it and 
	return it's index. If it doesn't exist, return -1.

			Examples:

			s = "leetcode"
			return 0.

			s = "loveleetcode",
			return 2.
			Note: You may assume the string contain only lowercase letters.
			*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		String s;
		while(flag){
			System.out.println("Enter the string s : ");
			s=sc.nextLine();
			System.out.println("Index of the first non repeating letter\n in "+s+" is "+firstUniqChar(s));
			System.out.println("Want to continue: yes:1 no:0 :");
			if(Integer.parseInt((sc.nextLine()))!=1) flag=false;
		}
		sc.close();
	}
	public static int firstUniqChar(String s) {
		
		HashMap<Character, Integer> Hstrs=new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
			if(Hstrs.containsKey(s.charAt(i))){
				int val=Hstrs.get(s.charAt(i));
				Hstrs.replace(s.charAt(i), val+1);
			}else{
				Hstrs.put(s.charAt(i), 1);
			}
		}
		for(int i=0;i<s.length();i++){
			if((Integer)Hstrs.get(s.charAt(i))==1) return i;
		}
		return -1;
    }
}
