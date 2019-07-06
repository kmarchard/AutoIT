import org.testng.annotations.Test;

public class javainterview {
	/*@Test
	public void pattran(){
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	@Test
	public void pattran1(){
		int i,j;
		for(i=5;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	*/
  @Test
  public void pattran2(){
	  int n=345;
	  int a=0;
	  String kk="123";
	  String kk1="";
	  for(char c:kk.toCharArray()){
		  System.out.println(c);
		  kk1=kk1+"+"+c;
		  
	  }
	  System.out.println(kk1);
   while(n!=0){
	   int r=n%10;
	   a=a+r;
	   //System.out.println(a);
	  n=n/10;
   }
   
   System.out.println(a);
  }
	
}
