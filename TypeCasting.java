package first;

public class TypeCasting {

	public static void main(String[] args) {
		
		/*Byte to int - possibl
		 * Int to byte - possible (result won't be accurate all the times)
		 * Int to float - 
		 * float to int - possible,but instead of this,use Math.round()
		 					because nearer integer value not possible
		 * Int to long - possible
		 * long to int - narrowing conversion
		 * Float to double - precision increase
		 * double to float - precision decrease
		 * Int to double - possible 
		 * double to int - 
		 * Char to int - respective ASCII Value obtained
		 * int to char - respective Character obtained
		 * Int to boolean - can't cast
		 * boolean to int - can't cast
		 * Char to string - 3method available
		 * string to char - can't cast (but u can make character Array by using
		 			toCharArray() method)
		 * */


		byte b=25;
		int i=23445;
		float f=1233.561234f;
		long l = 123455663434566L;
		double d=1234.56788;
		char ch='[';
		boolean bool=true;
		String st="Nithish";
		
		//System.out.println("Byte "+b+" to int " +(int)b);
		//System.out.println("Int "+i+" to byte "+(byte)i);
		//System.out.println("Int "+i+" to float "+(float)i);
		//System.out.println("Float "+f+" to Int "+(int)f);
		//System.out.println("long "+l+" to Int "+(int)l);
		//System.out.println("Int "+i+" to Long "+(long)i);
		//System.out.println("float "+f+" to double "+(double)f);
		//System.out.println("double "+d+" to float "+(float)d);
		//System.out.println("int "+i+" to double "+(double)i);
		//System.out.println("double "+d+" to int "+(int)d);
		//System.out.println("char "+ch+" to int "+(int)ch);
		//System.out.println("int "+i+" to char "+(char)i);
		//System.out.println("int"+i+"to boolean"+(boolean)i);
		//System.out.println("boolean"+bool+"to int"+(int)bool);
		
		
		/* to convert char to string 
		 	 - concate with empty string*/ 
				//System.out.println("char"+ch+"to string"+""+ch);
				
		/* use toString method of Character Class*/		
				String st1=Character.toString(ch);
				//System.out.println("char"+ch+"to string"+st1);
		/*using valueOf() of String Class*/		
				String st2=String.valueOf(d);
				//System.out.println("String "+st2+" to char");
		//char ch1=(char)st;
				
				
		// String to Char Array 
				char [] chArray = st.toCharArray();
				for(char a : chArray) {
					System.out.print(a+"\t");
				}
	}

}
