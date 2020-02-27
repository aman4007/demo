package hackerrank;

public class JumpingCloudGame {

	static int jumpingOnClouds(int[] a) {
		int n=a.length;
		int count=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]==1)
			{
				System.out.println("from 1 Jump from "+(i-1) +" to position "+(i+1));
				count++;
				continue;
			}
			else {
				if((i+2)<n) {
					if(a[i+2]==0)
					{
						System.out.println("2 Jump from "+i +" to position "+(i+2));
						count++;
						i=i+1;
					}else  if(a[i+1]==0) {
						System.out.println("1 Jump from "+i +" to position "+(i+1));
						count++;
						i=i+1;
					}

				}else if((i+1)<n) {
					System.out.println("1 Jump from "+i +" to position "+(i+1));
					count++;
				}
			}
		}
		return count;





	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a= {0 ,0 ,1 ,0 ,0 ,1 ,0};
	//	int []b= {0 ,0 ,0 ,0 ,1 ,0};
		int []a= {0 ,0 ,0 ,1 ,0 ,0};
		//int []a= {0 ,1 ,0 ,0 ,0 ,1 ,0};
		System.out.println(jumpingOnClouds(a));	

	}

}
