
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10.0/3);
		
		
		//���� ������
		System.out.printf("%d%n", 15);	//10����
		System.out.printf("%#o%n", 15);	//8����
		System.out.printf("%#x%n", 15);	//16����
		System.out.printf("%s%n", Integer.toBinaryString(15));	//2�� ���ڿ�
		
		
		//�Ǽ� ������
		float f = 123.456789f;
		System.out.printf("%f%n", f);	//���е� 7�ڸ�
		System.out.printf("%e%n", f);	//�������
		System.out.printf("%g%n", f);	
		double d1 = 123.456789;
		System.out.printf("%f%n", d1);	//���е� 15�ڸ�
		
		
		//���� ������ �ڸ� ǥ��
		System.out.printf("[%5d]%n", 10);	//5�ڸ� ����������
		System.out.printf("[%5d]%n", 1234567);	//������ ���� 5�ڸ� �̻��̹Ƿ� ��� ��µȴ�.
		System.out.printf("[%-5d]%n", 10);	//5�ڸ� ��������
		System.out.printf("[%05d]%n", 10);	//���ڸ� 0���� ä��
		
		
		//�Ǽ� ������ �ڸ� ǥ��
		double d2 = 1.23456789;
		System.out.printf("%f%n", d2);	//7�ڸ����� ǥ��,�ݿø�
		System.out.printf("%14.10f%n", d2);	//�� 14�ڸ�, �Ҽ��� �Ʒ� 10�ڸ�
		System.out.printf("%14.6f%n", d2);	//�� 14�ڸ�, �Ҽ��� �Ʒ� 6�ڸ�, �ݿø�
		System.out.printf("%.6f%n", d2);	//�Ҽ��� �Ʒ� 6�ڸ�, �ݿø�
				
		
		//���ڿ� ������ �ڸ� ǥ��
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.8s]%n", "www.codechobo.com");
		
	}

}
