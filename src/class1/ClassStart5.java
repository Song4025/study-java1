package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생";
        student1.age = 32;
        student1.grade = 20;

        Student student2 = new Student();
        student2.name = "영한";
        student2.age = 40;
        student2.grade = 30;

        Student[] students = new Student[]{student1, student2};
        /*for( int i = 0; i < students.length; i++){
            System.out.println("이름:" +students[i].name+ "  나이:"+students[i].age+"  성적:"+students[i].grade);
        }*/
        /*for(int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("이름:" +s.name+ "  나이:"+s.age+"  성적:"+s.grade);
        }*/
        for(Student s: students){
            System.out.println("이름:" +s.name+ "  나이:"+s.age+"  성적:"+s.grade);
        }
    }
}