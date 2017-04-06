package easyDifficultyset;

import java.util.Scanner;

public class _231_PowerOfTwo {

//	Given an integer, write a function to determine if it is a power of two.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		Boolean flag=true;
		while (flag) {
			System.out.print("Enter the Integer: ");
			num=sc.nextInt();
			System.out.print("Solution 1: ");
			if (isPowerOfTwosol1(num)) {
				System.out.println("It is a power of two");
			} else {
				System.out.println("It is not a power of two");
			} 
			System.out.print("Solution 2: ");
			if (isPowerOfTwosol2(num)) {
				System.out.println("It is a power of two");
			} else {
				System.out.println("It is not a power of two");
			} 
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
//	solution 1 
	public static boolean isPowerOfTwosol1(int n) {
	    if(n==0 || n<0){
	    	return false;
	    }
	    if(n==1){
	    	return true;
	    }
	    int rem=0;
	    while(rem==0 && n>1){
	    	rem=n%2;
	    	n/=2;
	    }
		if(rem==0){
			return true;
		}else{
			return false;
		}
	}
	/*solution 2
	 	If we subtract a power of 2 numbers by 1 then all unset bits after the only 
	 set bit become set; and the set bit become unset.

	 For example for 4 ( 100) and 16(10000), we get following after subtracting 1
	 3 –> 011
	 15 –> 01111

	 So, if a number n is a power of 2 then bitwise & of n and n-1 will be zero
	 */	
	public static boolean isPowerOfTwosol2(int n) {
		 return (n>0) && (n != 0) && ((n & (n - 1)) == 0);

	}
	/*solution 3 
		A simple method for this is to simply take the log of the number on base 2 
	and if you get an integer then number is power of 2.
	 */
	}
