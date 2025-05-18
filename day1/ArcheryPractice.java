import java.util.*;
public class ArcheryPractice{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(), good=0;
    for(int i=0;i<n;i++){
      if(sc.nextInt()>=7)
        good++;
    }
    System.out.println(good+" "+(n-good));
  }
}