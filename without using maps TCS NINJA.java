import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int count=1;
        char currentElem=str.charAt(0);
        String result="";
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==currentElem){
                count++;
            }
            else{
                result+=currentElem+str.valueOf(count);                
                count=1;
                currentElem=str.charAt(i);
            }
        }
        result+=currentElem+str.valueOf(count);          
        System.out.println(result);
    }
}
