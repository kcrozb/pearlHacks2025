import java.util.Scanner;

public quiz {
    public static void main (String[] args) {
        Scanner scanner = new Scanner;
        //close scanner later
        System.out.println("Select the best study method for you 
            based on the study methods listed below.
            Type the letter associated with the study method of your choice.");
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

        System.out.println("Your response: ");
        String response = scanner.nextLine();
    }

}