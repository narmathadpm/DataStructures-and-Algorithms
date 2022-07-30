/*
https://leetcode.com/problems/daily-temperatures/

Given an array of integers temperatures represents the daily temperatures, return an array answer such that
answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
 If there is no future day for which this is possible, keep answer[i] == 0 instead.

 done using brute force

 but time complexity is high


Algorithm using stack

1.Initialize an array answer with the same length as temperatures and all values initially set to 0.
Also, initialize a stack as an empty array.

2.Iterate through temperatures. At each index currDay:

3.If the stack is not empty, that means there are previous days for which we have not yet seen a warmer day.
While the current temperature is warmer than the temperature of prevDay (the index of the day at the top of the stack):
Set answer[prevDay] equal to the number of days that have passed between prevDay and the current day,
that is, answer[prevDay] = currDay - prevDay.
Push the current index currDay onto the stack.
Return answer.

 */


package stack;

import java.util.Scanner;
import java.util.Stack;

public class DailyTemperaturesStack {


    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];


        //brute force

        /*for (int i = 0; i < temperatures.length; i++) {
            int min = i;
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[min] < temperatures[j]) {
                    min = j;
                    break;
                }
            }
            result[i] = min - i;
        }
        return result;*/

        //using stack we need to push elements when top> curr else pop

        Stack<Integer> s=new Stack<>();

        for(int i=0;i<temperatures.length;i++)
        {
            int curr=temperatures[i];
            while(!s.isEmpty()&&temperatures[s.peek()]<curr)
            {
                int previousDay=s.pop();
                result[previousDay]= i-previousDay;
            }

            s.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int noOfElements=s.nextInt();
        int[] temperatures=new int[noOfElements];
        for(int i=0;i<noOfElements;i++)
        {
            temperatures[i]=s.nextInt(i);
        }

        DailyTemperaturesStack obj=new DailyTemperaturesStack();
        obj.dailyTemperatures(temperatures);
    }

}
