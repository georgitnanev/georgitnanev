import java.util.*;
import java.lang.*;
import java.io.*;
class Solution
{
    public static String toHex(int n) {
        String decToHex = "0123456789abcdef";
        if(n==0)
            return "0";
        int num = n;
        String ans = "";
        while(num != 0){
            ans = decToHex.charAt(num&15) + ans;
            num = num >>> 4;
        }
        return ans;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.print(toHex(-1));
    }
}