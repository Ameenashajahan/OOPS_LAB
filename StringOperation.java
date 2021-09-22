import java.io.*;
class StringOperation
{	
	String str;
	StringOperation(String s)
	{
		this.str=s;
	}
	public static void main(String args[])
	{
		StringOperation str1= new StringOperation("Object");
		StringOperation str2= new StringOperation(" Oriented Programming");
		
		System.out.println("********************");
		System.out.println(" String 1 : "+ str1.str);
		System.out.println(" String 2 : "+ str2.str);
		System.out.println("********************");
		System.out.println(" Length of String 1 : "+ str1.str.length());
		System.out.println(" Length of String 2 : "+ str2.str.length());
		System.out.println("********************");
		System.out.println(" Concatenated String : "+str1.str+str2.str);
		System.out.println("********************");
		System.out.println(" Character At Index 1 of String 1 : "+str1.str.charAt(1));
		System.out.println(" Character At Index 3 of String 2 : "+str2.str.charAt(3));
		System.out.println("********************");
		System.out.println(" Index of 'o' at String 1 : "+str1.str.indexOf('o'));
		System.out.println(" Index of 'm' at String 2 : "+str2.str.indexOf('m'));
		System.out.println("********************");
		System.out.println(" Sub String of String 1 : "+str1.str.substring(1));
		System.out.println(" Sub String of String 2 : "+str2.str.substring(1,3));
		System.out.println("********************");
		System.out.println("Is String 1 equal to String 2 = "+str1.equals(str2));
		System.out.println("********************");
    
		
	}
}