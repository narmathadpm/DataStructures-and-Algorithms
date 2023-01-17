package leetcode;/*
https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/

Given a string of English letters s, return the greatest English letter which occurs as both a lowercase
and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet.

Used hashing technique



 */




public class GreatestEnglishLetterinUpperandLowerCase {
    public String greatestLetter(String s) {
        int[] a=new int[52];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
            {
                a[s.charAt(i)-'A']++;
            }else
            {
                a[s.charAt(i)-65-6]++;
            }
        }

        for(int i=25;i>=0;i--)
        {
            if(a[i]>0&&a[i+26]>0)
            {
                return String.valueOf((char)(i+65));
            }
        }
        return "";
    }
}
