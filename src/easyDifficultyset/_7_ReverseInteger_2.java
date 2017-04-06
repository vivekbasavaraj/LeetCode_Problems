package easyDifficultyset;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;
public class _7_ReverseInteger_2 {

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
		int[] b=new int[100];
		int n=0,count=0,i=0,j=0,result=0,p,q; 
		if(x<-2147483647||x>=1534236469)
		{
			return 0;
		}
		if(x<0)
		{
			n=1;
			x=Math.abs(x);
		}
		if(x<0)
		{
			return 0;
		}	
		while(x>=10)
		{
			b[i]=x%10;
			x=x/10;
			count++;
			i++;
			if(b[0]==0)
			{
				--i;
				--count;
			}
		}
		b[i]=x;
		while(count>=0)
		{
			p=count;
			q=1;
			while(p!=0)
			{
				q=q*10;
				--p;
			}
			result+=(b[j]*q);
			--count;
			++j;	
		}
		if(result<0)
		{
			return 0;
		}			
		if(n==0)
		{
			return result;
		}
		else
		{
			return result*(-1);
		}
	}
	
}
