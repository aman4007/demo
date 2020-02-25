package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateList {
	static void remove(List<String> names) {
		int n=names.size();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1 ;j++) {
				if(names.get(i).equals(names.get(j))) {
					names.remove(j);
					n=names.size();
				}
			}
			
		}
		System.out.println(names.toString());
	}

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("omkar");
		al.add("Aman");
		al.add("Aman");
		al.add("Rajat");
		al.add("Rajat");
		al.add("Rajat");
		al.add("Rajat");
		al.add("Aman");
		al.add("Aman");
		al.add("Aman");
		al.add("Rajat");
		RemoveDuplicateList.remove(al);

	}

}
