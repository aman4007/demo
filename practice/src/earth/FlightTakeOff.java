package earth;

public class FlightTakeOff {
	
	static int takeoff(int n,int p,int q,int r) {
		int count=0;
		for(int i=1;i<n;i++) {
			if(i%p==0)
			{
				if(!(i%q==0 || i%r==0))
					count++;
			}
			else if(i%q==0) {
				if(!(i%p==0 || i%r==0))
					count++;
			}
			else if(i%r==0) {
				if(!(i%p==0 || i%q==0))
					count++;
			}
		}
		
		
		return count;
		
	}

	public static void main(String[] args) {
//		System.out.println(takeoff(10,2, 3, 4));
//		System.out.println(takeoff(10,2, 2, 4));
		System.out.println(takeoff(81858,56, 44, 93));
	
		
		
		

	}

}
