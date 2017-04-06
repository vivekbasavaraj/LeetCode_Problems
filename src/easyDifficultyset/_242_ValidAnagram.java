package easyDifficultyset;

import java.util.HashMap;
import java.util.Scanner;

public class _242_ValidAnagram {

	/*Given two strings s and t, write a function to determine 
	if t is an anagram of s.

	For example,
	s = "anagram", t = "nagaram", return true.
	s = "rat", t = "car", return false.

	Note:
	You may assume the string contains only lowercase alphabets.

	Follow up:
	What if the inputs contain unicode characters? How would you 
			adapt your solution to such case?*/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		String s,t;
		while(flag){
			System.out.println("Enter the string s : ");
			s=sc.nextLine();
			System.out.println("Enter the string t : ");
			t=sc.nextLine();
			if(isAnagram(s, t)) System.out.println("True: "+t+" is a Anagram of "+s);
			else System.out.println("False: "+t+" is not a Anagram of "+s);
			System.out.println("Want to continue: yes:1 no:0 :");
			if(Integer.parseInt((sc.nextLine()))!=1) flag=false;
		}
		sc.close();
	}
	public static boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> Hstrs=new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
			if(Hstrs.containsKey(s.charAt(i))){
				int val=Hstrs.get(s.charAt(i));
				Hstrs.replace(s.charAt(i), val+1);
			}else{
				Hstrs.put(s.charAt(i), 1);
			}
		}
		for(int i=0;i<t.length();i++){
			if(Hstrs.containsKey(t.charAt(i)) /*&& Hstrs.get(t.charAt(i))>0*/){
				int val=Hstrs.get(t.charAt(i));
				--val;
				if(val==0){
					Hstrs.remove(t.charAt(i));
				}else{
					Hstrs.replace(t.charAt(i), val);
				}
			}else return false;
		}
		if(Hstrs.isEmpty()) return true;
		else return false;
		
    }

}
