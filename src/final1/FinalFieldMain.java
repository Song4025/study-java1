package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // field 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        System.out.println("필드 초기화");
        FieldInit init1 = new FieldInit();
        FieldInit init2 = new FieldInit();
        FieldInit init3 = new FieldInit();

        System.out.println(init1.value);
        System.out.println(init2.value);
        System.out.println(init3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
