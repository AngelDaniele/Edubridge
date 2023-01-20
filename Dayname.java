import java.util.Scanner;

public class Dayname {

	public static void main(String[] args) {
    int get;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the day no:");
		get=obj.nextInt();
		
		switch(get)
		{
		case 1:
			System.out.println("Sunnday");
			break;
		case 2:
		System.out.println("Monday");
		break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Wednesday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		
		default: System.out.println("Enter only 1 to 7");
		break;
		
	
	

}

		

	}

}
