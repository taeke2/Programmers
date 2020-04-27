package 공부;

public class method_valueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer tmp = null;
		System.out.println(tmp.toString());
		// toString 은 객체가 null일 경우 Exception 처리를 한다.
		System.out.println(String.valueOf(tmp));
		// but valueOf 는 객체가 null일 경우 'null' 문자열을 반환한다. 
		
		// ***참고 : toString 보다는 valueOf를 사용하는게 코딩에 좋다.
	}

}
