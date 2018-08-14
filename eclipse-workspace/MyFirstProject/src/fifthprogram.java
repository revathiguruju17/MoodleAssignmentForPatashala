import java.util.Scanner;
public class fifthprogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some number");
		int n=scan.nextInt();
		int k=n-1,l=1;
		for(int i=0;i<n;i++)
		{
			for(int j=k;j>0;j--)
				System.out.print(" ");
			for(int j=l;j>0;j--)
				System.out.print("*");
				k-=1;
				l+=2;
			System.out.println();
		}
	}

}
