package java_0127;

public class Ex1_VariableDataType {

    /* ���� ũ��Ÿ���� ��ü�� ū ũ�� Ÿ���� ��ü�� ���� ��� -> Promotion
    -> ���θ���� ���, ������ �ս� ������ ����.
    (���� ũ��Ÿ��) ū ũ��Ÿ�� �� ���� ũ��Ÿ�Կ� ���� ��� -> Casting
    -> ���¸� ��ȯ�ؾ��ϱ� ������ ������ �ս��� ������ ����.
     */
    // Alt + shift + f : �ڵ� ���� �ڵ�
    public static void main(String[] args) {
        // Java������ 1���ڰ� 2byte(Char)ü��
        char cha = 'B';
        System.out.println("char:" + cha);
        // Long���� ���ڿ� L���ڸ� ����
        // *ũ��:  Long�� >>>>> Int��. 
        Long lon = 1L;
        System.out.println("Long:" + lon);
        // float -> �Ǽ��� Ÿ���� �ڿ� F�� �ٿ� ���
        float flo = 3.14f;
        System.out.println("float:" + flo);
        // Boolean Ÿ���� Java���� True, False�� ���.
        // Ÿ IDE or ������ 0,1�ε� ǥ�� ����.
        Boolean tr = true;
        System.out.println("true:" + tr);
        Boolean fal = false;
        System.out.println("false:" + fal);
        int a = 3; // ����� ���ÿ� �ʱⰪ�� ����
        int b; // ����
        b = 3; // ����
        // + ������ : ����, ���ڿ� ���� ������,
        System.out.println("a�� ��:" + a);
        System.out.println("b�� ��:" + b);
        // PDF 2�� 2�� ������ Ÿ�� ���� ����.
        // 4����Ʈ ������ �ڷ����� ������ �� ������ JVM�� �����
        // int ���� �Ǳ� ������ �� ������� ���� ***** 
        // ���� ��ȭ�ϱ� ������ ���ʿ��� �޸𸮻������ ȿ���� �϶�.
        // -> 1)byte��ü�� ����ϴ� ���� ������, ������ ���� ��� int�� ���°� ��ȭ.
        // 2) ĳ������ ���� int�� ��ȯ �� ����.
        // 3) ����� ����� �ٽ� byte�� ����ȯĳ����.
        // 4) ��ȿ����.
        byte d = 100;
        short c = 50;
        System.out.println("d�� ��:" + d);
        System.out.println("c�� ��:" + c);
        // ���ͷ� ����� : \n (����) -> ��������
        System.out.println(
                "���� a�� �� : " + a + "\n"
                + "���� b�� �� : " + b + "\n"
                + "���� c�� �� : " + c + "\n"
                + "���� d�� �� : " + d);
        // long �ڷ���
        long e = 10000000000000000L; // L,l ���ͷ� ���̻�
        System.out.println("Long:" + e);
        // �ý����� ���� �ð��� millisecond -> 1/1000 ���
        System.out.println(System.currentTimeMillis());
        // -> Long��Ÿ���� int�� ���ٴ� ���߻��ϹǷ�, (int) ����ȯ ĳ����.
        // ū �ڷ����� �����͸� ���� �ڷ������� �ٲ� �� ����Ѵ�. - ĳ����, ����
        int times = (int) System.currentTimeMillis();
        // ������� ��ġ�� ����� ǥ�õ��� ����.
        // long�� 8byte -> int 4Byte
        // 1)int���� ������ �Ѿ�� ���̶�� �����÷ξ �߻�.
        // 2) ��Ȯ�� ���� ��µ��� ����
        System.out.println("times:" + times);
        // Long�ڷ����� ����ؼ� ����� ��� ���������� ǥ��.
        // System.currentTimeMillis�� api�� ��ȯ ���� Long�� ��ȯ�ϰ� �ֱ� ����.
        // * Long�� long�� ����-> long�� 8byte, Long�� �ý��ۿ� ���� byte�� ��ȭ.
        Long times1 = System.currentTimeMillis();
        System.out.println("times1:" + times1);
        // ��� -> ���α׷� �����ȿ��� �� �� ������ �� �����ϱ� ���ؼ� ���.
        // [final][�ڷ���][����] = ��; 
        // ������ �߰��� �����ص� ���������, ����� ����Ǿ �ȵ�.
        // ����� �޸𸮿� ���Ǯ�̶�� ���� ����.
        // local������ ������ ����� �빮�ڷ� ǥ���ϴ� ���� ��Ģ.
        // But �������̽� ����� ������ ���� ������ �ҹ��ڷ� ǥ�� �� �� ����.
        final int SIZE;
        SIZE = 5;
        System.out.println("�����:" + SIZE);
        // size = 15; -> �̹� ������ 5�� ����Ǿ��� ������ ������ �Ұ���.

        // *****************************************************************
        System.out.println("************************************************");
        float g = 3.14f; // double => 3.14�̰� -> F,f�� ���ͷ� ���̻� �ʿ�.
        double h = 3.14d; // double, 3.14d�� ����. D, d ���ͷ� ���̻�
        boolean i = true;
        // �ڹٿ����� �� ���ڸ� �����ڵ�� �ν�(2byte)
        char j = 'A'; // ���ڴ� ' '�� ����Ѵ�. " "�� ���� �ڷ���.
        int k = (int) 100L; // ����
        long l = k; // ���θ�� (���� => ū)
        // System.out.print(); -> ������ ���� �ȵ� �Լ�.
        // System.out.println(); -> ������ ���Ե� �Լ�
        System.out.println("float : " + g + "\ndouble : " + h
                + "\nboolean : " + i + "\nchar : " + j + "\nint : " + k
                + "\nlong : " + l);
    }
}
