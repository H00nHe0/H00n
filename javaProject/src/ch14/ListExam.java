package ch14;

import java.util.ArrayList;
import java.util.List;

//ArrayList : Vector와 사용법이 비슷하지만 좀더 가볍고,속도가 빠름
public class ListExam {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>(); //좌:부(List), 우:자(ArrayList)=>다형성기법
		list.add("하나"); //리스트.add(추가할 값)
		list.add(2);
		list.add(5.5);
		list.add(false);
		//list.add(2,4); //리스트.add(인덱스번호,추가할 값)
		//list.remove(3);//리스트.remove(제거할 인덱스번호)
		
		for(int i =0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
	}
}
