package java_0127;

/**
 * @author kosmo_13 2021. 1. 27 / ���� 12:03:30
 */
public class Ex2_Demotion {

    public static void main(String[] args) {
        byte num1 = 10;
        byte num2 = 20;
        // byte num3 = num1 + num2; -> ������ ������ ���, int�� ���°� ��ȯ.
        // ��ȯ�� ���¸� �״�� num3�� ��������� ���°� �ȸ±� ������ ������ ����.
        byte num3 = (byte) (num1 + num2);
        System.out.println(num3);
        System.out.println("------------------------------------");
        // ����) short sh1, sh2�� ���� ���� 100, 200�� ����
        // short sh3�� ���� ���� �� ���
        short sh1 = 100;
        short sh2 = 200;
        short sh3 = (short) (sh1 + sh2);
        System.out.println("result1 : " + sh3);
        // sh3�� ���� ������ ���ϱ� ������ int�� ���� ��ȯ��.
        int sh = sh1 + sh2;
        System.out.println("result2 : " + sh);
        System.out.println("------------------------------------");
        // ------------------�����ڵ� ��ȯ ��� --------------------------
        char ch1 = 'A'; // A�� �����ڵ�� 65
        System.out.println("ch1" + ch1);
        short ch2 = 1;
        System.out.println("�������� ���� : " + (ch1 + ch2));
        char ch3 = (char) (ch1 + ch2); // ���� ��, casting�� ���� �������ֱ�.
        // char���� ���ڷ� ��ȯ �Ѵ�.
        // String�� char������ ������ ���ڵ��� ����.
        System.out.println(ch3); // 66�� �����ڵ�� B
        char ch4 = '��';
        System.out.println(ch4);
        char ch5 = 44032; // 10������ ǥ���� �����ڵ� '��'
        System.out.println("ch : "+ch5);
        char ch_def = '\u0000'; // ���� �ڷ����� �ʱ�ȭ
        System.out.println("char�� �ʱⰪ : " + ch_def);
        char ch6 = '\uac00'; // 16������ ǥ���� �����ڵ� '��'
        System.out.println(ch6);
        // �����ڵ� ���ڿ��� �� ���ھ� char�� �����ؼ� ����� ���� ��밡���ϴ�.
        System.out.println("------------------------------------");
//        // [ABC]
//        // [BBC]
//        String[] doa = {"A", "B", "C"};
//        for (String doa1 : doa) {
//            System.out.println(doa1);
//        }

    }
}
