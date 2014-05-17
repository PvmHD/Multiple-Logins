package yan;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		String correctusername = "yan";
		String correctpassword  = "test123";
		String correctpassword2 = "test";
		String correctusername2 =  "yan2";
		String correctusername3 = "yan3";
		String correctpassword3 = "test1";
		
		String wrongusername;
		String wrongpassword;
		System.out.println("Hello User, Please Login with your username and password.");
		System.out.println("Please enter your username.");
		wrongusername = input.nextLine();
		System.out.println("Please enter a password");
		wrongpassword = input.nextLine();
		
		if(wrongusername.equals(correctusername) && wrongpassword.equals(correctpassword) || wrongusername.equals(correctusername2) && wrongpassword.equals(correctpassword2 ) ||wrongusername.equals(correctusername3) && wrongpassword.equals(correctpassword3 )){
			System.out.println("login successful");
			} 
		else{
			System.out.println("ERROR :: Self destruct in.. 3..2..1 BOOM");
		}
			
		
		
		
	}



	}


