import java.io.*;
import java.util.*;
import java.lang.*;
public class stringmulti
{  
  public static void main(String[] args)throws IOException 
   {  
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String n,r,m; 
     int x;
     n=br.readLine();
     r=br.readLine();
     int b=Integer.parseInt(n);
     int c=Integer.parseInt(r);
     if(b>0 && c>0)
     {
       x=b*c;
       m=String.valueOf(x);
       System.out.println(m);  
     }
     else
     System.out.println("It is a negative number");       
   }  
}
