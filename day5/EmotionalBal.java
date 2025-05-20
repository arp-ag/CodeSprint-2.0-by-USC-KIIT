import java.util.HashMap;
import java.util.Scanner;
public class EmotionalBal{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    if(isBalanced(str))
      System.out.println("Aashriya smiles: Emotional balance found.");
    else
      System.out.println("Aashriya wonders: These toughts were scattered.");
  }
  public static boolean isBalanced(String str){
    HashMap<Character, Integer>freq=new HashMap<>();
    for(char c : str.toCharArray()){
      if(freq.containsKey(c))
        freq.put(c,freq.get(c)+1);
      else
        freq.put(c,1);
    }
    int cnt=-1;
    for(int value : freq.values()){
      if(cnt==-1)
        cnt=value;
      else if(value!=cnt)
        return false;
    }
    return true;
  }
}