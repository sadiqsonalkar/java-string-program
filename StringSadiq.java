import java.util.*;
class StringSadiq
{
	public static void main(String args[])
	{
		String s1;
		String s2;
		String s3;
		String s4="CRAZY GOOD LIFE";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string1:");
		s1=sc.nextLine();
		System.out.println("enter string2:");
		s2=sc.nextLine();

		System.out.println("\nCRAZY GOOD LIFE");
		System.out.println("\nSUBSTRING");
                System.out.println(s1.substring(3));
		System.out.println("\nCONCATENATION");
		System.out.println(s3=s1.concat(s2));
		System.out.println("\nREPLACE");
		System.out.println(s3=s4.replace("O","E"));
		System.out.println("\nUPPERCASE");
 		System.out.println(s3=s1.toUpperCase());
		System.out.println("\nLOWERCASE");
		System.out.println(s3=s2.toLowerCase());
		System.out.println("\nTRIM");
		System.out.println(s4.trim());
		System.out.println("\nINDEX OF");
		System.out.println(s4.indexOf("D"));
		System.out.println("\nLAST INDEX OF");
		System.out.println(s4.lastIndexOf("OO"));
		System.out.println("\nCOMPARE TO");
		System.out.println(s1.compareTo(s2));
		
	}
}