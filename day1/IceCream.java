import java.util.*;
public class IceCream{
  public static boolean CanBuy(int budget, int[] prices){
    for (int i : prices){
      if (i==budget)
        return true;
    }return false;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter budget:");
    int budget= sc.nextInt();
    System.out.println("Enter number of ice cream prices:");
    int len=sc.nextInt();
    int[] prices=new int[len];
    System.out.println("enter icecream prices");
    for(int i=0;i<len;i++)
      prices[i]=sc.nextInt();
    System.out.println(CanBuy(budget, prices));
    sc.close();
  }
}