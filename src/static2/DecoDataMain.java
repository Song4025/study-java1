package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("정적호출: ");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2.인스턴트 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴트 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴트를 통한 접근 가능은 하나 권장사항은 아님
        DecoData data3 = new DecoData();
        staticCall();

        // 클래스를 통한 접근
        staticCall();
    }
}