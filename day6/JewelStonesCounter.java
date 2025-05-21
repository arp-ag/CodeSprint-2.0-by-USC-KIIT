import java.util.*;
public class JewelStonesCounter{
  public static void main(String args[]){
    Scanner sc= new Scanner (System.in);
    String jewels= sc.nextLine();
    String stones=sc.nextLine();
    int res=0;
    for(char jewel : jewels.toCharArray()){
      for(char stone : stones.toCharArray()){
        if(stone==jewel)
          res++;
      }
    }
    System.out.println(res);
  }
}