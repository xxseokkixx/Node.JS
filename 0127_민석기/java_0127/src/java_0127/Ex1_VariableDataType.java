package java_0127;

public class Ex1_VariableDataType {

    /* 작은 크기타입의 객체를 큰 크기 타입의 객체에 넣을 경우 -> Promotion
    -> 프로모션의 경우, 데이터 손실 위험이 없음.
    (작은 크기타입) 큰 크기타입 을 작은 크기타입에 넣을 경우 -> Casting
    -> 형태를 변환해야하기 때문에 데이터 손실의 위험이 있음.
     */
    // Alt + shift + f : 자동 정렬 코드
    public static void main(String[] args) {
        // Java에서는 1문자가 2byte(Char)체계
        char cha = 'B';
        System.out.println("char:" + cha);
        // Long형은 값뒤에 L문자를 포함
        // *크기:  Long형 >>>>> Int형. 
        Long lon = 1L;
        System.out.println("Long:" + lon);
        // float -> 실수형 타입은 뒤에 F를 붙여 사용
        float flo = 3.14f;
        System.out.println("float:" + flo);
        // Boolean 타입은 Java에서 True, False만 사용.
        // 타 IDE or 언어에서는 0,1로도 표현 가능.
        Boolean tr = true;
        System.out.println("true:" + tr);
        Boolean fal = false;
        System.out.println("false:" + fal);
        int a = 3; // 선언과 동시에 초기값을 대입
        int b; // 선언
        b = 3; // 대입
        // + 연산자 : 덧셈, 문자열 연결 연산자,
        System.out.println("a의 값:" + a);
        System.out.println("b의 값:" + b);
        // PDF 2장 2절 데이터 타입 참조 설명.
        // 4바이트 이하의 자료형은 저장할 수 있으나 JVM의 연산시
        // int 형이 되기 때문에 잘 사용하지 않음 ***** 
        // 형이 변화하기 때문에 불필요한 메모리사용으로 효율성 하락.
        // -> 1)byte자체만 사용하는 것은 좋으나, 연산을 행할 경우 int로 형태가 변화.
        // 2) 캐스팅을 통해 int로 변환 후 연산.
        // 3) 연산된 결과를 다시 byte로 형변환캐스팅.
        // 4) 비효율적.
        byte d = 100;
        short c = 50;
        System.out.println("d의 값:" + d);
        System.out.println("c의 값:" + c);
        // 리터럴 상수값 : \n (개행) -> 역슬러쉬
        System.out.println(
                "변수 a의 값 : " + a + "\n"
                + "변수 b의 값 : " + b + "\n"
                + "변수 c의 값 : " + c + "\n"
                + "변수 d의 값 : " + d);
        // long 자료형
        long e = 10000000000000000L; // L,l 리터럴 접미사
        System.out.println("Long:" + e);
        // 시스템의 현재 시간을 millisecond -> 1/1000 출력
        System.out.println(System.currentTimeMillis());
        // -> Long형타입이 int로 들어간다는 경고발생하므로, (int) 형변환 캐스팅.
        // 큰 자료형의 데이터를 작은 자료형으로 바꿀 때 사용한다. - 캐스팅, 디모션
        int times = (int) System.currentTimeMillis();
        // 결과값에 수치가 제대로 표시되지 않음.
        // long형 8byte -> int 4Byte
        // 1)int형의 범위를 넘어서는 값이라면 오버플로어가 발생.
        // 2) 정확한 값이 출력되지 않음
        System.out.println("times:" + times);
        // Long자료형을 사용해서 출력할 경우 정상적으로 표시.
        // System.currentTimeMillis의 api가 반환 값을 Long로 반환하고 있기 때문.
        // * Long과 long의 차이-> long은 8byte, Long은 시스템에 따라 byte가 변화.
        Long times1 = System.currentTimeMillis();
        System.out.println("times1:" + times1);
        // 상수 -> 프로그램 영역안에서 한 번 선언한 후 유지하기 위해서 사용.
        // [final][자료형][변수] = 값; 
        // 변수는 중간에 변경해도 관계없으나, 상수는 변경되어선 안됨.
        // 상수는 메모리에 상수풀이라는 곳에 저장.
        // local영역에 선언한 상수는 대문자로 표기하는 것이 원칙.
        // But 인터페이스 등에서는 변수와 같은 형태의 소문자로 표기 할 수 있음.
        final int SIZE;
        SIZE = 5;
        System.out.println("상수값:" + SIZE);
        // size = 15; -> 이미 위에서 5로 선언되었기 때문에 변경이 불가능.

        // *****************************************************************
        System.out.println("************************************************");
        float g = 3.14f; // double => 3.14이고 -> F,f의 리터럴 접미사 필요.
        double h = 3.14d; // double, 3.14d도 가능. D, d 리터럴 접미사
        boolean i = true;
        // 자바에서는 한 문자를 유니코드로 인식(2byte)
        char j = 'A'; // 문자는 ' '를 사용한다. " "는 참조 자료형.
        int k = (int) 100L; // 디모션
        long l = k; // 프로모션 (작은 => 큰)
        // System.out.print(); -> 개행이 포함 안된 함수.
        // System.out.println(); -> 개행이 포함된 함수
        System.out.println("float : " + g + "\ndouble : " + h
                + "\nboolean : " + i + "\nchar : " + j + "\nint : " + k
                + "\nlong : " + l);
    }
}
