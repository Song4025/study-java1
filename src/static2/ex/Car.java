package static2.ex;

public class Car {
    private static String name;
    private static int count;

    public Car(String name) {
        System.out.println("차량구입, 이름: "+name);
        this.name = name;
        count++;
    }

    public static void showTotalCard(){
        System.out.println("구매한 차량 수: "+count);
    }
}
