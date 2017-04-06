package easyDifficultyset;

import java.util.Scanner;

public class _204_CountPrimes {

	/*Description:

		Count the number of prime numbers less than a non-negative number, n.
		
		https://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
		*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		int num;
		while(flag){
			System.out.println("Enter the number n : ");
			num=sc.nextInt();
			System.out.println("The number of prime numbers less than "+num+" is "+countPrimes(num));
			System.out.println("Want to continue: yes:1 no:0 :");
			if((sc.nextInt())!=1) flag=false;
		}
		sc.close();
		
	}
	
	public static int countPrimes(int n) {
		int count = 0;
		   for (int i = 1; i < n; i++) {
		      if (isPrime(i)) count++;
		   }
		   return count;
    }
	
	public static boolean isPrime(int n) {
		  if (n <= 1) return false;
		   if(n==2)return true;
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
