package week2.day1;

public class Palindrome {
	public static void main(String[] args)
	{
		String pal="rare", pal2=" ";
		char ch[] = pal.toCharArray();
		for(int i=pal.length()-1;i>=0;--i)
		{
			pal2=pal2+ch[i];
		}
		if(pal.equals(pal2))
		{
			System.out.println("The string is a palindrome");
		}
		else
		{
			System.out.println("The string is not a palindrome");

		}
	}
}
