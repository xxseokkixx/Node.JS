package java_0127;

public class Ex1_Variable1 {

    public static void main(String[] args) {
        // Pojo 타입에서 다른 외부 프레임워크에서 
        // Pojo -> 순수한 값만 가지는 객체.
        // 현재의 변수 Val을 인식 못 하는 경우가 발생한다.
        // 변수는 반드시 소문자로 작성해야한다.
        int Val = 10; // -> 잘못된 변수명
        System.out.println("Val : " + Val);
        // 변수 이름의 권장 사례 (PPT2장 참고)
        // int if -> 자바의 예약 명령어는 변수명으로 사용할 수 없다.
        int value = 30; // 변수 value 가 30으로 초기화
        int result = value + 10; // 변수 value 값을 읽고 10을 더한 결과값
        System.out.println("result:" + result);
    }
    
}
