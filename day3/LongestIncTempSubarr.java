import java.util.*;
class LongestIncTempSubarr{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int[] temps=new int[n];
    int cnt=1,res=1;
    temps[0]=sc.nextInt();
    for (int i=1;i<n;i++){
      if((temps[i]=sc.nextInt())>temps[i-1])
        cnt++;
      else{
        res=Math.max(res,cnt);
        cnt=1;
      }
    }
    res=Math.max(res,cnt);
    System.out.println(res);
  }
}