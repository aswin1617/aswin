import java.io.*;
public class largest
{
 public static void main(String args[]) throws IOException
 { 
  int a,b,c;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  a=Integer.parseInt(br.readLine());
  b=Integer.parseInt(br.readLine());
  c=Integer.parseInt(br.readLine());
  if(a>b && a>c)
  System.out.println(a);
  else if(b>a && b>c)
  System.out.println(b);
  else
  System.out.println(c);
  }
  }
