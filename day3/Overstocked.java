import java.util.*;
class Overstocked{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int cnt=0,res=0;
    int[][] stock=new int[r][c];
    for(int i=0;i<r;i++){
      cnt=0; //for each warehouse 
      for(int j=0;j<c;j++){
        stock[i][j]=sc.nextInt();
        if(stock[i][j]>=100)
          cnt++;
      }
      if(cnt>=3)
        res++;
    }
    System.out.println(res);
  }
}