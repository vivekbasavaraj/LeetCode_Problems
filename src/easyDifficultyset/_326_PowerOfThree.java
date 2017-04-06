package easyDifficultyset;

import java.util.Scanner;

public class _326_PowerOfThree {

	/*Given an integer, write a function to determine if it is a power of three.

	Follow up:
	Could you do it without using any loop / recursion?
	*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		Boolean flag=true;
		while (flag) {
			System.out.print("Enter the Integer: ");
			num=sc.nextInt();
			System.out.print("Solution 1: ");
			if(isPowerOfThreesol1(num)) {
				System.out.println("It is a power of three");
			} else {
				System.out.println("It is not a power of three");
			} 
			System.out.print("Solution 2: ");
			if (isPowerOfThreesol2(num)) {
				System.out.println("It is a power of three");
			} else {
				System.out.println("It is not a power of  three");
			}
			System.out.print("Solution 3: ");
			if (isPowerOfThreesol3(num)) {
				System.out.println("It is a power of three");
			} else {
				System.out.println("It is not a power of three");
			}
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
//	solution 1 
	public static boolean isPowerOfThreesol1(int n) {
	    if(n==0 || n<0){
	    	return false;
	    }
	    if(n==1){
	    	return true;
	    }
	    int rem=0;
	    while(rem==0 && n>1){
	    	rem=n%3;
	    	n/=3;
	    }
		if(rem==0){
			return true;
		}else{
			return false;
		}
	}
//	solution 2	
	 // 1162261467 is 3^19,  3^20 is bigger than int 
	public static boolean isPowerOfThreesol2(int n){
		return ( n>0 &&  1162261467%n==0);
	}
	
//	solution 3
	/* The expression "(int) Math.pow(3, (int) 
	(Math.log(Integer.MAX_VALUE) / Math.log(3.0))
	" returns max integer that is "power of 3"
	 */ 
	public static boolean isPowerOfThreesol3(int n){
		return n > 0 && (int) Math.pow(3, (int) (Math.log(Integer.MAX_VALUE) / Math.log(3.0))) % n == 0;
	}
	
}
