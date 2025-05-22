import java.util.*;
public class MovementSegmentCounter{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String log=sc.nextLine();
    int cnt=0;
    if(log.charAt(0)=='1') cnt++;
    for(int i=1;i<log.length();i++){
      if(log.charAt(i)=='1' && log.charAt(i-1)=='0') cnt++;
    }
    System.out.println(cnt);
  }
}