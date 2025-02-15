import java.util.Scanner;
/**
 * this class creates the actual quiz for the user to take
 * @author Swara Belur
 */
public class quiz {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //contains menu that shows all the study methods
        //reads user's input into Scanner obj
        //checks validity of the user's input
        displayMenuStudyType();
        System.out.println("Your response: ");
        String responseStudyMethod = scanner.nextLine().toLowerCase();
        checkStudyType(responseStudyMethod);
        
        //contains menu that asks for course
        //reads user's input into Scanner obj
        //checks validity of the user's input
        displayMenuCourseName();
        System.out.println("Your response: ");
        String responseCourse = scanner.nextLine().toLowerCase();
        checkCourse(responseCourse);
    

        scanner.close();
    }

    static void displayMenuCourseName() {
        System.out.println("Type in a Computer science class in the specified format. For ex: CS 110");
    }

    static void displayMenuStudyType() {
        System.out.println("Select the best study method for you based on the study methods listed below. Type the letter associated with the study method of your choice.");
        System.out.println("S - SQ3R Method");
        System.out.println("E - Retrieval Practice");
        System.out.println("P - Spaced Practice");
        System.out.println("Q - PQ4R Method");
        System.out.println("F - Feynman Technique");
        System.out.println("L - Leitner System");
        System.out.println("M - Mind Mapping");
        System.out.println("P - Pommodoro Technique");
        System.out.println("A - Active Recall");
        System.out.println("B - Blurting Method");
    }

    static void checkStudyType(String responseStudyMethod) {
        boolean correctResponse = false;

        //while(!correctResponse) { }
        for (int i = 0; i < responseStudyMethod.length(); i++) {
            if(!"S".equals(responseStudyMethod) && !"E".equals(responseStudyMethod) &&
            !"P".equals(responseStudyMethod) && !"Q".equals(responseStudyMethod) && 
            !"F".equals(responseStudyMethod) && !"L".equals(responseStudyMethod) &&
            !"M".equals(responseStudyMethod) && !"P".equals(responseStudyMethod) &&
            !"A".equals(responseStudyMethod) && !"B".equals(responseStudyMethod)) {
            
                System.out.println("Incorrect response, please make sure to respond with the single letters provided");
                displayMenuStudyType();

               
                    
            }
            correctResponse = true;
        }
        // if(!"S".equals(responseStudyMethod) && !"E".equals(responseStudyMethod) &&
        // !"P".equals(responseStudyMethod) && !"Q".equals(responseStudyMethod) && 
        // !"F".equals(responseStudyMethod) && !"L".equals(responseStudyMethod) &&
        // !"M".equals(responseStudyMethod) && !"P".equals(responseStudyMethod) &&
        // !"A".equals(responseStudyMethod) && !"B".equals(responseStudyMethod)) {
           
        //     System.out.println("Incorrect response, please make sure to respond with the single letters provided");
        //     displayMenuStudyType();
                
        // }
    }
      
     

    public static void checkCourse(String responseCourse) {
        if(responseCourse.length() < 6) {
            System.out.println("Incorrect course name");
            displayMenuCourseName();
        }
    }

}