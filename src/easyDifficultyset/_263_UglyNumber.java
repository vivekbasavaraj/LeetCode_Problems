package easyDifficultyset;

import java.util.Scanner;

public class _263_UglyNumber {

/*	Write a program to check whether a given number is an ugly number.

	Ugly numbers are positive numbers whose prime factors only include 
	2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it 
	includes another prime factor 7.

	Note that 1 is typically treated as an ugly number.
 	*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Boolean flag=true;
		while(flag){
			System.out.print("Enter The integer number : ");
			int num=sc.nextInt();
			if(isUgly(num)) System.out.println(num+" is an ugly number. ");
			else System.out.println(num+" is not an ugly number. ");
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
	     	if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static boolean isUgly(int num) {
        
		if(num<1) return false;
		while(num>1){
			if(num%2==0){
				num/=2;
			}else if(num%3==0){
				num/=3;
			}else if(num%5==0){
				num/=5;
			}else{
				return false;
			}
		}
		return true;
    }
}
