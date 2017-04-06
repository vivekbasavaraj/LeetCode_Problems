package easyDifficultyset;

import java.util.Scanner;

public class _371_SumOfTwoIntegers {
	
	/*Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

	Example:
	Given a = 1 and b = 2, return 3.
	
	***http://javarevisited.blogspot.com/2013/06/how-to-add-two-integer-numbers-without-plus-arithmetic-operator-java-example.html

	*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.print("Enter the first Integer: ");
		n1=sc.nextInt();
		System.out.print("\n Enter the second Integer: ");
		n2=sc.nextInt();
		System.out.println("The sum of "+n1+" and "+n2+" is "+getSum(n1, n2));
		System.out.println("The sum of "+n1+" and "+n2+" using iterative sol is "+addIterative(n1, n2));
		System.out.println("The sum of "+n1+" and "+n2+" using recursive sol is "+addrecursive(n1, n2));
		sc.close();
	}
	
//	using math built in library methods
	public static int getSum(int a, int b) {
        return Math.addExact(a, b);
    }
//	Iterative solution and bitwise operators
	public static int addIterative(int a, int b){ 
		while (b != 0){
			int carry = (a & b) ; //CARRY is AND of two bits
			a = a ^b; //SUM of two bits is A XOR B
			b = carry << 1; //shifts carry to 1 bit to calculate sum			
		}
		return a;
	}
//	Recursive Solution and bitwise operators
	public static int addrecursive(int a, int b){ 
		if(b == 0) return a;
		int sum = a ^b; //SUM of two bits is A XOR B
		int carry = (a & b)<< 1; ; //CARRY of two integers is A AND B
		return addrecursive(sum, carry);
	}
	
}
