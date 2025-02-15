import java.util.Scanner;
import java.util.list;
import java.util.ArrayList;

public class Question{
    String prompt;
    List<String> options;
    
    public Question(String prompt, List<String> options){
        this.prompt = prompt;
        this.options = options;

    }

    public void display(){
        System.out.println(prompt);
        for (int i = 0; i<options.size();i++){
            System.out.println((i+1) + ". " + options.get(i));
        }
    }
        
 }

 public class Survey{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Add survey Questions
        questions.add(new Question(""));
    }
 }

