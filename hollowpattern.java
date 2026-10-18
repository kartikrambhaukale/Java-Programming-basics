package operator;

 public class hollowpattern {
  public static void main(String[] args) {
	 int n=4;
	 //outer loop
	 for(int i=1; i<=n; i++) {
		//inner loop:columns
		 for(int j=1;j<=n; j++) {
			 //print stars on the boundary
			 if(i==1|| i==n || j==1||j==n) {
				 
				 System.out.print("* ");
			 }else {
				 System.out.print("");
			 }
		 }
			 System.out.println();
	 }
} 
	
}