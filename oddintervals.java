import java.io.*;
public class oddnumbersinterval
{  
  public static void main(String[] args)throws IOException 
   {  
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int n,i,r;
     n=Integer.parseInt(br.readLine());
     r=Integer.parseInt(br.readLine());
     for(i=n;i<r;i++)
     {
       if(i%2!=0)
       {
         System.out.println(i);
         }
         }
       
   }  
}
