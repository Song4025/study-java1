package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("A참조값: "+ dataA); // 주소값
        System.out.println("B참조값: "+ dataB); // 주소값
        System.out.println("A value: "+ dataA.value); // 10
        System.out.println("B value: "+ dataB.value); // 10

        dataA.value = 20;
        System.out.println("dataA를 20으로 변경함");
        System.out.println("A value: "+ dataA.value); // 20
        System.out.println("B value: "+ dataB.value); // 20

        dataB.value = 30;
        System.out.println("dataB를 30으로 변경함");
        System.out.println("A value: "+ dataA.value); // 30
        System.out.println("B value: "+ dataB.value); // 30

    }

}
