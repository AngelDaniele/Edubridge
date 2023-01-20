import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		String myname;
		String fname;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your  name:");
		myname = obj.nextLine();
		System.out.println("Enter your father name first letter:");
		fname = obj.nextLine();
		System.out.print(myname);
		System.out.print(".");
		System.out.print(fname);

	}

}
