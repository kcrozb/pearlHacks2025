import java.util.Scanner;

public class hi {

    public static void main (String[] args) {
        //sign in
        //or create account
        //call account class
        
        String[] allUsers = new String[];
        int userCount = 0;
        //create instructions
    }

    public static String createUserName (String username) {
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

}


