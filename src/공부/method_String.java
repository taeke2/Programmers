package ����;

public class method_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // true
		// ���ڿ��� ���� ���Ҷ��� �ݵ�� equals �� ����ؾ� �Ѵ�. == �����ڸ� ����� ��� ������ ���� ��찡 �߻��� �� �ִ�.

		String a1 = "hello";
		String b1 = new String("hello");
		System.out.println(a1.equals(b1));
		System.out.println(a1 == b1);
		/*
		 * ���ڿ� a�� b�� ��� "hello"�� ���� �������� equals �� ȣ������ ���� true �� == �����ڸ� �̿����� ���� false��
		 * �����Ѵ�. a�� b�� ���� ������ ���� �ٸ� ��ü�̴�. == �� �ΰ��� �ڷ����� ������ ��ü������ �Ǻ��� �� ����ϴ� �������̱� ������
		 * false�� �����ϰ� �Ǵ� ���̴�.
		 */

		String a2 = "Hello Java";
		System.out.println(a2.replaceAll("Java", "World"));	
		//replaceAll�� ���ڿ� �� Ư�� ���ڸ� �ٸ� ���ڷ� �ٲٰ� ���� ��쿡 ����Ѵ�.
		
		String a3 = "Hello Java";
		System.out.println(a3.indexOf("Java"));
		//���� ���� a��� ���ڿ����� "Java"��� ���ڿ��� ���۵Ǵ� ��ġ�� �˰� ���� ��쿡 indexOf�� ������ ���� ����� �� �ִ�.
		
		String a4 = "Hello Java";
		System.out.println(a4.substring(0, 4));
		//��ó�� substring(������ġ, ����ġ)�� ���� ����ϸ� ���ڿ��� ������ġ���� ����ġ������ ���ڸ� �̾Ƴ��� �ȴ�. �� ����ġ�� ������ �ȵȴٴ� ���� ��������. 
		
		String a5 = "Hello Java";
		System.out.println(a.toUpperCase());
		//toUpperCase�� ���ڿ��� ��� �빮�ڷ� �����ϰ��� �� �� ����Ѵ�. (��� �ҹ��ڷ� �����Ҷ��� toLowerCase�� ����ϸ� �ȴ�.)
		
		//ArrayList�� ���ؼ���  => https://wikidocs.net/207
	}

}
