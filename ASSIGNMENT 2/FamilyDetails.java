import java.util.Scanner;

public class FamilyDetails {

	public static void main(String[] args) {
		String fname;
		String mname;
		int fage;
		int mage;
		long phonenumber;
		String address;
		int salary;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your Father name:");
		fname= obj.nextLine();
		System.out.println("Enter your mother name:");
		mname= obj.nextLine();
		System.out.println("Enter the father age: ");
		fage=obj.nextInt();
		System.out.println("Enter the mother age: ");
		mage=obj.nextInt();
		System.out.println("Enter the phone number: ");
		phonenumber=obj.nextLong();
		System.out.println("Enter the father salary: ");
		salary=obj.nextInt();

	}

}
