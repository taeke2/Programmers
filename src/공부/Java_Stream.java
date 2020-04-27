package ����;

import java.util.*;
import java.util.stream.Stream;

public class Java_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Stream�� "�÷���, �迭 ���� ���� ��Ҹ� �ϳ��� �����ϸ� �Լ��� �������̽�(���ٽ�)�� �����ϸ�
		// �ݺ������� ó���� �� �ֵ��� ���ִ� ���

		Double[] dArray = { 3.1, 3.2, 3.3 };
		Arrays.stream(dArray); // �迭�� ��Ʈ�� ����

		Stream<Integer> str = Stream.of(1, 2); // ��Ʈ�� ���� ����

		List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
		names.stream(); // Collection���� ��Ʈ�� ����
		// -------------------------------------------------------------------

		// ������ �ڵ����
		long count = 0;
		for (String name : names) {
			if (name.contains("o"))
				count++;
		}
		System.out.println("Normal Count : " + count);

		// ��Ʈ���� �̿��� ���
		count = 0;
		count = names.stream().filter(x -> x.contains("o")).count();
		System.out.println("Stream Count : " + count);
	}

}
