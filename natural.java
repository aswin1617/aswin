import java.util.*;
public class SumNatural 
 { 
     public static void main(String[] args) 
     { 
        int n,i=1,sum=0; 
        Scanner in=new Scanner(System.in); 
        n=in.nextInt(); 
        do 
            { 
                 sum=sum+i; 
                 i+=1; 
            }   while(i<=n); 
                 System.out.print(sum); 
     } 
      
} 
