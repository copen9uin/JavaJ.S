
public class VarEx2 {

	public static void main(String[] args) {
		final int score = 100;
//		score = 200;
		boolean power = false;
		
		byte b = 127; // -128~127
		
		int oct = 010;  // 8진수
		int hex = 0x10; //16진수
	
		long l = 1000_000_000;
		
		float f = 3.14f;
		double d = 3.14;
		
		System.out.println(power);  
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(l);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		
		//문자와 문자열 리터럴
		char ch = 'A';
		
		String str = "";	// 빈 문자열 (empty sting)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(ch);
		System.out.println(str4);
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		

	}

} 
