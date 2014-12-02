package bnuoj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		while(!(s1.equals("0")&&s2.equals("0"))){
			
			int minLength = s1.length()<s2.length()?s1.length():s2.length();


			char[] s_s1 = String.valueOf(s1).toCharArray();
			char[] s_s2 = String.valueOf(s2).toCharArray();
			
			int result = 0;
			int go = 0;
			for (int i = 0;i<minLength;i++){

				;
				int i_s1 = Integer.valueOf(String.valueOf(s_s1[s1.length() -1 -i]));
				int i_s2 = Integer.valueOf(String.valueOf(s_s2[s2.length() -1 -i]));
				if ((i_s1 + i_s2 + go)>=10){
					result = result + 1;
					go = 1;
				}else{
					go =0;
				}
			}
			
			if (result ==0){
				System.out.println("No carry operation.");
			}else{
				if (result ==1){
					System.out.println("1 carry operation.");
				}else{
					System.out.println(result  + " carry operations.");
				}
			}
			
			s1 = sc.next();
			s2 = sc.next();			
		}
		
		sc.close();
	}

}
