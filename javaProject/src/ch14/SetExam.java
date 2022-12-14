package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		//Set은 중복값을 허용하지 않음
		hs.add("KOREA");
		hs.add("JAPAN");
		hs.add("AMERICA");
		hs.add("BRITAIN");
		hs.add("KOREA"); //중복된 값은 처리되지 않는다.
		System.out.println(hs);
		for(String str : hs) {
			System.out.println(str);
		}
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {//다음요소가 있으면 true
			System.out.println(it.next());//다음 요소를 꺼냄
		}
	}

}
