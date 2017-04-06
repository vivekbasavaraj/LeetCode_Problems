package easyDifficultyset;

import java.util.Scanner;

public class _9_PalindromeNumber {

	/*Determine whether an integer is a palindrome. Do this without extra space.
	
	*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		Boolean flag=true;
		while(flag){
			System.out.print("Enter The number : ");
			num=sc.nextInt();
			if(isPalindrome(num)){
				System.out.println("The number "+num+" is a Palindrome");
			}else{
				System.out.println("The number "+num+" is not a Palindrome");
			}
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static boolean isPalindrome(int x){
		
		int rev=0,num=x;
		if(x<0)return false;
		do{
			rev*=10;
			rev=rev+(num%10);
			num/=10;
		}while(num>=1);
		System.out.println("rev is "+rev);
		if(rev==x)return true;
		return false;
	}
}
