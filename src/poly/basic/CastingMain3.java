package poly.basic;

public class CastingMain3 {

    // upcasting vs downcasting
    public static void main(String[] args) {
        Child child = new Child();
        // 원래는 이렇게 캐스팅 표시를 해줘야함.
        Parent parent1 = (Parent)child; // 업캐스팅은 생략이 가능, 생략 권장.
        Parent parent2 = child; // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
