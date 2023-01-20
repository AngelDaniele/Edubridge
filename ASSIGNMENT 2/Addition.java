import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		int a,b,c,d,e,result;
		result=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a = obj.nextInt();
		b = obj.nextInt();
		c = obj.nextInt();
		d = obj.nextInt();
		e = obj.nextInt();
		result=a+b+c+d+e;
		System.out.println("The resultis:"+result );


}
}