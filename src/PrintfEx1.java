
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10.0/3);
		
		
		//정수 지시자
		System.out.printf("%d%n", 15);	//10진수
		System.out.printf("%#o%n", 15);	//8진수
		System.out.printf("%#x%n", 15);	//16진수
		System.out.printf("%s%n", Integer.toBinaryString(15));	//2진 문자열
		
		
		//실수 지시자
		float f = 123.456789f;
		System.out.printf("%f%n", f);	//정밀도 7자리
		System.out.printf("%e%n", f);	//지수방식
		System.out.printf("%g%n", f);	
		double d1 = 123.456789;
		System.out.printf("%f%n", d1);	//정밀도 15자리
		
		
		//정수 지시자 자리 표시
		System.out.printf("[%5d]%n", 10);	//5자리 오른쪽정렬
		System.out.printf("[%5d]%n", 1234567);	//지정된 값이 5자리 이상이므로 모두 출력된다.
		System.out.printf("[%-5d]%n", 10);	//5자리 왼쪽정렬
		System.out.printf("[%05d]%n", 10);	//빈자리 0으로 채움
		
		
		//실수 지시자 자리 표시
		double d2 = 1.23456789;
		System.out.printf("%f%n", d2);	//7자리까지 표시,반올림
		System.out.printf("%14.10f%n", d2);	//총 14자리, 소숫점 아래 10자리
		System.out.printf("%14.6f%n", d2);	//총 14자리, 소숫점 아래 6자리, 반올림
		System.out.printf("%.6f%n", d2);	//소숫점 아래 6자리, 반올림
				
		
		//문자열 지시자 자리 표시
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.8s]%n", "www.codechobo.com");
		
	}

}
