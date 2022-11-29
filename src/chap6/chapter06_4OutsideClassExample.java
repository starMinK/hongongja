package chap6;

public class chapter06_4OutsideClassExample {
    //필드 == 매개 변수, 인스턴스 변수
    int speed;

    //생성자

    //메소드
    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    void run() {
        for (int i = 10; i <= 50; i+=10) {
            speed = i;
            System.out.println("달립니다.(시속: " + speed + "km/h)");
        }
    }
}
