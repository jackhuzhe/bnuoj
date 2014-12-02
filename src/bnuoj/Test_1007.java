package bnuoj;

import java.util.LinkedList;
import java.util.Scanner;

public class Test_1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("7 0");
		while (sc.hasNext()){
			
			int par = sc.nextInt();
			if (par == 0){
				break;
			}
			
			
			
			int m = 1;
			while(true){
				m = m+1;
				
				LinkedList<Integer> o = new LinkedList<Integer>();
				
				for (int i = 1; i<= par;i++){
					o.add(i);
				}
				
				//System.out.println(o.size());
				
				boolean found = false;
				int cur = 0;
				o.remove(cur);
				int result = 1;
				
				while(true){

					int ori = (cur + m-1)%(o.size());
					//System.out.println(o.size());
					//System.out.println(ori);
					if (o.get(ori)==2){
						if (o.size()==1){
							found = true;
						} 
						break;
					}
					
					o.remove(ori);
					cur = ori;
				}
				
				if (found){
					System.out.println(m);
					break;
				}
				
				
			}
			
		}
	}
}
