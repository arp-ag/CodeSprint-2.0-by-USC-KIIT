import java.util.*;
public class MaxStockProfit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int minPrice=sc.nextInt();
    int maxProfit=0;
    int curr;
    for(int i=1;i<n;i++){
      if((curr=sc.nextInt())-minPrice > maxProfit)
        maxProfit=curr-minPrice;
      if(curr < minPrice)
        minPrice=curr;
    }
    if(maxProfit>=2)
      System.out.println(maxProfit);
    else
      System.out.println("0");
  }
}