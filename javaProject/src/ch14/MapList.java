package ch14;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map<String,Object> map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");//map에서는 key로 데이터를 불러온다.
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();//맵 인스턴스 생성
		List<Student> list = new ArrayList<>(); //리스트 인스턴스 생성
		list.add(new Student("201801","Kim","전산",1,"park"));//리스트에 Student추가
		list.add(new Student("201902","Choi","영문",3,"hong"));//리스트에 Student추가
		list.add(new Student("202003","Lee","경제",2,"min"));//리스트에 Student추가
		map.put("list", list);//맵에 리스트를 추가
		
		print(map);//압축파일처럼 list안의 3개의 객체가 map에 담겨져 print쪽의 매개변수화되어 넘김
	
	
	}
}
