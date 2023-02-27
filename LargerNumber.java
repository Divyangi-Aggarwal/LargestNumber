import java.util.Scanner;

public class LargerNumber{
	public static void main(String [] args){
	System.out.println("Enter two number to find larger number amongst them.");
	Scanner sc = new Scanner(System.in);
	int firstNumber= sc.nextInt();
	int secondNumber = sc.nextInt();
	System.out.println(firstNumber>secondNumber? "First number is greater "+ firstNumber :"Second number is greater "+secondNumber);
}
}