import java.util.*;
class Strings
{
	public static void main(String args[])
	{
		String s1,s2,s3,s4;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("enter string1:");
		s1=sc1.nextString();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("enter string2:");
		s2=sc2.nextString();

        s1.equal(s2);
	}
}