import java.util.*;
public class IfElse{
	public static void main(String[] args){
		int y;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a year");
		y= a.nextInt();
      if (y % 4 == 0) 
      {
      System.out.println("This is a leap year");
     } 
else 
{
 System.out.println("This is not a leap year");
	}
}
}