// Ŭ������ ��ü�� �����غ���
// *����* ��Ű�� -> ���� ������ Ŭ������ ��Ƴ��� ���� ����.
// �ܺ���Ű���� �ִ� Ŭ������ �ҷ����� ��� -> import
// ex) import ��Ű����.Ŭ������; -> �ùٸ� ǥ��
// ex) import ��Ű����.*; -> ���� ǥ�� ���
package java_0127;
// import java.util.Scanner; -> ������� ���� �Է��� �� ����. ����Ű ���.

import java.util.Scanner;

/**
 * @author kosmo_13 2021. 1. 27 / ���� 5:05:11
 */
public class Ex4_Scanner {

    public static void main(String[] args) {
        // String str; ����
        // Scanner sc;
        // ����Ű => ctrl + space bar
        // sc = new Scanner(); -> ǥ���� ������, ����ִ� ���ο� ��ü ���� ����� X
        // System.in : Ű���� ��ġ�� �Է�(Ű���� �Ӹ� �ƴ϶� ǥ�� �Է���ġ�� �Է�)
        // sc = new Scanner(System.in); // Ű����� �Էµ� ���� �޾ƿ�

        // ����!
        Scanner sc = new Scanner(System.in); // �ֿܼ��� Ű����� �Է�.

        // .(����������)�� ����ؼ� ���� �����ؼ� Scanner�� ������ �ִ� �ڿ��� ���.
        // sc.nextLine() method�� ȣ���ϸ� ��ȯ���� String =>
        // �׷��� method�� ������ ���� �� ���� ������ �����ϰ� �ٽ� �����ؼ� 
        // ����ϴ� ���� �Ϲ����̴�.
        // ex) sc.nextLine()�� ��ȯ ���� String�̹Ƿ� String ���� msg�� method�� �ݳ�.
        System.out.print("�޼��� �Է� : ");
        String msg = sc.nextLine(); // ������� �Է°��� ����ϴ� method(blocking method)
        System.out.println("Msg : " + msg);
    }
}
