package java_0127;

/**
 * @author kosmo_13 2021. 1. 27 / 오후 2:43:42
 */
public class Ex3_ReferenceDataType {

    // 1) JVM -> main method 호출.
    public static void main(String[] args) {
        // String 타입의 참조 자료형 변수 str을 선언
        // null 도 주소값이다.(값이 없는 형태의 주소값.)
        // heap영역의 주소값을 의미한다.-> 교재 5장 참조
        // 2) Stack 영역에 지역변수로 선언, 힙에 생성된 null의 주소를 저장.(push)
        String str = null;
        // 3) System.Class안에 PrintStream이 Heap에 생성이 되고
        // println() 호출 후 Stack에서 제거(pop)
        System.out.println("result1 : " + str);
        // 4) 새로운 형태로 System.Class안에 PrintStream이 Heap에 생성이 되고
        // println() 호출 후 Stack에서 제거(pop)
        System.out.println("result2 : " + str);
        // 5) } main method가 종료가 되면서 스택에서 빠져 나가기 때문에
        // 이 안에 선언된 모든 지역변수도 함께 사라진다.
        System.out.println("----------------------------------------------");
        // 공백을 입력 해보기
        String str99 = new String();
        System.out.println("result3 : " + str99);
        System.out.println("----------------------------------------------");

        int num1 = 100;
        System.out.println(num1); // 정수형 변수는 println()으로 출력시 문자열로 변환

        // String 문자열 참조 자료형 변수를 선언
        String str1;
        // 글자의 갯수는 상관이 없다.
        str1 = "aaaaaaaaabbbbbbbbbbccccccc";
        System.out.println("str1 : " + str1);
        // 문자열의 길이를 확인하기 위한 String.Class의 method를 호출
        System.out.println(str1.length());
        // 공백도 문자열로 인식가능.
        str1 = "           hi";
        System.out.println("str1 : " + str1);
        System.out.println(str1.length());
        System.out.println("----------------------------------------------");
        str1 = null; // 변수 초기화
        str1 = "hi" + "one"; // 문자열 + 문자열 : 연결의미 ***
        // 문자열은 객체, 불변적 특징이 있
        System.out.println(str1);
        System.out.println("----------------------------------------------");
        str1 = "hi" + 10; // 문자열 + 비문자열 : 연결의미
        System.out.println(str1);
        System.out.println("----------------------------------------------");
        // boolean 타입 비문자열 + 문자열 : 연결의미
        str1 = false + "hi";
        System.out.println(str1);
        System.out.println("----------------------------------------------");

    }
}
