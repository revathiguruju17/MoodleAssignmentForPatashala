import java.util.Scanner;
public class ninethprogram {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scan.nextInt();
		generate(n);
	}
	public static void generate(int n){
		if(n>1)
		{
			 for(int i=2;i<=n;i++) {
				 if(n%i==0)
					 System.out.print(i+" ");}
		}
	}
}
