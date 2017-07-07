import java.io.*;
public class tables{  
     public static void main(String args[])throws IOException
     {  
      int i,ans;  
      int num;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the num");
      num=Integer.parseInt(br.readLine());    
      for(i=1;i<=10;i++){    
          ans=num*i;    
           System.out.println(num+ "*" +i+ "=" +ans);
      }    
          
     }  
    }  
