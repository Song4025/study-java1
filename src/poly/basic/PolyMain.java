package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식변수가 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모변수가 자식 인스턴스를 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // Child child1 = new Parent(); // java: incompatible types: poly.basic.Parent cannot be converted to poly.basic.Child
        // 자식의 기능은 호출할 수 없다. 컴파일에러
        // poly.childMethod();
    }
}
