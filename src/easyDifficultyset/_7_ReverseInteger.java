package easyDifficultyset;

import java.util.Scanner;
import java.lang.Integer;
public class _7_ReverseInteger {

	public static void main(String[] args){
		_7_ReverseInteger obj=new _7_ReverseInteger();
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Reverse String Problem-7 Leet code ");
		System.out.print("Enter the Integer to be Reversed...?");
		num=sc.nextInt();
		System.out.println("The reverse of "+num+" is "+ obj.reverseofnum(num));
		sc.close();
	}
	
	public int reverseofnum(int x){
		//-2147483647
		if(x<=-1563847412||x>=1534236469){
			return 0;
		}
		int reversenum=0;
		int temp;
		
		while(x!=0){
			temp=x%10;
			x/=10;
			reversenum=reversenum*10;
			reversenum=reversenum+temp;
		}
		return reversenum;
	
	}
	
	//-2147483412	
}
