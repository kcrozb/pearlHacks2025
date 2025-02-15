public class compatibility {
    public static void main(String[] args){
        int compatibilityScore = 0;
        for(int i = 0; i<allUsers.length; i++){
            if(user.responseStudyMethod == allUsers[i].responseStudyMethod){
                compatibilityScore += 25;
            }
            if(user.responseCourse == allUsers[i].responseCourse){
                compatibilityScore += 25;
            }
            System.out.println("Your compatibility with "+ allUsers[i].username + " is "+ compatibilityScore + "%");
            


        }
    } 
}
