package earth;
import java.util.*;

public class AddValidParathensisCount {
	
	static int addParenthesis(String st) {
		
		
		Stack<Character> stack=new Stack<>();
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='(') {
				stack.push(st.charAt(i));
			}
			else if(st.charAt(i)==')')
			{
				if(!stack.isEmpty()) {
					if(stack.peek()=='(')
					{
						stack.pop();
					} 
				}else {
					count++;
					
				}
				
			}
		}
		while(!stack.empty()) {
			count++;
			stack.pop();
		}
		System.out.println(stack);
		
		
		
		return count;
		
		
	}

	public static void main(String[] args) {
//		String st="()))((";
//		System.out.println(addParenthesis(st));
		
		   Scanner sc = new Scanner(System.in);
	        String s = sc.next(); 
	        Stack<Character> stack=new Stack<>();
	        int count=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='('){
	                stack.push(s.charAt(i));
	            }else if(s.charAt(i)==')'){
	                if(!stack.empty()){
	                    if(stack.peek()=='('){
	                        stack.pop();
	                    }
	                }else{
                        count++;
                    }
	            }
	        }
	        System.out.println(stack+"Count="+count);
	        while(!stack.isEmpty()){
	            count++;
	            stack.pop();
	        }
	        
	        
	         System.out.println(count);

	}

}

