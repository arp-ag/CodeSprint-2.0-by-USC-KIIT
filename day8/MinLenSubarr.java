import java.util.*;
public class MinLenSubarr{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int target=sc.nextInt();
    int n=sc.nextInt();
    int sessions[]=new int[n];
    for(int i=0;i<n;i++){
      sessions[i]=sc.nextInt();
    }
    int sum=0,left=0,res=Integer.MAX_VALUE;
    for(int right=0;right<n;right++){
        sum+=sessions[right];
      while(sum >= target){
        res=Math.min(res,right-left+1);
        sum-=sessions[left];
        left++;
      }
    }
    System.out.println(res==Integer.MAX_VALUE?0:res);
  }
}