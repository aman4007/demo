package earth;

import java.util.Arrays;

public class CountPairsTransitivity {
	
	static long SimilarElementsPairs(int[] A,int N){
		Arrays.sort(A);
		for(int a1:A)
		System.out.print(a1+" ");
		System.out.println();
		long out=0,val=0,k=0;
		for(int i =0;i<N-1;i++)
		{
		if(A[i] == A[i+1]-1)
		{
		k++;
		val=1;
		// System.out.println(k);
		}
		if(A[i] == A[i+1])
		k++;
		if(A[i]<A[i+1]-1 || i==N-2)
		{
		if(val == 1)
		{
		out += ((k*(k+1))/2);
		val =0;
		k=0;
		}
		else
		k=0;
		}
		}
		return out;
		}

	public static void main(String[] args) {
		int a[]={1 ,3 ,5 ,7 ,8 ,2 ,5 ,7};
		for(int a1:a) {
			System.out.print(a1+" ");
		}
		System.out.println();
		System.out.println(SimilarElementsPairs(a, a.length));
		
	}

}
