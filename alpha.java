import java.util.*;
public class alpha
{
 public static void main(String args[]) 
 { 
  char b;
  Scanner sc=new Scanner(System.in);
  b=sc.next().charAt(0);
  if(b>='a' && b<='z' || b>='A' && b<='Z')
  System.out.println("alphabet");
  else
  System.out.println("not an alphabet");
  }
  }
