package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생";
        student1.age = 32;
        student1.grade = 20;

        Student student2 = new Student();
        student2.name = "영한";
        student2.age = 40;
        student2.grade = 30;

        System.out.println("이름:" +student1.name+ "  나이:"+student1.age+"  성적:"+student1.grade);
    }
}
