import java.util.Scanner;

public class tester {
    public static void main(String[] args){
        User1[] userList = new User1[100];
    }
    public class User1{
        public String name;
        public String email;
        public String password;
       // public int compatibilityScore;
        public String studyMethod;
        public String major;
        public String socialize;
        public String hours;
    }
    // Create a menu for the user to either log in or create an account
    public void menu(User1 user){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome to the Study Finder");
        System.out.println("1. Log in");
        System.out.println("2. Create an account");
        System.out.println("3. Exit");
        System.out.println("Please select an option: ");
        int option = scanner.nextInt();
        switch (option){
            case 1:
            System.out.println("Please enter your email: ");
            user.email = scanner.next();
            System.out.println("Please enter your password: ");
            user.password = scanner.next();
            // Check if the email and password are valid
            // If they are, the user can log in
            // If not, the user can try again
            break;
            case 2:
            System.out.println("Please enter your username: ");
            user.name = scanner.next();
            System.out.println("Please enter your email: ");
            user.email = scanner.next();
            System.out.println("Please enter yout password: ");
            user.password = scanner.next();
        }
    }
    // Create a method that adds a new user to the array
    public void addNewUser(User1 user){
        for(int i = 0; i < userList.length; i++){
            if(userList[i] == null){
                userList[i] = user;
                break;
            }
        }
    }
    // Create a method that gives the User a studying preference survey. Each question is a multiple choice question
    public void studyPreferenceSurvey(User1 user){
        Scanner scanner = new Scanner (System.in);
        System.out.println("What is your preferred study method?");
        System.out.println("1. Flashcards");
        System.out.println("2. Notes");
        System.out.println("3. Quizzes");
        System.out.println("4. Other");
        int option = scanner.nextInt();
        switch (option){
            case 1:
            user.studyMethod =("Flashcards");
            break;
            case 2:
            user.studyMethod = ("Notes");
            break;
            case 3:
            user.studyMethod =("Quizzes");
            break;
            case 4:
            user.studyMethod =("Other");
            break;

        }
        System.out.println("Do you like to talk / socialize when you study?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        option = scanner.nextInt();
        switch (option){
            case 1:
            user.socialize = ("Yes");
            break;
            case 2:
            user.socialize = ("No");
            break;
        }
        System.out.println("How many hours do you study per week?");
        System.out.println("1. 1-5 hours per week");
        System.out.println("2. 6-9 hours per week");
        System.out.println("3. 10+ hours per week");
        option = scanner.nextInt();
        switch (option){
            case 1:
            user.hours = ("1-5 hours per week");
            break;
            case 2:
            user.hours = ("6-9 hours per week");
            break;
            case 3:
            user.hours = ("10+ hours per week");
        }
        System.out.println("What major are you?");
        System.out.println("1. Computer Science");
        System.out.println("2. Business");
        System.out.println("3. Biology");
        option = scanner.nextInt();
        switch (option){
            case 1:
            user.major = ("Computer Science");
            break;
            case 2:
            user.major = ("Business");
            break;
            case 3:
            user.major = ("Biology");
        }

    }
    
    
    // Create a method that tests the compatibility of the user which each other user in the array
    public void compatibility(User1 user){
        int compatibilityScore = 0;
        for(int i = 0; i< userList.length; i++){
            if(user.studyMethod == userList[i].studyMethod){
                compatibilityScore += 25;
            }
            if(user.major == userList[i].major){
                compatibilityScore += 25;
            }
            if(user.hours == userList[i].hours){
                compatibilityScore += 25;
            }
            if(user.socialize == userList[i].socialize){
                compatibilityScore += 25;
            }

            System.out.println("Your compatibility with "+ userList[i].username + " is "+ compatibilityScore + "%");
            compatibilityScore = 0;
            
    }
}
}
