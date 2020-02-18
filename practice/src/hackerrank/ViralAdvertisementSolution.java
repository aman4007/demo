package hackerrank;

public class ViralAdvertisementSolution {
	
	 static int viralAdvertising(int n) {
		 int cummulative=0,like,share=5;
		 
		for(int i=0;i<n;i++) {
			System.out.println("Day "+i+"share "+share);
			like=share/2;
			cummulative+=like;
			share=like*3;
			
			
			
		}
		 return cummulative;


	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(viralAdvertising(5));

	}

}
