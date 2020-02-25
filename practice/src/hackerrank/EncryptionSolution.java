package hackerrank;

public class EncryptionSolution {

	 static String encryption(String originalString) {
		 int l=originalString.length();
		 int k=0;
		    char[] ch = new char[l]; 
		    
	        // Copy character by character into array 
	        for (int i = 0; i < l; i++) { 
	            ch[i] = originalString.charAt(i); 
	        } 
		 System.out.println("Lenght="+l);
		 int col=(int) Math.ceil(Math.sqrt(l));
		 int row=(int) Math.floor(Math.sqrt(l));
		 int mul=row*col;
		 while(mul<l) {
			 row=row+1;
			 mul=row*col;
		 }
		 System.out.println("Row="+row+" columns="+col);
		 char [][]st=new char[row][col];
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 if(k+1>l)
					st[i][j]=' ';
				 else
				 st[i][j]=ch[k++];
			 }
		 }
		 String encrptedString="";
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 System.out.print(st[i][j]);// Copy character by character into array 
			//	 encrptedString+=st[j][i];
			 }
			 
			 System.out.println();
		 }
		 for(int i=0;i<col;i++) {
			 for(int j=0;j<row;j++) {
				 if(st[j][i]==32)
					 break;
			//	System.out.println(st[j][i]);
				 encrptedString+=st[j][i];
			 }
			 encrptedString+=" ";
			 System.out.println();
		 }
		 System.out.println("encrptedString="+encrptedString);
		 
		 
	
		 
		return encrptedString;


	    }
	public static void main(String[] args) {
		//String s="haveaniceday";
	//	String s="feedthedog";
		String s="chillout";
		System.out.println(encryption(s));

	}

}
