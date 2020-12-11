
public class FindNoOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "Jan";
		switch (month) {

		case "Jan":
			System.out.println(" Jan has 31 days");
			break;
		case "Feb":
			System.out.println("Feb has 28 days");
			break;
		case "Mar":
			System.out.println("Mar has 31 days");
			break;
		case "Apr":
			System.out.println("Apr has 30 days");
			break;
		case "May":
			System.out.println("May has 31 days");
			break;
		case "June":
			System.out.println(" June has 30 days");
			break;
		case "July":
			System.out.println("July  has 31 days");
			break;
		case "Aug":
			System.out.println(" Aug has 30 days");
			break;
		case "Sep":
			System.out.println(" Sep has 31 days");
			break;
		case "Oct":
			System.out.println("Oct  has 30 days");
			break;
		case "Nov":
			System.out.println("Nov has 31 days");
			break;
		case "Dec":
			System.out.println(" Dec has 30 days");
			break;

		default:
			System.out.println("You have enterd a wrong month.");

		}
	}

}
