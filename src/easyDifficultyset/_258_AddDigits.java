package easyDifficultyset;

import java.util.Scanner;

public class _258_AddDigits {
	
	/*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

	For example:

	Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

	Follow up:
	Could you do it without any loop/recursion in O(1) runtime?

	Hint:

	A naive implementation of the above process is trivial. Could you come up with other methods?
	What are all the possible results?
	How do they occur, periodically or randomly?
	You may find this Wikipedia article useful.
	https://en.wikipedia.org/wiki/Digital_root
	*/
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		int num;
		while (flag) {
			System.out.print("Enter the non-negative integer:");
			num = sc.nextInt();
			System.out.println("The result is " + adddigits(num));
			System.out.print("Want to continue: Yes :'1' and No : '0' : ");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
	public static int adddigits(int num){
		int res=0;
		if (num!=0) {
			res=(num-(9*(Math.floorDiv((num-1),9 ))));	
		}
		
		return res;
	}
}
