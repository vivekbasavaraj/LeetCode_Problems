package easyDifficultyset;

import java.util.Scanner;


public class _165_CompareVersionNumbers {

/*	Compare two version numbers version1 and version2.
	If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

	You may assume that the version strings are non-empty and contain only digits and the . character.
	The . character does not represent a decimal point and is used to separate number sequences.
	For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

	Here is an example of version numbers ordering:

	0.1 < 1.1 < 1.2 < 13.37
	*/
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.print("Enter the Version 1 : ");
			String v1 = sc.nextLine();
			System.out.print("\nEnter the Version 2 : ");
			String v2 = sc.nextLine();
			int result = compareVersion(v1, v2);
			if(result==0){
				System.out.println("v1 is equal to v2");
			}else if(result == 1){
				System.out.println("v1 is greater than v2");
			}else if(result == -1){
				System.out.println("v1 is lesser than v2");
			}
			System.out.println("Want to continue Yes: '1' or No: '0' :");
			if(Integer.parseInt(sc.nextLine())!=1){
				flag = false;
			}
		}
		sc.close();
	}
	
	 public static int compareVersion(String version1, String version2) {
	 
		 int res=0, i=0;
		
		  String[] v1spl = version1.split("\\.");
		  String[] v2spl = version2.split("\\.");
		  if(v1spl.length<v2spl.length){
			  int temp = v2spl.length-v1spl.length;
			  for(int j=0;j<temp;j++){
				  version1 = version1.concat(".0");
			  }
			  v1spl = version1.split("\\.");
		  }else if(v1spl.length>v2spl.length){
			  int temp = v1spl.length-v2spl.length;
			  for(int j=0;j<temp;j++){
				  version2 = version2.concat(".0");
			  }
			  v2spl = version2.split("\\.");
		  }
		  while(res==0 && i<v1spl.length){
			  if(Integer.parseInt(v1spl[i])>Integer.parseInt(v2spl[i])){
			  	res = 1;
		  	   }else if(Integer.parseInt(v1spl[i])<Integer.parseInt(v2spl[i])){
			  	res = -1;  
		  	   }else{
		  		   ++i;
		  	   }
		  }
		  return res;
	 }
}
