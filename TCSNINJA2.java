import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word1=input.nextLine();
        String word2=input.nextLine();
        String word3=input.nextLine().toUpperCase();
        StringBuilder x=new StringBuilder();
        String str="";
        for(int i=0;i<word1.length();i++){
            char c=word1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
          str+='$';
            }
            else{
                str+=c;
            }
        }
        String str1="";
        for(int i=0;i<word2.length();i++){
            char c1=word2.charAt(i);
            if (c1 != 'a' && c1  != 'e' && c1 != 'i' && c1 != 'o' && c1 != 'u' &&
                    c1 != 'A' && c1 != 'E' && c1 != 'I' && c1 != 'O' && c1 != 'U') {
        str1+='#';
            }
            else{
          str1+=c1;  
        }
        }
        System.out.println(str + str1 + word3);
    }
}
