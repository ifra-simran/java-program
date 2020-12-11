class UnaryOprator{
 public static void main(String args[]){
 
      System.out.println("unaryoprator");
	  int a=10;
	  int preIncNum=++a; //10+1
	  
	  System.out.println("value of preincement is: " + preIncNum);
	  System.out.println("value of a is: " + a);
	  
	  
	  int b=10;
	  int postIncNum=b++; //10+1
	  
	  System.out.println("value of postincement is: " + postIncNum);
	  System.out.println("value of b is: " + b);//11
	  
	  int c=10;
	  int postDecNum=c--; //10
	  
	  System.out.println("value of postdecement is: " + postDecNum);
	  System.out.println("value of c is: " + c);//10-1=9
	  
	  int d=10;
	  int preDecNum=--d; //
	  
	  System.out.println("value of predecement is: " + preDecNum);
	  System.out.println("value of d is: " + d);
	  
	  int i=11, j=10, k=5;
	  int result =i++ - --j + ++k - i-- ;
	  System.out.println("value of result is: " + result);
	  
	  
	 
	  
	  boolean flag = true;
	
	  System.out.println("value of flag is: " + !flag);
	  
	  
	  
 }
  

}