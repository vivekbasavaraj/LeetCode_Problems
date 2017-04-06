package easyDifficultyset;
import java.util.Scanner;

public class _344_ReverseString {

	/*	Write a function that takes a string as input and returns the string reversed.

	Example:
	Given s = "hello", return "olleh".
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		String str;
		while(flag){
			System.out.println("Enter the string: ");
			str=sc.nextLine();
			System.out.println("The reversed string is:\n"+reverseString(str));
			System.out.println("Want to continue: yes:1 no:0 :");
			if(Integer.parseInt((sc.nextLine()))!=1) flag=false;
		}
		sc.close();
	}
	public static String reverseString(String s) {
        char charr[] =new char[s.length()];
        char reversecharr[] =new char[s.length()];
        charr=s.toCharArray();
        for(int i=charr.length-1,j=0;i>=0;i--,j++){
        	reversecharr[j]=charr[i];
        }
        String revstr=new String(reversecharr);
        return revstr;
    }
}
