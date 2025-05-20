import java.util.*;
public class ZigZagMarathonPattern{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>10)
      System.out.println("Abhik's marathon journey intensifies! Let's see his detailed zig-zag pattern:");
    int odd,even,cnt=0;
    for(int i=1; i<=n; i++){
      odd=1;
      even=i;
      for (int j=1;j<=n;j++){
        if(j<=n-i) //initial spaces in each row
          System.out.print(" ");
        else {
          if(i%2!=0){ //for odd row
            System.out.print(odd);
            cnt++;
            odd++;
          }
          else{ //for even row
            System.out.print(even);
            cnt++;
            even--;
          }
          if(j!=n)
            System.out.print("   ");
        }
      }
      System.out.println();
    }
    System.out.println("Total numbers printed: "+cnt);
  }
}