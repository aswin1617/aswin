import java.io.*;
public class Oddoreven
{
 public static void main(String args[]) throws IOException
 { 
  int i;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  i=Integer.parseInt(br.readLine());
  if(i%2==0)
  System.out.println("even");
  else
  System.out.println("odd");
  }
  }
