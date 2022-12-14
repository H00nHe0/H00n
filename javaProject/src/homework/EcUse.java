package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	static void info(Map<String,Object> map) {
		ArrayList<EC> list2 = (ArrayList<EC>)map.get("list");
		for(EC e : list2) {
			System.out.println(e.getNo()+"\t"+e.getOderDate()+"\t"+e.getProduct()+"\t"+e.getCardName()+"\t"+(e.getCardNo())+"\t"+e.getPay());
		}
	}
	public static void main(String[] args) {
		EC ee = new EC();
		Map<String,Object> map = new HashMap<>();
		List<EC> list = new ArrayList<>();
		EC e1 = new EC(1234, "2022-08-24", "하이트맥주", "삼성", "37918000068", 55900);
		list.add(e1);
		EC e2 = new EC(2345, "2022-09-11", "꼬깔콘", "	롯데", "35691000045", 23600);
		list.add(e2);
		EC e3 = new EC(3456, "2022-10-29", "노트북", "	현대", "36160000082", 2600000);
		list.add(e3);
		map.put("list", list);
		ee.print();
		info(map);
	}

}
