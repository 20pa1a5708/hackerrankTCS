import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	int n=input.nextInt();
  if(n%2==0){
      int even=(n/2)-1;
      System.out.println((int)Math.pow(3,even));
  }
  else{
      int odd=(n+1)/2-1;
      System.out.println((int)Math.pow(2,odd));
  }
	}
	}
