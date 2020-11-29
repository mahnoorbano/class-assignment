public class method{
 public static int run(int x, int y)
 {
	int mul= x*y;
	return mul;
}
public static void main(String[]args){
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	int result1 = run(x, y);
	System.out.println(+x+"+" +y+"=" +result1);
}
	}

