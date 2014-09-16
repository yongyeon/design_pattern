package iterator.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 
 * ### List�� Map�� Iterator �������� ����
 * 
 * Iterator ���� ��� ����
 * 1. Iterator(�ݺ���) ���� �⺻ �����Ǵ� hasNext, next, remove �� Override �Ǵ� ���ο� �޼ҵ�(���)�� �߰��ϴ� Ȯ�强�� ����
 * 2. Array�� list, set �� �⺻������ iterator�� ���������� map ������ iterator�� �������� �ʱ� ������ Itreator interface�� ��ӹ޾� iterator �������� �����Ͽ� ���
 *  => map�� ��� key-value�� ���� �̱� ������ key�� ���� iterator���� value�� ���� iterator ���� ���� �� �� ���� ������ �ƿ� ������ ����
 *   
 * @author dev
 */

public class IteratorTestSample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for( int i = 0; i < 20; i++ ) {
			list.add( i );
		}

		// list. �� �Է��Ͽ��� ��� �⺻������ Iterator�� ������
		Iterator<Integer> itr = list.iterator();
		
		while ( itr.hasNext() ) {
			System.out.println( list.get( itr.next() ) );
		}
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("history", "����");
		map.put("financial", "����ũ");
		map.put("computer", "��ǻ��");
		
		// map. �� �Է��Ͽ��� ��� �⺻������ Iterator�� �������� ����
		// map.
		System.out.println(map.get("financial"));
	}

}
