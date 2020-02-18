package hackerrank;

public class TreeHeight {

	static int utopianTree(int n) {
		int height = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) 
			{
				height = height * 2;
			} else
			{
				height++;
			}
		}

		return height;
	}

	public static void main(String[] args) {

		System.out.println(utopianTree(0));
		System.out.println(utopianTree(1));
		System.out.println(utopianTree(4));
		System.out.println(utopianTree(5));


	}

}
