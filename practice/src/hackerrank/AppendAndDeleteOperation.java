package hackerrank;

public class AppendAndDeleteOperation {

	static String appendAndDelete(String s, String t, int k) {
		int flag=0;
		int deleteoperation=0;
		int inseroperation=0,totaloperation=0;
		int j=0;
		

		StringBuilder commonString=new StringBuilder();
		StringBuilder s1=new StringBuilder(s);
		while(flag==0) {
			
			
			if(s.charAt(j)==t.charAt(j)) {
				commonString=commonString.append(s.charAt(j));
				
			}
			else {
				 
				flag=1;
				
			}
			if(j==t.length()-1|| j==s.length()-1)
				{
				
				break;
				
				}
				
			j++;
		}
		System.out.println("Common String length="+commonString.length());
		deleteoperation=(s.length()-1)-(commonString.length()-1);
		if(deleteoperation==0) {
			deleteoperation=s.length();
			inseroperation=t.length();
			System.out.println("inesertoperatin in deletee0"+inseroperation);
		}else {
			 inseroperation=(t.length()-1)-(commonString.length()-1);
			
		}
		System.out.println("deleteoperation="+deleteoperation);
		System.out.println("J value"+j);
		
		System.out.println("inseroperation="+inseroperation);
		totaloperation=inseroperation+deleteoperation;
		System.out.println("total operation="+totaloperation);
		
		if(totaloperation<=k)
			return "Yes";
		else
			return "No";
	
		
		


    }
	public static void main(String[] args) {
		String s="ashley";
		String t="ash";
		int k=2;
		//System.out.println(appendAndDelete(s, t, k));
		System.out.println(appendAndDelete("abcd","abcdert" , 10));

	}

}
