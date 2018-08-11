import java.io.*;
 
class Mul3Mul5
{
    static void findMultiples(int n)
    {
        int a = 3; 
        int b = 5;
        for (int i=1; i<=n; i++)
        {
            String s = "";
           if (i==a)
            {
                a = a + 3; 
               s = s + "Multiple of 3. ";
            }
              if (i==b)
            {
                b = b+5; 
                 s = s + "Multiple of 5.";
            }
 
            if (s == "")
                System.out.println(i);
            else  System.out.println(s);
        }
    }
 
    public static void main (String[] args)
    {
        findMultiples(20);
    }
}