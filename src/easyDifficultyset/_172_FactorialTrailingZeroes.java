package easyDifficultyset;

import java.util.Scanner;

public class _172_FactorialTrailingZeroes {
/*
	Given an integer n, return the number of trailing zeroes in n!.

	Note: Your solution should be in logarithmic time complexity.
	**********		
	The number of trailing zeros in the decimal representation of n!, 
	the factorial of a non-negative integer n, is simply the multiplicity of 
	the prime factor 5 in n!. This can be determined with this special case of 
	de Polignac's formula:

	f(n)=\sum _{i=1}^{k}\left\lfloor {\frac {n}{5^{i}}}\right\rfloor =\left\lfloor {\frac {n}{5}}\right\rfloor +\left\lfloor {\frac {n}{5^{2}}}\right\rfloor +\left\lfloor {\frac {n}{5^{3}}}\right\rfloor +\cdots +\left\lfloor {\frac {n}{5^{k}}}\right\rfloor ,\,} f(n)=\sum _{{i=1}}^{k}\left\lfloor {\frac  {n}{5^{i}}}\right\rfloor =\left\lfloor {\frac  {n}{5}}\right\rfloor +\left\lfloor {\frac  {n}{5^{2}}}\right\rfloor +\left\lfloor {\frac  {n}{5^{3}}}\right\rfloor +\cdots +\left\lfloor {\frac  {n}{5^{k}}}\right\rfloor ,\,
	where k must be chosen such that

	{\displaystyle 5^{k+1}>n,\,} 5^{{k+1}}>n,\,
	and {\displaystyle \lfloor a\rfloor } \lfloor a\rfloor  denotes the floor function applied to a.
	
	https://en.wikipedia.org/wiki/Trailing_zero
	
 	*/	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		Boolean flag=true;
		while(flag){
			System.out.print("Enter The number : ");
			num=sc.nextInt();
			System.out.println("The number of Trailing Zeroes in "+num+" is "+trailingZeroes(num));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	 public static int trailingZeroes(int n) {
		 int k=1,sum=0;
		// while((int)Math.pow(5, k)<=n){
		while((n/Math.pow(5, k))>=1){
			 sum+=Math.floorDiv(n, (int)Math.pow(5, k));
			 ++k;
		 }
		 return sum;
	  }

}
