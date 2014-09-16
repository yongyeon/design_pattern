package iterator.common;

/**
 * Iterater(�ݺ���)�� ���� : ��Ҹ� ������� �˻��ذ��� �������̽�(API)�� �����ϴ� ����.
 *                           �v�� ����Ʈ���� ���� ��ġ�� �����ϴ� �����̶�� �����ϸ�ȴ�.
 * 
 * @author dev
 * 
 */
public interface Iterator {
	/**
	 * ���� ��Ұ� �����ϴ��� ���θ� Ȯ��
	 * @return
	 */
	public abstract boolean hasNext();
	 
	/**
	 * ���� ��Ҹ� ����
	 * @return
	 */
	public abstract Object next();
	
	/**
	 * ���� index �� ����
	 * @return
	 */
	public abstract int index();
	
	/**
	 * ��ó�� ��Ҹ� ����
	 * @return
	 */
	public abstract Object first();
	
	/**
	 * �Ǹ����� ��Ҹ� ����
	 * @return
	 */
	public abstract Object last();
	
}
