import java.io.*;
public class PosorNeg
{
 public static void main(String args[]) throws IOException
 { 
  int i;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  i=Integer.parseInt(br.readLine());
  if(i<0)
  System.out.println("negative");
  else if(i>0)
  System.out.println("positive");
  else
  System.out.println("zero");
  }
  }
