package week2.day1;

public class CharOccurence {
	public static void main(String[] args)
	{
		String str="Welcome to chennai";
		char find='e';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==find)
			count++;
		}
		
System.out.println(count);
	}
}
