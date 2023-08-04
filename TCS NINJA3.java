import java.util.*;
public class Main {
  public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
        
        if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
        }
        else{
            map.put(c,1);
        }
        }
    String result="";
    for(Map.Entry<Character,Integer> entry:map.entrySet()){
        result+=entry.getKey();
        int count=entry.getValue();
        result+=count;
    }
    System.out.println(result);
}
}
