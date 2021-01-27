// 클래스를 객체로 생성해보기
// *복습* 패키지 -> 같은 성격의 클래스를 모아놓은 폴더 개념.
// 외부패키지에 있는 클래스를 불러오는 방법 -> import
// ex) import 패키지명.클래스명; -> 올바른 표현
// ex) import 패키지명.*; -> 나쁜 표현 방법
package java_0127;
// import java.util.Scanner; -> 수료까지 직접 입력할 일 없음. 단축키 사용.

import java.util.Scanner;

/**
 * @author kosmo_13 2021. 1. 27 / 오후 5:05:11
 */
public class Ex4_Scanner {

    public static void main(String[] args) {
        // String str; 선언
        // Scanner sc;
        // 단축키 => ctrl + space bar
        // sc = new Scanner(); -> 표현은 옳으나, 비어있는 새로운 객체 생성 허용이 X
        // System.in : 키보드 장치로 입력(키보드 뿐만 아니라 표준 입력장치로 입력)
        // sc = new Scanner(System.in); // 키보드로 입력된 값을 받아옴

        // 실전!
        Scanner sc = new Scanner(System.in); // 콘솔에서 키보드로 입력.

        // .(참조연산자)를 사용해서 힙에 접근해서 Scanner가 가지고 있는 자원을 사용.
        // sc.nextLine() method를 호출하면 반환값이 String =>
        // 그래서 method가 수행한 후의 그 값을 변수에 저장하고 다시 가공해서 
        // 사용하는 것이 일반적이다.
        // ex) sc.nextLine()의 반환 값이 String이므로 String 변수 msg에 method를 격납.
        System.out.print("메세지 입력 : ");
        String msg = sc.nextLine(); // 사용자의 입력값을 대기하는 method(blocking method)
        System.out.println("Msg : " + msg);
    }
}
