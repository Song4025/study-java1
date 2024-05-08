package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age){
        this(name, age, 50);
        // 이렇게 했을경우 위에있는 값으로 아래있는 생성자 3개짜리 메소드를 호출한다.
    }

    public MemberConstruct(String name, int age, int grade) {
        System.out.println("name:"+name+" age:"+age+" grade:"+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
