package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴트 참조(다형적참조)
        Parent poly = new Child();
        // 단 , 자식의 기능은 호출할 수 없다.
        // poly.childMethod();
        
        // 이것을 해결하려면? -> 다운캐스팅(부모타입 -> 자식타입)
        /*Child child = (Child)poly;
        child.childMethod();*/

        // 일시적인 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
