package easyDifficultyset;

import java.util.HashSet;
import java.util.Scanner;

public class _202_HappyNumber {

	/*Write an algorithm to determine if a number is "happy".

	A happy number is a number defined by the following process: 
		Starting with any positive integer, replace the number by the sum 
		of the squares of its digits, and repeat the process until the number 
		equals 1 (where it will stay), or it loops endlessly in a cycle 
		which does not include 1. Those numbers for which this process ends 
		in 1 are happy numbers.

	Example: 19 is a happy number

	12 + 92 = 82
	82 + 22 = 68
	62 + 82 = 100
	12 + 02 + 02 = 1*/
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		Boolean flag=true;
		while(flag){
			System.out.print("Enter The number : ");
			num=sc.nextInt();
			if(isHappy(num)){
				System.out.println("The number "+num+" is a Happy Number");
			}else{
				System.out.println("The number "+num+" is not a Happy Number");
			}
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
//	solution1
	public static boolean isHappy(int n) {
        int sum=0, num=n, temp, count=0;
		while(sum!=1){
			sum=0;
			while(num>=1){
				temp=num%10;
				sum+=(temp*temp);
				num/=10;
			}
			num=sum;
			count++;
			if(count>500){
				return false;
			}
		}
		return true;
    }
	
//	solution2
	public boolean isHappy2(int n) {
	    HashSet<Integer> set = new HashSet<Integer>();
	 
	    while(!set.contains(n)){
	        set.add(n);
	 
	        n = getSum(n);
	 
	        if(n==1)
	            return true;
	    }
	 
	    return false;
	}
	 
	public int getSum(int n){
	    int sum =0;
	    while(n>0){
	        sum+=(n%10)*(n%10);
	        n=n/10;
	    } 
	    return sum;    
	}
}
