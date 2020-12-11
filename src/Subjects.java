
public class Subjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "JCCE";
		String b = "CSE";
		switch (a) {
		case "GSSSIETW":
			System.out.println(a);
			switch (b) {
			case "ECE":
				System.out.println("Power electronics,Control system,Fiber optics");
			}
			break;

		case "JCCE":
			System.out.println(a);
			switch (b) {
			case "CSE":
				System.out.println("OS,DBMS,JAVA,ML");
			}
			break;
			
		case "MALNAD":
			System.out.println(a);
			switch (b) {
			case "MEC":
				System.out.println("Applied mechanics,dynamics,heat transfer");
			}
			break;

		default:
			System.out.println("College name is invalid");

		}

	}

}
