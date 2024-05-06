package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"병신재근", "나도멍청이", "학생3"};
        int[] studentAges = {30, 35, 17};
        int[] studentGrades = {90, 100, 50};
        for(int i=0; i<studentNames.length; i++){
            System.out.println("이름: " +studentNames[i]+ " 나이: "+studentAges[i]+" 성적: "+studentGrades[i]);
        }
    }
}
