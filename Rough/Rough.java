package Stack;

import java.util.Stack;

public class Rough{
    public static void main(String[] args)
    {
      char[] a = {'a','a','a','b','b','b','b','b','b','b','b','b','b','b','b','c','c'};
      int n = a.length;
      char temp = a[0];
      int count = 0;
      int c = 0;
      StringBuilder str = new StringBuilder();
      for(int i=0;i<n;i++)
      {
        if(temp == a[i])
        {
            count++;
        }
        else
        {
            a[c++] = a[i-1];
            str.append(a[i-1]);
            String s = Integer.toString(count);
            for(int j=0;j<s.length();j++)
            {
                str.append(s.charAt(j));
                a[c++] = s.charAt(j);
            }
            temp = a[i];
            count = 1 ;
        }
      }
       a[c++] = temp;
            str.append(temp);
            String s = Integer.toString(count);
            for(int j=0;j<s.length();j++)
            {
                str.append(s.charAt(j));
                a[c++] = s.charAt(j);
            }
           
        for(int i=0;i<c;i++)
        {
            System.out.print(a[i]+" ");
        }
    //   System.out.println(str);
    System.out.println();
       System.out.println(c);
    }
    
}