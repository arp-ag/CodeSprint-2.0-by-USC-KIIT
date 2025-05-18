import java.util.*;
class criticalJamHrs{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int res=0;
    int n=sc.nextInt();
    int[] veh=new int[n];
    for(int i=0;i<n;i++){
      veh[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
      if(veh[i+1]>=50 && veh[i+1]>veh[i])
        res++;
    }
    System.out.println(res);
  }
}