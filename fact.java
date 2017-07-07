import java.io.*;
public class Factorial{  
     public static void main(String args[])throws IOException
     {  
      int i,fact=1;  
      int num;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the num");
      num=Integer.parseInt(br.readLine());    
      for(i=1;i<=num;i++){    
          fact=fact*i;    
      }    
      System.out.println("Factorial of "+num+" is: "+fact);    
     }  
    }  
