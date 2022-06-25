package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args)
	{
		String str1="raw";
		String str2="law";
		Boolean isAnagram = true;
		
		int len1=str1.length();
		int len2=str2.length();
		
		char str1arr[]=str1.toCharArray();
		char str2arr[]=str2.toCharArray();
		
		
		if(len1!=len2)
		{
			isAnagram=false;
		}
		else
		{
			Arrays.sort(str1arr);
			Arrays.sort(str2arr);
			isAnagram=Arrays.equals(str1arr, str2arr);

		}
		if(isAnagram)
		{
			System.out.println("the strings are anagrams");
		}
		else
		{
			System.out.println("the strings are not anagrams");

		}
		
	}

}
