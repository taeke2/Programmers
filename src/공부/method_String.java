package 공부;

public class method_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // true
		// 문자열의 값을 비교할때는 반드시 equals 를 사용해야 한다. == 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다.

		String a1 = "hello";
		String b1 = new String("hello");
		System.out.println(a1.equals(b1));
		System.out.println(a1 == b1);
		/*
		 * 문자열 a와 b는 모두 "hello"로 같은 값이지만 equals 를 호출했을 때는 true 를 == 연산자를 이용했을 때는 false를
		 * 리턴한다. a와 b는 값은 같지만 서로 다른 객체이다. == 은 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이기 때문에
		 * false를 리턴하게 되는 것이다.
		 */

		String a2 = "Hello Java";
		System.out.println(a2.replaceAll("Java", "World"));	
		//replaceAll은 문자열 중 특정 문자를 다른 문자로 바꾸고 싶을 경우에 사용한다.
		
		String a3 = "Hello Java";
		System.out.println(a3.indexOf("Java"));
		//위와 같은 a라는 문자열에서 "Java"라는 문자열이 시작되는 위치를 알고 싶은 경우에 indexOf를 다음과 같이 사용할 수 있다.
		
		String a4 = "Hello Java";
		System.out.println(a4.substring(0, 4));
		//위처럼 substring(시작위치, 끝위치)와 같이 사용하면 문자열의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다. 단 끝위치는 포함이 안된다는 점에 주의하자. 
		
		String a5 = "Hello Java";
		System.out.println(a.toUpperCase());
		//toUpperCase는 문자열을 모두 대문자로 변경하고자 할 때 사용한다. (모두 소문자로 변경할때는 toLowerCase를 사용하면 된다.)
		
		//ArrayList에 대해서는  => https://wikidocs.net/207
	}

}
