
public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char a = 'B' ;
      switch(a) {
      case 'A' : System.out.println("Your percentage is between 85-100");
      break;
      case 'B' : System.out.println("Your percentage is between 65-85");
      break;
      case 'C' : System.out.println("Your percentage is between 40-60");
      break;
      case 'D' : System.out.println("Your percentage is below 35");
      break;
      
      default : System.out.println("Given grade is not exit");
      }
	}

}
