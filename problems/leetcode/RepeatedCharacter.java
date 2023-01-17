package leetcode;

import java.util.Scanner;

/*

https://practice.geeksforgeeks.org/problems/repeated-character2058/1

Need to find first repeated characters in given string

Need to use time complexity O(n)

Time complexity O(1)

if we use hashmap to find frequency then it will take O(n) space complexity . so we can use array with fixed size.

 */
public class RepeatedCharacter {
    public static char findFirstRepeatedChar(String S)
    {
        int[] freq=new int[26];
        for(int i=0;i<S.length();i++)
        {
            freq[S.charAt(i)-'a']++;
        }
        for(int i=0;i<S.length();i++)
        {
            if(freq[S.charAt(i)-'a']>=2)
            {
                return S.charAt(i);
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String S=sc.nextLine();
        System.out.println("First Repeated character :"+findFirstRepeatedChar(S));
    }

}
