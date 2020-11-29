import java.util.*;
public class Expression{
	public static void main(String[] args)
{
	//declaring variables
	int a,b,c;
	Scanner x = new Scanner(System.in);
    //Assign values
    System.out.print("Enter value of a");
    a = x.nextInt();
    System.out.print("Enter value of b");
    b = x.nextInt();
    c= a + b;
    //displaying values
    System.out.println("c = " + c);
}
}