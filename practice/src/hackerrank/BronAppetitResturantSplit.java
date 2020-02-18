package hackerrank;

import java.util.Arrays;
import java.util.List;

public class BronAppetitResturantSplit {
	
	  static void bonAppetit(List<Integer> bill, int k, int b) {
		  
		  int finalBill=0;
		  for(int i=0;i<bill.size();i++) {
			  if(i==k)
				  continue;
			  finalBill+=bill.get(i);
		  }
		  
		  int split=finalBill/2;
		  if(split==b) {
			  System.out.println("Bon Appetit");
		  }else {
			  System.out.println(b-split);
		  }


	    }

	public static void main(String[] args) {
		Integer []bills= {3 ,10, 2, 9};
		List<Integer> al=Arrays.asList(bills);
		bonAppetit(al, 1, 7);
			
	}

}
