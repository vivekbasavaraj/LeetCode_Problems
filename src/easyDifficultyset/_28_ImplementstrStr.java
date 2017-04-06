package easyDifficultyset;

import java.util.Scanner;

public class _28_ImplementstrStr {

/*	Implement strStr().

	Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	*/
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.println("Enter the haystack string: ");
			String haystack = sc.nextLine();
			System.out.println("Enter the needle string: ");
			String needle = sc.nextLine();
			System.out.println("The index of first occurance is : "+strStr(haystack, needle));
			System.out.println("Want to Continue Yes: '1' or No: '0' :");
			if(Integer.parseInt(sc.nextLine())!=1){
				flag = false;
			}
		}
		sc.close();
	}
	public static int strStr(String haystack, String needle) {
	        int loc = -1;
	        if(needle.isEmpty()){ 
	        	return 0;
	        }
	        if(needle.length()>haystack.length()){
	        	return loc;
	        }
			for(int i=0; i<haystack.length();i++){
				
				if(haystack.charAt(i)==needle.charAt(0)){
					if(i+needle.length()<= haystack.length()){
					String substr = haystack.substring(i, i+needle.length());
					if(substr.equals(needle)){
						loc = i;
						return loc;
					}
					}
				}
					
			}
			return loc;
    }
}
