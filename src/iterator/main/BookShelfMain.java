package iterator.main;

import iterator.bookshelf.Book;
import iterator.bookshelf.BookShelf;
import iterator.bookshelf.HashMapBookShelf;
import iterator.common.Iterator;
import iterator.common.Person;
import iterator.generics.ArrayListGenerics;

/**
 * Iterator ���� 
 * ���θ� �������� �ʰ�, � ��ü ���տ� ���� ���ҵ��� ���������� ������ �� �ִ� ����� �����ϴ� ����.
 * ���� ����Ʈ�� �����ϴ� �׸��� �����ϱ� ���� List Ŭ�����ʹ� ������ 
 * List Ŭ���� ��ü ���� �׸���� �����ϱ� ���� ������ Ŭ������ �����ؼ� ����ϴ� ���
 * 
 * Iterator ��� ����
 * ����Ʈ, �� �� ���α����� �ٸ� �����̳ʵ��� ��ȸ�ϴ� ����� �� �ٸ���.
 * ���α����� �޶����� ���α׷� ���θ� �����ؾ� �ϴ� ��찡 �����.
 * ������ ���α����� �޶�������, �ݺ���(iterator)�� ����ϸ� �Ϲ�ȭ�� �����ϴ�. (��ü���⽺����..)
 * 
 * Iterator ���� ��� ����
 * 1. Iterator(�ݺ���) ���� �⺻ �����Ǵ� hasNext, next, remove �� Override �Ǵ� ���ο� �޼ҵ�(���)�� �߰��ϴ� Ȯ�强�� ����
 * 2. Array�� list, set �� �⺻������ iterator�� ���������� map ������ iterator�� �������� �ʱ� ������ Itreator interface�� ��ӹ޾� iterator �������� �����Ͽ� ���
 *  => map�� ��� key-value�� ���� �̱� ������ key�� ���� iterator���� value�� ���� iterator ���� ���� �� �� ���� ������ �ƿ� ������ ����
 * 
 * @author dev
 *
 */
public class BookShelfMain {

	public static void main(String[] args) {

		BookShelf bookShelf = new BookShelf(5);
		//HashMapBookShelf bookShelf = new HashMapBookShelf();
		//ArrayListBookShelf bookShelf = new ArrayListBookShelf();
		bookShelf.appendBook(new Book("���α׷��� jQuery"));
		bookShelf.appendBook(new Book("Effective java"));
		bookShelf.appendBook(new Book("�Ųٷ� ���� ����Ʈ���� ����"));
		bookShelf.appendBook(new Book("�׽�Ʈ �ֵ� ���� TDD"));
		bookShelf.appendBook(new Book("�ڹټ��� Ʃ�� �̾߱�"));
		Iterator iterator = bookShelf.iterator();

		while (iterator.hasNext()) {
			System.out.println("No." + iterator.index() + " " + ((Book) iterator.next()).getName());
		}
		
		System.out.println("====================================================");
		
		System.out.println("- iterator.first()");
		System.out.println();
		Book book = (Book) iterator.first();
		System.out.println("No." + iterator.index() + " : " + book.getName());
		System.out.println();
		
		System.out.println("- iterator.last()");
		System.out.println();
		book = (Book) iterator.last();
		System.out.println("No." + iterator.index() + " : " + book.getName());
		
		System.out.println("====================================================");
		System.out.println("- ArrayListGenerics bookShelf2");
		System.out.println();
		ArrayListGenerics<Book> bookShelf2 = new ArrayListGenerics<Book>();
		bookShelf2.append(new Book("���α׷��� jQuery"));
		bookShelf2.append(new Book("Effective java"));
		bookShelf2.append(new Book("�Ųٷ� ���� ����Ʈ���� ����"));
		bookShelf2.append(new Book("�׽�Ʈ �ֵ� ���� TDD"));
		bookShelf2.append(new Book("�ڹټ��� Ʃ�� �̾߱�"));
		
		Iterator iterator2 = bookShelf2.iterator();
		while (iterator2.hasNext()) {
			System.out.println("No." + iterator2.index() + " " + ((Book) iterator2.next()).getName());
		}
		
		System.out.println("====================================================");
		System.out.println("- ArrayListGenerics personList");
		System.out.println();
		ArrayListGenerics<Person> personList = new ArrayListGenerics<Person>();
		personList.append(new Person("������", 22, "����", "����"));
		personList.append(new Person("����", 21, "����", "����"));
			
		Iterator personIterator = personList.iterator();
		while (personIterator.hasNext()) {
			System.out.print("No." + personIterator.index());
			Person person = (Person) personIterator.next();
			System.out.println(" name : "+person.getName() + "age : "+ person.getAge());
		}
		System.out.println("====================================================");
	}

}
