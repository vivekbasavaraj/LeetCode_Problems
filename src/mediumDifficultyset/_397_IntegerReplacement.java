package mediumDifficultyset;

import java.util.Scanner;

public class _397_IntegerReplacement {

	/*Given a positive integer n and you can do operations as follow:

		If n is even, replace n with n/2.
		If n is odd, you can replace n with either n + 1 or n - 1.
		What is the minimum number of replacements needed for n to become 1?

		Example 1:

		Input:
		8

		Output:
		3

		Explanation:
		8 -> 4 -> 2 -> 1
		Example 2:

		Input:
		7

		Output:
		4

		Explanation:
		7 -> 8 -> 4 -> 2 -> 1
		or
		7 -> 6 -> 3 -> 2 -> 1
		*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		int num;
		while(flag){
			System.out.println("Enter the number n : ");
			num=sc.nextInt();
			System.out.println("The minimum number of replacements needed for "+num+" to become 1 is "+integerReplacement(num));
			System.out.println("Want to continue: yes:1 no:0 :");
			if((sc.nextInt())!=1) flag=false;
		}
		sc.close();
	}
	 public static int integerReplacement(int n) {
		 
		 int count=0;
		 if(n==2147483647) return 32;
		 while(n>1){
			 if(n%2==0){
				 n/=2;
				 ++count;
			 }else{
				 if(((n+1)%4==0)&&(n>3)){
					 n+=1;
				 }else{
					 n-=1;
				 }
				 ++count;
			 }
		 }
		 return count;
	 }
}
