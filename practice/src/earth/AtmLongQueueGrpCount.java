package earth;

import java.util.*;

public class AtmLongQueueGrpCount {
	
	static int grpCount(int []a) {
		int count=0;
		int previous=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
		    if(a[i]>=previous){
		        previous=a[i];
		        continue;
		    }
		    else{
		    	//1System.out.println(a[i]);
		        count++;
		        previous=a[i];
		    }
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Array Size");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter a Array Element");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		
		
		//int a[]= {1,2,3,4,2,5,1,7,4,5};
	//	int a[]= {1,2,3,4};
		
		System.out.println(grpCount(a));
		sc.close();

	}

}
