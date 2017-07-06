import java.io.*;
public class leap
{
 public static void main(String args[]) throws IOException 
 { 
  int n;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  n=Integer.parseInt(br.readLine());
  if(n%4==0)
  System.out.println("Leap year");
  else
  System.out.println("Non Leap year");
  }
  }
  
