class LogicalOperator{
    public static void main(String args[]){
	   System.out.println("Prog to illuastrate logical operator");
	   boolean x=true ,y=false;
	   boolean result=x &&y;
	   System.out.println("x&&y :" +result);
	   System.out.println("x&&y :" +(x&&y));//false
	   System.out.println("x&&y :" + (x&&x));//true
	   System.out.println("x&&y :" +(y&&x));//false
	   System.out.println("x&&y :" +(y&&y));//false
	   
	   
	   
	    
	  System.out.println("x||y :" + (x||y));//false
	   System.out.println("x||y :" + (x||x));//true
	   System.out.println("x||y :" +(y||x));//false
	   System.out.println("x||y :" +(y||y));//false
	   
	
	
	}

}