package hackerrank;

public class SavePrisionorSolution {

	static int saveThePrisoner(int noOfPrisinor, int noOfSweet, int start) {
	
		if((noOfSweet+start-1)%noOfPrisinor==0)
		return noOfPrisinor;
		else 
		return	(noOfSweet+start-1)%noOfPrisinor;
					

	}
	


	public static void main(String[] args) {

		System.out.println(saveThePrisoner(7, 19, 2));
		System.out.println(saveThePrisoner(3, 7, 3));

	}

}
