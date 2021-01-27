package java_0127;

/**
 * @author kosmo_13 2021. 1. 27 / 오후 12:03:30
 */
public class Ex2_Demotion {

    public static void main(String[] args) {
        byte num1 = 10;
        byte num2 = 20;
        // byte num3 = num1 + num2; -> 연산을 수행할 경우, int로 형태가 변환.
        // 변환된 형태를 그대로 num3에 집어넣으면 형태가 안맞기 때문에 컴파일 오류.
        byte num3 = (byte) (num1 + num2);
        System.out.println(num3);
        System.out.println("------------------------------------");
        // 연습) short sh1, sh2에 값을 각각 100, 200을 대입
        // short sh3에 값을 저장 후 출력
        short sh1 = 100;
        short sh2 = 200;
        short sh3 = (short) (sh1 + sh2);
        System.out.println("result1 : " + sh3);
        // sh3의 값은 연산을 행하기 때문에 int로 형이 변환됨.
        int sh = sh1 + sh2;
        System.out.println("result2 : " + sh);
        System.out.println("------------------------------------");
        // ------------------유니코드 변환 방식 --------------------------
        char ch1 = 'A'; // A는 유니코드로 65
        System.out.println("ch1" + ch1);
        short ch2 = 1;
        System.out.println("정수형과 연산 : " + (ch1 + ch2));
        char ch3 = (char) (ch1 + ch2); // 연산 시, casting을 통해 디모션해주기.
        // char형은 문자로 변환 한다.
        // String은 char형으로 구성된 문자들의 집합.
        System.out.println(ch3); // 66은 유니코드로 B
        char ch4 = '가';
        System.out.println(ch4);
        char ch5 = 44032; // 10진수로 표기한 유니코드 '가'
        System.out.println("ch : "+ch5);
        char ch_def = '\u0000'; // 문자 자료형의 초기화
        System.out.println("char의 초기값 : " + ch_def);
        char ch6 = '\uac00'; // 16진수로 표기한 유니코드 '가'
        System.out.println(ch6);
        // 유니코드 문자열을 한 문자씩 char에 저장해서 출력할 때도 사용가능하다.
        System.out.println("------------------------------------");
//        // [ABC]
//        // [BBC]
//        String[] doa = {"A", "B", "C"};
//        for (String doa1 : doa) {
//            System.out.println(doa1);
//        }

    }
}
