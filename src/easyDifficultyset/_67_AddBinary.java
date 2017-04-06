package easyDifficultyset;

import java.util.Scanner;

public class _67_AddBinary {

/*	Given two binary strings, return their sum (also a binary string).

			For example,
			a = "11"
			b = "1"
			Return "100".
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag){
			System.out.print("Enter the binary string a : ");
			String a = sc.nextLine();
			System.out.print("\nEnter the binary string b: ");
			String b = sc.nextLine();
			System.out.println("The Sum is "+addBinary(a, b));
			System.out.println("Want to continue Yes: '1' or No: '0' :");
			if(Integer.parseInt(sc.nextLine())!=1){
				flag = false;
			}
		}
		sc.close();
	}
	public static String addBinary(String a, String b) {
        
		if(a.length()<b.length()){
			int temp = b.length()-a.length();
			for(int i=0;i<temp;i++){
				String ts = "0";
				ts = ts.concat(a);
				a = ts;
			}
		}else if(a.length()>b.length()){
			int temp = a.length()-b.length();
			for(int i=0;i<temp;i++){
				String ts = "0";
				ts = ts.concat(b);
				b = ts;
			}
		}
		String c = "";
		String adder = "0";
		for(int i=a.length()-1;i>=0;i--){
			if(adder.equals("0")){
				if((a.charAt(i)=='0' && b.charAt(i)=='1')||(a.charAt(i)=='1' && b.charAt(i)=='0')){
					String ts ="1";
					ts = ts.concat(c);
					c = ts;
					adder = "0";
				}else if((a.charAt(i)=='1' && b.charAt(i)=='1')){
					String ts ="0";
					ts = ts.concat(c);
					c = ts;
					adder = "1";
				}else{
					String ts ="0";
					ts = ts.concat(c);
					c = ts;
					adder = "0";
				}
			}else{
				if((a.charAt(i)=='0' && b.charAt(i)=='1')||(a.charAt(i)=='1' && b.charAt(i)=='0')){
					String ts ="0";
					ts = ts.concat(c);
					c = ts;
					adder = "1";
				}else if((a.charAt(i)=='1' && b.charAt(i)=='1')){
					String ts ="1";
					ts = ts.concat(c);
					c = ts;
					adder = "1";
				}else{
					String ts ="1";
					ts = ts.concat(c);
					c = ts;
					adder = "0";
				}
			}
		}
		if(adder.equals("1")){
			String ts ="1";
			ts = ts.concat(c);
			c = ts;
		}
		return c;
    }
}
