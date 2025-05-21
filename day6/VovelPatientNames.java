import java.util.*;
public class VovelPatientNames{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    Set <String> VovelPatients = new LinkedHashSet<>(); //insertion order and duplicacy monitored
    for(int i=0;i<n;i++){
      String name= sc.next().toLowerCase();
      if(startsWithVovel(name)){
        VovelPatients.add(name);
      }
    }
    System.out.println(VovelPatients.size());
    for(String name : VovelPatients){
      System.out.println(name);
    }
  }
  public static boolean startsWithVovel(String name){
    char ch=name.charAt(0);
    return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
  }
}