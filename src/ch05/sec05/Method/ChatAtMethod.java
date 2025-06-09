package ch05.sec05.Method;

public class ChatAtMethod {
	public static void main(String[] args){
		String gender = checkGender("900912-1998765");
		String gender2 = checkGender("900912-1998765");
		// 8번쨰 문자가 '2', '4' > 여자 리턴
		// 8번쨰 문자가 '1', '3' > 남자 리턴
		// 8번째 문자가 '1', '2', '3', '4'가 아니면  null리턴
		System.out.println(gender);
		System.out.println(gender2);
	}

	public static String checkGender(String gender){
		char num = gender.charAt(7);
		return switch (num) {
			case '1', '3' -> "남";
			case '2', '4' -> "여";
			default -> "null";
		};
	}
}
