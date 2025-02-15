import.import java.util.Scanner;

public class allUsers {
    String[] allUsers
}

public class account {
    String _username;
    String _password;
    String _email;

    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Log In");
        System.out.println("2. Create Account");
        System.out.println("Enter your choice:");
        int choice = s.nextInt();
        if (choice == 1) {
            logIn();
        }
        if (choice == 2) {
            createAccount();
        }
        else {
            System.out.println("Invalid choice")
            main();
        }
    }
    
    public static void logIn() {
        System.out.println("Enter Username: ");
        String inputName = s.nextLine();


    }
    
    public static String createAccount() {
        System.out.println("Create Username: ");
        String username = new String;

        for(int i = 0; i < allUsers.length; i++) {
            if(allUsers[i] == username) {
                System.out.println("Username is already taken");
            }
            else {
                System.out.println("Username approved!");
                userCount += 1;
                allUsers[userCount - 1] = username;
            }

    }
}