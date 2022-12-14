package ch04;

public class SwitchReview {

	public static void main(String[] args) {

		int jan = 50;
		int feb = 30;
		int mar = 70;
		int apr = 90;
		int may = 60;
		int tot = (jan+feb+mar+apr+may);
		double avg = tot / 5.0;
		String grade = "";
		
		switch ((int)tot / 100) {
		case 6: grade = "VIP"; break;
		case 5: grade = "Diamond"; break;
		case 4: grade = "Gold"; break;
		case 3: grade = "Silver"; break;
		case 2: grade = "Bronze"; break;

		default: grade = "하수";
			break;
		}System.out.println("1월\t2월\t3월\t4월\t5월\t총구매\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%.1f\t%s", jan,feb,mar,apr,may,tot,avg,grade);
		
	}

}
