package ����;

import java.util.HashMap;

public class method_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ��������� ���� ��� �������� "�̸�" = "ȫ�浿", "����" = "�� �� �� ��" ������ ������ �� �ִ�. �ڹ��� ��(Map)�� �̷���
		 * �������踦 ���� ǥ���� �� �ְ� �� �ִ� �ڷ����̴�. �̰��� ���� ������ ��κ��� ���鵵 ���� �ִ� �ڷ������� Associative
		 * array, Hash��� �Ҹ���.
		 * 
		 * ��(Map)�� ����(dictionary)�� ����ϴ�. ��, people �̶� �ܾ "���", baseball �̶�� �ܾ "�߱�"���
		 * ���� ���յǵ��� Map�� Key�� Value��� ���� �� ������ ���� �ڷ����̴�.
		 * 
		 * Map�� ����Ʈ�� �迭ó�� ����������(sequential) �ش� ��� ���� ������ �ʰ� key�� ���� value�� ��´�. ��(Map)��
		 * ���� ū Ư¡�̶�� key�� value�� ���ٴ� ���̴�. baseball�̶� �ܾ��� ���� ã�� ���ؼ� ������ ������ ���������� ���
		 * �˻��ϴ� ���� �ƴ϶� baseball�̶�� �ܾ �ִ� ������ ���ĺ��� ���̴�.
		 */
		
		//Map �߿� ���� ������ HashMap
		
		//����
		HashMap<String, String> map = new HashMap<String,String>();
		//HashMap<key �ڷ���, value �ڷ���> �����̸� = new HashMap<>();
		
		map.put("people", "���");						//key�� value�� �Է�
		map.put("baseball", "�߱�");

		System.out.println(map.get("people"));			//key�� �ش��ϴ� �� ���
		System.out.println(map.containsKey("people"));	//Map�� �ش� Ű�� �����ϴ��� �˷���, bealoon�� (true / false) ��ȯ
		System.out.println(map.remove("people"));		//key�� �ش��ϴ� �� ����
		System.out.println(map.size());					//Map�� ũ�� (���� 2���� ���� �־��� ������ 2�� ��ȯ��)
	}

}
