
public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�����÷ο�
		short sMin = -32768, sMax = 32767;	//short = ��ȣ �ִ� ����
		char cMin = 0, cMax = 65535;	//char = ��ȣ ���� ����
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1 = " + (int)++cMax);
	}

}