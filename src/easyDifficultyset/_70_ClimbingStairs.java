package easyDifficultyset;

import java.util.Scanner;

public class _70_ClimbingStairs {

	/*You are climbing a stair case. It takes n steps to reach to the top.

	Each time you can either climb 1 or 2 steps. 
	In how many distinct ways can you climb to the top?
	 */	
	public static void main(String[] args) {
		int numofsteps=0;
		Scanner sc= new Scanner(System.in);
		Boolean flag=true;
		while(flag){
			System.out.print("Enter the number of steps: ");
			numofsteps=sc.nextInt();
			System.out.println("You can climb in "+climbStairs(numofsteps)+" distinct steps");
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static int climbStairs(int n){
		int n1=0, n2=1,a,b;
		for(int i=0;i<n;i++){
			a=n1;
			b=n2;
			n1=b;
			n2=a+b;
		}
		return n2;
	}

}
