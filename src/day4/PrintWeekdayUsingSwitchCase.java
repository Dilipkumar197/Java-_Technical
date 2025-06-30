package day4;

public class PrintWeekdayUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int weekday = 10;

		switch (weekday)

		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thruday");
			break;

		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid Weekday number ");

		}

	}

}
