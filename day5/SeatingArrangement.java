import java.util.*;
public class SeatingArrangement{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int cnt=0;
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if((i+j)%2==0){
          System.out.print("1");
          cnt++;
        }
        else
          System.out.print("0");
        if(j!=n-1)
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}