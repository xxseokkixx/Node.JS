package java_0127;

/**
 * @author kosmo_13 2021. 1. 27 / 오후 3:10:05
 */
public class Ex3_ReferenceDataType1 {
// 핵심 포인트 : 참조 자료형일 때 ==, != 연산자는 값이 아닌, 주소값을 비교.
// * 값을 비교할 때는 상수값으로 비교해야함.
// method의 인자도 지역변수

    public static void main(String[] args) {
        // == 비교 연산자 (<, >, !=, <=, >= ) : boolean ,
        // +,-,/,*,% => 산술 연산자 *%는 나머지 값을 구할 때 사용
        int num1 = 10;
        int num2 = 20;
        // 일반 자료형일 경우 값 비교
        System.out.println("num1 == num2 => " + (num1 == num2));
        System.out.println("num1 != num2 => " + (num1 != num2));
        System.out.println("----------------------------------------------");
        // *****참조 자료형의 경우 : 주소값을 비교한다.
        // 명시적 객체 생성 방법 : new => 힙영역에 주소값을 새롭게 할당한다.
        // (객체를 생성하는 작업)
        String str1 = new String("Test");// 0x100 번지, 실제 사용하면 안되는 코드
        String str2 = new String("Test"); // 0x200 번지, 실제 사용하면 안되는 코드
        String str3 = new String("Test"); // 0x300 번지, 실제 사용하면 안되는 코드
        System.out.println("str1 == str2 => " + (str1 == str2)); // false출력
        System.out.println("----------------------------------------------");
        // 내용을 비교하고 싶을 때는 String.class에서 제공하는 메서드를 활용
        System.out.println(str1.equals(str2));
        // 내용을 비교할 때 대소문자 구분 없이 비교해서 제공하는 메서드를 활용
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("----------------------------------------------");
        // 연산자 == 은 주소값을 비교함
        if (str1 == str2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("----------------------------------------------");
        // .equals 는 주소값이 아닌 객체의 값을 비교함
        if (str1.equals(str2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("----------------------------------------------");
        // 묵시적 객체 생성방법(*중요* 상수값이 같을 경우에는 주소값이 같다.)
        /* 설명) *참고자료 : singleton 디자인 패턴
        * step1) s1에서 객체가 100번지로 힙에서 생성이 됨. [상수풀] Test
        * step2) s2에서 선언 한 후에 상수풀에 이미 등록된 Test가 존재 하기 대문에
        * 힙에서 더 이상 생성하지 않고 이미 힙에서 생성된 100번지를 s2가 함께 참조하는 개념.
        * " " 는 상수풀을 참조하는 기능까지 보유. => 기존에 존재하는 주소값을 다시 입력.
         */
        String s1 = "Test";
        String s2 = "Test";
        System.out.println("s1 == s2 " + (s1 == s2)); // true
        System.out.println("----------------------------------------------");
        /* **String 클래스의 불변적 특징**
        * 1) 문자열은 가공시에 새로운 문자열을 계속 생성한다.
        * 2) 문자열을 문자열로 가공할 경우(코딩), 주소값이 없는 쓰레기 객체를 계속 생성.
        * 3) 쓰레기 객체가 계속 생성되기 때문에 메모리의 효율을 하락시킴.
        * 4) 따라서 " " 과 + 가공 말고 StringBuffer or StringBuilder로 가공하는게 효율적.
         */
        // 때문에 힙영역에 잉여 객체를 가비지객체가 소거하는 자원을 낭비하게 됨.
        // 주의해야 할 사항 -> 안드로이드, 미들웨어 환경에서는 메모리 효율이 매우 중요.
        System.out.println("-------------------1번 예제--------------------");
        // 0x100번지 생성
        String msg = "AB";
        // 1) 0x200번지에 "CD"가 주소 없이 생성. 
        // 2) 0x300번지에 +연산자 결과를 수행한 "ABCD"생성
        // 3) 0x300번지의 "ABCD"가 100번지 String객체에 연결되어 대입
        msg = msg + "CD"; // -> "ABCD"가 입력되있는 상태.
        // 위와 동일. "EF"가 0x400번지에 생성 후 +연산 수행. 후에 0x500번지에 "ABCDEF"생성
        msg = msg + "EF";
        System.out.println(msg); // "ABCDEF"
        System.out.println("-------------------2번 예제--------------------");
        String msg2 = "AB";
        msg2 += "CD"; // ABCD생성
        msg2 += "EF";
        System.out.println(msg2); // ABCDEF

        // *****매우중요***** 단골질문
        System.out.println("-------------------해결 방안--------------------");
        // 개선책 += => StringBuffer와 같은 버퍼 클래스를 생성해서 사용 권장!
        // 스레도 동기화 여부에 따른 차이가 있다.
        // " . " 연산자 : 객체.객체가 가진 자원
        // 객체를 생성
        StringBuilder sb = new StringBuilder(); // 객체 1개 생성
        // 생성된 객체의 주소값을 저장한 sb를 가지고 "."(참조연산자) 가지고
        // 해당 객체를 찾아가서 가지고 있는 메서드를 호출해서 사용하는 방법
        // 주소가 버퍼에 유지 되기 때문에 GC가 불필요하게 객체를 삭제 하는데 자원을
        // 소비하지 않고 효율적인 관리가 가능.
        sb.append("AB"); // " " 로 생성되는 것도 객체에 포함. 2개
        sb.append("CD"); // 3개
        sb.append("EF"); // 4개
        System.out.println(sb); // 이것 포함 총 생성된 객체 5개 메인 포함 지역변수 2개.
        // StringBuffer => 문자열의 개수에 따라 배열의 길이가 늘어남.
        // 주소값이 없이 생성되는 쓰레기 객체가 생성되지 않음.
        int cap = sb.capacity();
        System.out.println("sb의 용량은 ? " + cap); // 용량은 신경 X, 자동적으로 늘어남.
        System.out.println("sb의 길이는 ? " + sb.length()); // String이 아닌 버퍼의 길이.
        // * 참고 * 배열의 취약점 => 크기가 고정되어 있음.
    }
}
