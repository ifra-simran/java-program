
public class FindGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Finding grade for percentage :");
		float percentage = 99f;
		   
		   if(percentage>100 || percentage<0){
		   System.out.println("You have given a wrong percentage,Please enter a number between 0 to 100");
		   } else {
		   if(percentage>= 85){
		   System.out.println("You have got A");
		   }
		   else if(percentage>= 65 && percentage<=84){
		   System.out.println("You have got B ");
		   }
		   	   else if(percentage>= 35 && percentage<=64){
		   System.out.println("You have got C ");
		   }
		   else{
		   System.out.println("You have got D");
		   }
		   }
	}

}
