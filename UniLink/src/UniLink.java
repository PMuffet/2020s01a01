import java.util.Scanner;

public class UniLink {

//User List Array
String[] userList = {"s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10"};








//Application Start
public void runApp() {
	System.out.println("Test");
	Scanner input = new Scanner(System.in);
	
	String user;
	
	System.out.print("Enter your username: ");
	user = input.nextLine();
	
	if(user.equals("s1")) {
		System.out.println("Welcome, Student.");
	}else {
		System.out.println("Incorrect Username");
	}

}


}
