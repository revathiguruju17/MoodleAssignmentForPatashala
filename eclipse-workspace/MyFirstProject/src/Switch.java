import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
System.out.println("enter the score");
int score=scan.nextInt();
switch(score)
{
case 80:
	System.out.println("very good");
	break;
case 70:
	System.out.println("good");
	break;
case 50:
	System.out.println("average");
	break;
default:
	System.out.println("need to be improved");
}
	}

}
