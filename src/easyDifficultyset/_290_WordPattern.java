package easyDifficultyset;

import java.util.HashMap;
import java.util.Scanner;

public class _290_WordPattern {

/*	Given a pattern and a string str, find if str follows the same pattern.

	Here follow means a full match, such that there is a bijection between a 
	letter in pattern and a non-empty word in str.

	Examples:
	pattern = "abba", str = "dog cat cat dog" should return true.
	pattern = "abba", str = "dog cat cat fish" should return false.
	pattern = "aaaa", str = "dog cat cat dog" should return false.
	pattern = "abba", str = "dog dog dog dog" should return false.
	
	Notes:
	You may assume pattern contains only lowercase letters, and str contains 
	lowercase letters separated by a single space.
*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.print("Enter the Pattern : ");
			String patttern = sc.nextLine();
			System.out.print("\nEnter the String : ");
			String str = sc.nextLine();
			System.out.println("\n It is "+wordPattern(patttern, str));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(Integer.parseInt(sc.nextLine())!=1){
				flag = false;
			}
		}
		sc.close();
	}
	
	public static boolean wordPattern(String pattern, String str) {
        
		HashMap<Character, String> map = new HashMap<>();
		char[] chArr = pattern.toCharArray();
		String[] strArr = str.split(" ");
		if(strArr.length!=chArr.length){
			return false;
		}
		for (int i=0; i<chArr.length; ++i) {
			if(!map.containsKey(chArr[i])){
				if(map.containsValue(strArr[i])){
					return false;
				}
				map.put(chArr[i], strArr[i]);
			}
			else{
				if(!strArr[i].equals(map.get(chArr[i]))){
					return false;
				}
			}
		}
		
		
		return true;
    }
}
