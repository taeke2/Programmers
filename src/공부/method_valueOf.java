package ����;

public class method_valueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer tmp = null;
		System.out.println(tmp.toString());
		// toString �� ��ü�� null�� ��� Exception ó���� �Ѵ�.
		System.out.println(String.valueOf(tmp));
		// but valueOf �� ��ü�� null�� ��� 'null' ���ڿ��� ��ȯ�Ѵ�. 
		
		// ***���� : toString ���ٴ� valueOf�� ����ϴ°� �ڵ��� ����.
	}

}
