
public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//오버플로우
		short sMin = -32768, sMax = 32767;	//short = 부호 있는 정수
		char cMin = 0, cMax = 65535;	//char = 부호 없는 정수
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
	}

}
