import java.util.Scanner;

public class User {
    String _username;
    String _password;
    String _email;

    static int maxUsers = 100;
    static int userCount = 0;
    static User[] userList = new User[maxUsers];

    public static void main(String[] arga) {
        loginMenu();
    }
    
    public static void loginMenu() {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Log in");
        System.out.println("2. Create an account");
        int choice = s.nextInt();
        
        switch (choice) {
            case 1: {login(); break;}
            case 3: {createAccount();break;}
            default: {System.out.println("Invalid Entry.");break;}
        }
    }

    public static void createAccount() {
        Scanner s = new Scanner(System.in);
        User nu = new User();
        System.out.println("Create Username:");
        String inputUsername = s.next();

        for(int i = 0; i < userList.length; i++) {
            User cu = userList[i];
            if(cu._username == inputUsername) {
                System.out.println("Username is already taken");
                createAccount();
            }
            else {
                System.out.println("Username approved!");
                nu._username = inputUsername;
                userCount += 1;
                userList[userCount] = nu;

                System.out.println("Create Password:");
                nu._password = s.next();

                System.out.println("Enter Email:");
                nu._email = s.next();

                System.out.println("Account Created!");
            }
        }
    }

    public static void login() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Username or Email:");
        String inputUsername = s.next();

        for(int i = 0; i < userList.length; i++) {
            User cu = userList[i];
            if(cu._username == inputUsername || cu._email == inputUsername) {
                System.out.println("Password:");
                String inputPassword = s.next();

                if(cu._password == inputPassword) {
                    System.out.println("Welcome" + cu._username);
                }
                else {
                    System.out.println("Incorrect password");
                    login();
                }
            }
        }
    }
}