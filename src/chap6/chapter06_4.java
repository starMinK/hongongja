package chap6;

public class chapter06_4 {
    //클래스 내부 메소드 사용 예제
    static void method1(String p1, int p2) {
        System.out.println(p1 + p2);
    }

    // 메소드 타입 자동 변환 예제
    static int method2_1(int x, int y) {
        return x + y;
    }

    static void method2_2() {
        int result = method2_1(10, 20);
        double  result2  = method2_1(10,20);
        System.out.println(result);
        System.out.println(result2);
    }

    //클래스 내부에서 메소드 호출 예제 (계산기)
    static public class Calculator {
        static int plus(int x, int y) {
            return x + y;
        }

        static double avg(int x, int y) {
            double sum = plus(x, y);
            double result = sum / 2;
            return result;
        }

        static void execute() {
            double result = avg(7, 10);
            println("실행결과: " + result);
        }

        static void println(String message) {
            System.out.println(message);
        }
    }

    //메소드 오버로딩 예제
    static int plus1(int x, int y) {
        return x + y;
    }

    static double plus1(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        //클래스 내부 메소드 사용 예제
        method1("홍길동", 10);

        //클래스 내부에서 메소드 호출 예제 (계산기)
        method2_2();

        //클래스 내부에서 메소드 호출 예제 (계산기)
        Calculator myCalc = new Calculator();
        myCalc.execute(); //외부 클래스 예제 아닌가?

        //클래스 외부에서 메소드 호출 예시
        chapter06_4OutsideClassExample car = new chapter06_4OutsideClassExample();
        car.keyTurnOn();
        car.run();
        int speed = car.getSpeed();
        System.out.println("현재 속도: " + speed + "km/h");

        //메소드 오버로딩 예제
        int result1 = plus1(10, 20);
        double result2 = plus1(10.5, 20.3);
        System.out.println(result1);
        System.out.println(result2);
    }

}