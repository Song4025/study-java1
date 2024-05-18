package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        // Caw[] cawArr = {dog, cat, caw}; 타입이 달라서 만들 수 없음.
        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 테스트 종료");
        System.out.println();

        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 테스트 종료");
        System.out.println();

        System.out.println("동물소리 테스트 시작");
        caw.sound();
        System.out.println("동물소리 테스트 종료");
        // 중복을 해결하고싶은데...for문도 안되고!! 타입이 달라서 뭘 할수가없네??? -> 다형적 참조를 이용해 볼까?
    }

    private  static void soundCaw(Caw caw){
        System.out.println("동물소리 테스트 시작");
        caw.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
