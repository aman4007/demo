package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Picking {
	
	 public static int pickingNumbers(List<Integer> al) {
		
		
		 List<Integer> finalList=new ArrayList<Integer>();
		 
		 
		for(int i=0;i<al.size();i++) {
			int choosen=al.get(i);
			
			 List<Integer> arrayList=new ArrayList<Integer>();
			 List<Integer> positiveList=new ArrayList<Integer>();
			 List<Integer> negativeList=new ArrayList<Integer>();
		for(int j=0;j<al.size();j++) {
			
			
			int diff=choosen-al.get(j);
			if(diff==1 || diff==0) {
				positiveList.add(al.get(j));
					}
			
			int diff2=al.get(j)-choosen;
			if(diff2==1 || diff2==0) {
				negativeList.add(al.get(j));
					
			}
			if(positiveList.size()>negativeList.size())
				arrayList=positiveList;
			else
				arrayList=negativeList;
			
			
			
			
			
			if(arrayList.size()>finalList.size())
			finalList=arrayList;
		
		}
		}
		
		return finalList.size();

		    }


	public static void main(String[] args) {
		
	//	Integer []arr= {4, 6, 5, 3, 3, 1};
		
		
		  Integer []arr= {4 ,2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1,
		  4, 98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1,
		  3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2,
		  98, 4, 2, 1, 1, 9, 2, 4};
		 
		 
		//Integer []arr= {1 ,2, 2, 3, 1, 2,};
	List<Integer> al=Arrays.asList(arr);

	System.out.println("output==> "+ pickingNumbers(al));
	//System.out.println("output==> "+ pickingNumbers(Arrays.asList(arr1)));
	
	

	}

}
