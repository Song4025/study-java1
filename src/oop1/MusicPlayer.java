package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;
    
    void on(){
        isOn = true;
        System.out.println("플레이어를 시작합니다.");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void status(){
        if(isOn) {
            System.out.println("음악 플레이어 On, 볼륨:"+volume);
        }else{
            System.out.println("음악 플레이어 Off");
        }
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨증가:"+volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨감소:"+volume);
    }
}
