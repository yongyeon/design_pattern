package iterator.common;

import iterator.common.Iterator;

/**
 * Aggregate(����ü)�� ���� : Iterator ������ ������ �������̽�(API)�� �����Ѵ�. 
 *                            ������� �˻����ִ� �������̽��� ���� Iterator(�ݺ���)�� ����ϴ� �������̽�
 * @author dev
 *
 */
public interface Aggregate {
	public abstract Iterator iterator();
}
