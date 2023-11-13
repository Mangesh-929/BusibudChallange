
import java.util.*; 
import java.io.*;

class Main {

  public static String TreeConstructor(String[] strArr) {
    Map<String, Integer> parents = new TreeMap<>();
    Map<String, Integer> children = new TreeMap<>();
    for(String pair : strArr){
      String[] vals = pair.substring(1,pair.length()-1).split(",");
      String child = vals[0];
      String parent = vals[1];

      if(!children.containsKey(child)) children.put(child, 1);
      else children.put(child, children.get(child)+1);

      if(!parents.containsKey(parent)) parents.put(parent, 1);
      else parents.put(parent, parents.get(parent)+1);

      if(children.get(child) > 1 || parents.get(parent) > 2){
        return "false";
      }
    }
    return "true";
  }

  public static void main (String[] args) {       
    Scanner s = new Scanner(System.in);
    System.out.print(TreeConstructor(s.nextLine())); 
  }

}