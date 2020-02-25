package hackerrank;

public class AngryProffesor {
	static String angryProfessor1(int k, int[] a) {
		int length=a.length;
		int count=0;
		for(int i=0;i<length;i++) {
			if(a[i]<=0)
				count++;
		}
		if(count>=k)
		return "No";
		else
		return "Yes";
	}

	public static void main(String[] args) {
		int []a= {-1 ,-3 ,4 ,2};
		int []b= {0 ,-1, 2 ,1};
		System.out.println(angryProfessor1(3, a));
		System.out.println(angryProfessor1(2, b));


	}

}
