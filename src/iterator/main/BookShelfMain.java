package iterator.main;

import iterator.bookshelf.Book;
import iterator.bookshelf.BookShelf;
import iterator.bookshelf.HashMapBookShelf;
import iterator.common.Iterator;
import iterator.common.Person;
import iterator.generics.ArrayListGenerics;

/**
 * Iterator 패턴 
 * 내부를 노출하지 않고, 어떤 객체 집합에 속한 원소들을 순차적으로 접근할 수 있는 방법을 제공하는 패턴.
 * 실제 리스트를 구성하는 항목을 관리하기 위한 List 클래스와는 별도로 
 * List 클래스 객체 내의 항목들을 접근하기 위한 별도의 클래스를 정의해서 사용하는 방식
 * 
 * Iterator 사용 이유
 * 리스트, 맵 등 내부구조가 다른 컨테이너들은 순회하는 방법이 다 다르다.
 * 내부구조가 달라지면 프로그램 내부를 수정해야 하는 경우가 생긴다.
 * 하지만 내부구조가 달라지더라도, 반복자(iterator)를 사용하면 일반화가 가능하다. (객체지향스러움..)
 * 
 * Iterator 패턴 사용 이유
 * 1. Iterator(반복자) 사용시 기본 지원되는 hasNext, next, remove 의 Override 또는 새로운 메소드(기능)를 추가하는 확장성을 위해
 * 2. Array나 list, set 은 기본적으로 iterator를 지원하지만 map 종류는 iterator를 지원하지 않기 때문에 Itreator interface를 상속받아 iterator 패턴으로 구현하여 사용
 *  => map의 경우 key-value의 구조 이기 때문에 key에 대한 iterator인지 value에 대한 iterator 인지 구별 할 수 없기 때문에 아예 제공을 안함
 * 
 * @author dev
 *
 */
public class BookShelfMain {

	public static void main(String[] args) {

		BookShelf bookShelf = new BookShelf(5);
		//HashMapBookShelf bookShelf = new HashMapBookShelf();
		//ArrayListBookShelf bookShelf = new ArrayListBookShelf();
		bookShelf.appendBook(new Book("프로그래밍 jQuery"));
		bookShelf.appendBook(new Book("Effective java"));
		bookShelf.appendBook(new Book("거꾸로 배우는 소프트웨어 개발"));
		bookShelf.appendBook(new Book("테스트 주도 개발 TDD"));
		bookShelf.appendBook(new Book("자바성능 튜닝 이야기"));
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
		bookShelf2.append(new Book("프로그래밍 jQuery"));
		bookShelf2.append(new Book("Effective java"));
		bookShelf2.append(new Book("거꾸로 배우는 소프트웨어 개발"));
		bookShelf2.append(new Book("테스트 주도 개발 TDD"));
		bookShelf2.append(new Book("자바성능 튜닝 이야기"));
		
		Iterator iterator2 = bookShelf2.iterator();
		while (iterator2.hasNext()) {
			System.out.println("No." + iterator2.index() + " " + ((Book) iterator2.next()).getName());
		}
		
		System.out.println("====================================================");
		System.out.println("- ArrayListGenerics personList");
		System.out.println();
		ArrayListGenerics<Person> personList = new ArrayListGenerics<Person>();
		personList.append(new Person("아이유", 22, "가수", "서울"));
		personList.append(new Person("수지", 21, "가수", "서울"));
			
		Iterator personIterator = personList.iterator();
		while (personIterator.hasNext()) {
			System.out.print("No." + personIterator.index());
			Person person = (Person) personIterator.next();
			System.out.println(" name : "+person.getName() + "age : "+ person.getAge());
		}
		System.out.println("====================================================");
	}

}
