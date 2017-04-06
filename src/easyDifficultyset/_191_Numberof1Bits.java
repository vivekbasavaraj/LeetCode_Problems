package easyDifficultyset;

import java.util.Scanner;

public class _191_Numberof1Bits {

	/*Write a function that takes an unsigned integer and returns 
	the number of ’1' bits it has (also known as the Hamming weight).

	For example, the 32-bit integer ’11' has binary representation 
	00000000000000000000000000001011, so the function should return 3.
	 */
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long intnum;
		Boolean flag=true;
		
		while(flag){
			System.out.print("Enter the unsigned integer: ");
			intnum=sc.nextLong();
			System.out.println("The number of '1' bits it has is :"+hammingWeight(intnum));
			System.out.print("Want to continue: Yes: '1' and No: '0' :");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static int hammingWeight(long n){
		int count=0;
		long num;
		num=(long)n;
		while(num>1){
			if((num%2)==1) ++count;
			num/=2;
		}
		if(num==1)++count;
		return count;
	}
}
