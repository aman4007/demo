package earth;

public class PalindromeString {
	static String checkPallindrome(String st) {
		int flag=0;
		
		int i=0,j=st.length()-1;
		while(i<=j) {
			if(st.charAt(i)!=st.charAt(j))
				flag=1;
			i++;
			j--;
		}
		if(flag==0)
			return "YES";
		else
			return "NO";
		
	}

	public static void main(String[] args) {
		System.out.println(checkPallindrome("aba"));
		

	}

}
