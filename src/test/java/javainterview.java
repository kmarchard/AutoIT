import org.testng.annotations.Test;

public class javainterview {
	@Test
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
  @Test
  public void pattran2(){
	  int n=345;
	  String a=" ";
   while(n!=0){
	   int r=n%10;
	   a=a+"+"+r;
	  
   }
   System.out.println(a);
  }
	
}
