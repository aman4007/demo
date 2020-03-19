package earth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberContinousManner {
	
	static String inOrder(String st) {
		int n=Integer.parseInt(st);
		int count=0;
		String flag="YES";
		List<Integer> al=new ArrayList<>();
		System.out.println("Your number is "+n);
		
		for(;n>0;n=n/10) {
			count++;
			int rem=n%10;
			System.out.println("Remender ="+rem);
			al.add(rem);			
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		for(int i=0;i<al.size()-1;i++) {
			if((!(al.get(i+1)-al.get(i)==1))	|| (( al.get(i)==0 )))
			{
				flag="NO";
			}
		}
		
		return flag;
		
	}

	public static void main(String[] args) {
		
		System.out.println(inOrder("00001"));
//		System.out.println(inOrder(2415));
//		System.out.println(inOrder(4231));
//		System.out.println(inOrder(4125));
//		System.out.println(inOrder(5142));
//		System.out.println(inOrder(4132));
//		System.out.println(inOrder(2143));
		
		
		

	}

}
