package earth;

public class ChooseWiselySolution {

//	public static int Answer(int[] rank, int[] complexity, int capacity) {
//		int[] matrix = new int[capacity + 1];
//		for (int i = 0; i < rank.length; i++) {
//			for (int j = capacity; j > complexity[i] - 1; j--) {
//				System.out.println(matrix[j] + " " + (rank[i] + matrix[j - complexity[i]]));
//				matrix[j] = Math.max(matrix[j], rank[i] + matrix[j - complexity[i]]);
//
//			}
//		}
//		return matrix[capacity];
//	}

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// Returns the maximum itemValue that can be put in a knapsack of capacity W
	static int knapSack(int maxBagCapaticy, int itemWeight[], int itemValue[], int n) {
		// Base Case
		if (n == 0 || maxBagCapaticy == 0)
			return 0;

		// If itemWeight of the nth item is more than Knapsack capacity W, then
		// this item cannot be included in the optimal solution
		if (itemWeight[n - 1] > maxBagCapaticy)
			return knapSack(maxBagCapaticy, itemWeight, itemValue, n - 1);

		// Return the maximum of two cases:
		// (1) nth item included
		// (2) not included
		else
			return max(itemValue[n - 1] + knapSack(maxBagCapaticy - itemWeight[n - 1], itemWeight,itemValue, n - 1), knapSack(maxBagCapaticy, itemWeight, itemValue, n - 1));
	}

	public static void main(String[] args) {
//		int []rank = {6, 10, 12};
//		int []complexity = {30, 60, 90};
//		int maxBagCapaticy=150;
		int[] itemValue = { 1, 2, 3 };
		int[] itemWeight = { 4, 5, 6 };
		int maxBagCapaticy = 10;
		// System.out.println(Answer(rank, complexity, maxBagCapaticy));
		System.out.println(knapSack(maxBagCapaticy, itemWeight, itemValue, itemWeight.length));

	}

}
