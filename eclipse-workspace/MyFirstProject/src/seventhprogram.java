import java.util.Scanner;
public class seventhprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number");
	int n= scan.nextInt();
	int k=n-1,l=1;
	for(int i=1;i<n;i++)
	{
		for(int j=k;j>0;j--)
			System.out.print(" ");
		for(int j=l;j>0;j--)
			System.out.print("*");
			k-=1;
			l+=2;
		System.out.println();
	}
	System.out.println("Bill");
	k=l-2;l=1;
	for(int i=1; i<n;i++)
	{
		for(int j=0; j<l; j++)
			System.out.print(" ");
		for(int j=0;j<k;j++)
			System.out.print("*");
		l++;
		k-=2;
		System.out.println();
	}
	}

}
