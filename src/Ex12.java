
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//타입 간 변환
		String str = "3";
			 
		System.out.println(str.charAt(0) - '0');	//문자열>문자>숫자
		System.out.println('3' - '0' + 1);			//문자>숫자
		System.out.println(Integer.parseInt("3") + 1);//문자열>숫자
		System.out.println("3" + 1); 			//숫자>문자열
		System.out.println(3 + '0');	 		// '0'은 숫자로 48
		System.out.println((char)(3 + '0'));	//숫자>문자
	}

}
