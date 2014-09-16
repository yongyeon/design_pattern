package iterator.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 
 * ### List와 Map의 Iterator 지원여부 샘플
 * 
 * Iterator 패턴 사용 이유
 * 1. Iterator(반복자) 사용시 기본 지원되는 hasNext, next, remove 의 Override 또는 새로운 메소드(기능)를 추가하는 확장성을 위해
 * 2. Array나 list, set 은 기본적으로 iterator를 지원하지만 map 종류는 iterator를 지원하지 않기 때문에 Itreator interface를 상속받아 iterator 패턴으로 구현하여 사용
 *  => map의 경우 key-value의 구조 이기 때문에 key에 대한 iterator인지 value에 대한 iterator 인지 구별 할 수 없기 때문에 아예 제공을 안함
 *   
 * @author dev
 */

public class IteratorTestSample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for( int i = 0; i < 20; i++ ) {
			list.add( i );
		}

		// list. 을 입력하였을 경우 기본적으로 Iterator가 제공됨
		Iterator<Integer> itr = list.iterator();
		
		while ( itr.hasNext() ) {
			System.out.println( list.get( itr.next() ) );
		}
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("history", "역사");
		map.put("financial", "재테크");
		map.put("computer", "컴퓨터");
		
		// map. 을 입력하였을 경우 기본적으로 Iterator는 제공되지 않음
		// map.
		System.out.println(map.get("financial"));
	}

}
