package easyDifficultyset;

import java.util.HashMap;
import java.util.Scanner;
public class _383_RansomNote {

/*	Given  an  arbitrary  ransom  note  string  and  another  string  containing  
	letters from  all  the  magazines,  write  a  function  that  will  return  true 
	 if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,
	 it  will  return  false.   

		Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.

		Note:
		You may assume that both strings contain only lowercase letters.

		canConstruct("a", "b") -> false
		canConstruct("aa", "ab") -> false
		canConstruct("aa", "aab") -> true
*/			
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		String arbitrarystr,magazinestr;
		while(flag){
			System.out.println("Enter the string arbitrary string : ");
			arbitrarystr=sc.nextLine();
			System.out.println("Enter the string magazine string : ");
			magazinestr=sc.nextLine();
			if(canConstruct(arbitrarystr, magazinestr)) System.out.println("Arbitrary "+arbitrarystr+" can be constructed from magazine string "+magazinestr);
			else System.out.println("Arbitrary "+arbitrarystr+" cannot be constructed from magazine string "+magazinestr);
			System.out.println("Want to continue: yes:1 no:0 :");
			if(Integer.parseInt((sc.nextLine()))!=1) flag=false;
		}
		sc.close();
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
      //  Boolean f=true;
		HashMap<Character, Integer> Hstrs=new HashMap<Character,Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			if(Hstrs.containsKey(magazine.charAt(i))){
				int val=Hstrs.get(magazine.charAt(i));
				Hstrs.replace(magazine.charAt(i), val+1);
			}else{
				Hstrs.put(magazine.charAt(i), 1);
			}
		}
		/*
		Set set = Hstrs.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.println(mentry.getValue()+"    "+mentry.getKey());
	      }*/
		for(int i=0;i<ransomNote.length();i++){
			if(Hstrs.containsKey(ransomNote.charAt(i)) && Hstrs.get(ransomNote.charAt(i))>0){
				int val=Hstrs.get(ransomNote.charAt(i));
				--val;
				if(val==0){
					Hstrs.remove(ransomNote.charAt(i));
				}else{
					Hstrs.replace(ransomNote.charAt(i), val);
				}
			}else
				return false;
		}
		
		return true;
		
    }
}

