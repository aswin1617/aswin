import java.io.*;
public class voworcon
{
 public static void main(String args[]) throws IOException
 { 
  String b;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  b=br.readLine();
  if(b=="a" || b=="e" || b=="i" || b=="o" || b=="u")
  System.out.println("vowels");
  else
  System.out.println("consonants");
  }
  }
