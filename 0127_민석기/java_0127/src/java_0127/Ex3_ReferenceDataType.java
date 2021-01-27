package java_0127;

/**
 * @author kosmo_13 2021. 1. 27 / ���� 2:43:42
 */
public class Ex3_ReferenceDataType {

    // 1) JVM -> main method ȣ��.
    public static void main(String[] args) {
        // String Ÿ���� ���� �ڷ��� ���� str�� ����
        // null �� �ּҰ��̴�.(���� ���� ������ �ּҰ�.)
        // heap������ �ּҰ��� �ǹ��Ѵ�.-> ���� 5�� ����
        // 2) Stack ������ ���������� ����, ���� ������ null�� �ּҸ� ����.(push)
        String str = null;
        // 3) System.Class�ȿ� PrintStream�� Heap�� ������ �ǰ�
        // println() ȣ�� �� Stack���� ����(pop)
        System.out.println("result1 : " + str);
        // 4) ���ο� ���·� System.Class�ȿ� PrintStream�� Heap�� ������ �ǰ�
        // println() ȣ�� �� Stack���� ����(pop)
        System.out.println("result2 : " + str);
        // 5) } main method�� ���ᰡ �Ǹ鼭 ���ÿ��� ���� ������ ������
        // �� �ȿ� ����� ��� ���������� �Բ� �������.
        System.out.println("----------------------------------------------");
        // ������ �Է� �غ���
        String str99 = new String();
        System.out.println("result3 : " + str99);
        System.out.println("----------------------------------------------");

        int num1 = 100;
        System.out.println(num1); // ������ ������ println()���� ��½� ���ڿ��� ��ȯ

        // String ���ڿ� ���� �ڷ��� ������ ����
        String str1;
        // ������ ������ ����� ����.
        str1 = "aaaaaaaaabbbbbbbbbbccccccc";
        System.out.println("str1 : " + str1);
        // ���ڿ��� ���̸� Ȯ���ϱ� ���� String.Class�� method�� ȣ��
        System.out.println(str1.length());
        // ���鵵 ���ڿ��� �νİ���.
        str1 = "           hi";
        System.out.println("str1 : " + str1);
        System.out.println(str1.length());
        System.out.println("----------------------------------------------");
        str1 = null; // ���� �ʱ�ȭ
        str1 = "hi" + "one"; // ���ڿ� + ���ڿ� : �����ǹ� ***
        // ���ڿ��� ��ü, �Һ��� Ư¡�� ��
        System.out.println(str1);
        System.out.println("----------------------------------------------");
        str1 = "hi" + 10; // ���ڿ� + ���ڿ� : �����ǹ�
        System.out.println(str1);
        System.out.println("----------------------------------------------");
        // boolean Ÿ�� ���ڿ� + ���ڿ� : �����ǹ�
        str1 = false + "hi";
        System.out.println(str1);
        System.out.println("----------------------------------------------");

    }
}
