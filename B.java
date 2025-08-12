import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
        char input2 = scanner.next().charAt(0);
		scanner.nextLine();
		String input3 = scanner.nextLine();
		System.out.println("You entered:\n" + input1 +"\n"+input2 +"\n"+ input3);
	}
}