import java.io.*;
public class workingdays
{  
  public static void main(String[] args)throws IOException 
   {  
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String n;
     n=br.readLine();
     if(n.equals("sunday") || n.equals("saturday") || n.equals("Sunday") || n.equals("Saturday"))
     {
         System.out.println("false");
     }
     else
     {
     System.out.println("true");
     }
       
   }  
}
