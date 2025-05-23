import java.util.*;
public class ReverseCleanSpeech{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    str=str.trim();
    String words[]=str.split("\\s+");
    StringBuilder reversed=new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
      reversed.append(words[i]);
      if(i!=0)
        reversed.append(" ");
    }
    System.out.println(reversed.toString());
  }
}