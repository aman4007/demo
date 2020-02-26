package earth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveEscapeCharater {

private static Scanner sc;

	public static void main(String[] args) {
		//	String ch = "This is nee/bw line /b /n this is /nanother one";
		sc = new Scanner(System.in);

		List<String> al = new ArrayList<>();

		while (sc.hasNext()) {

			al.add(sc.next());
			if (al.contains("abc"))
				break;
		}
		System.out.println("Inputs= " + al);

		for (String st : al) {
			if (st.contains("/n")) {
				String st2 = "";
				for (int i = 0; i < st.length(); i++) {

					if (st.charAt(i) == '/' && st.charAt(i + 1) == 'n') {
						st2 = st.substring(0, i);
						st = st.substring(i + 2);

					}
				}
				System.out.println(st2);
				System.out.print(st);
				continue;
			}

			if (st.contains("/b")) {
				if(st.length()==2) {
					continue;
				}

				for (int i = 0; i < st.length(); i++) {

					if (st.charAt(i) == '/' && st.charAt(i + 1) == 'b') {
						st = st.substring(0, i - 1) + st.substring(i + 2);

					}
				}
				System.out.print(st);
				continue;
			}

			System.out.print(st);
		}

	}
}
