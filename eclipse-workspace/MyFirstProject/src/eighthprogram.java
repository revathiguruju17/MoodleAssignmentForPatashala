import java.util.Scanner;
public class eighthprogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		for(int i=1;i<=100;i++)
    FizzBuzz(i);
	}
public static void FizzBuzz(int i) {
		if(i%3==0 & i%5==0)
			System.out.println("FizzBuzz");
		else if(i%3==0)
			System.out.println("Fizz");
		else if(i%5==0)
			System.out.println("Buzz");
		else
			System.out.println(i);
	
}
}
