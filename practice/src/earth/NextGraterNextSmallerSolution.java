package earth;

public class NextGraterNextSmallerSolution {
	
	static int nextGreater(int a[],int start,int n) {
		for(int i=start+1;i<n;i++) {
			if(a[i]>a[start]) {
				return nextSmaller(a, i, n);
			}
		}
		return -1;
		
	}
	static int nextSmaller(int a[],int start,int n) {
		for(int i=start+1;i<n;i++) {
			if(a[i]<a[start]) {
				return a[i];
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		int a[]= { 3,7,1,7,8,4,5,2};
		
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(nextGreater(a, i, n)+" ");
		}
		
		
				

	}

}
