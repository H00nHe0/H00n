package homework;

import java.util.Scanner;

public class My_First_Project {

	public static void main(String[] args) {

		int menu =0;
		int kor = 0,eng =0,chn=0;

		Scanner sc = new Scanner(System.in);

		out:

			while(true) {
				System.out.println("저희 식당에 찾아주셔서 감사합니다.!");

				System.out.println("(1) 한식");
				System.out.println("(2) 양식");
				System.out.println("(3) 중식");
				System.out.print("식사하실 종류(1~3)를 선택해 주세요.(종료 : 0)=> ");
				menu = sc.nextInt();
				

				if (menu ==0) {
					System.out.print("주문이 종료되었습니다.");
					break;
				}else if (menu < 1 || menu > 3){
					System.out.println("선택이 잘못 되었습니다. 다시 선택해 주세요.");
					continue;
				}cls:
				for (;;) {
					if (menu < 1 || menu > 3){
						System.out.println("선택이 잘못 되었습니다. 다시 선택해 주세요.");
						continue;}
					else if (menu == 0) {System.out.print("주문이 종료되었습니다."); break cls;}
					
					else if (menu == 1) {
					
						System.out.println("[한식메뉴]");	
						System.out.println("(1) 김치찌개");
						System.out.println("(2) 된장찌개");
						System.out.println("(3) 삼겹살");
						System.out.println("(4) 비빔밥");
						System.out.print("위의 메뉴중에 골라주세요.(한식메뉴선택종료:0,전체종료:00) : ");	
						kor = sc.nextInt();
						
					}else if (menu ==2) {
						System.out.println("[양식메뉴]");	
						System.out.println("(1) 돈까스");
						System.out.println("(2) 비프스테이크");
						System.out.println("(3) 카레라이스");
						System.out.print("위의 메뉴중에 골라주세요.(양식메뉴선택종료:0,전체종료:00) : ");
						eng = sc.nextInt();

					}else if (menu ==3) {
						System.out.println("[중식메뉴]");	
						System.out.println("(1) 짜장면");
						System.out.println("(2) 짬뽕");
						System.out.println("(3) 탕수육");
						System.out.print("위의 메뉴중에 골라주세요.(중식메뉴선택종료:0,전체종료:00) : ");
						chn = sc.nextInt();
					}
					
					switch (kor) {
					case 1 :
						System.out.println("고객님은 김치찌개를 선택 하셨습니다. "); break;
					case 2 :
						System.out.println("고객님은 된장찌개를 선택 하셨습니다. "); break;
					case 3 :
						System.out.println("고객님은 삼겹살을 선택 하셨습니다. "); break;
					case 4 :
						System.out.println("고객님은 비빔밥을 선택 하셨습니다. "); break;
					}
					switch (eng) {
					case 1 :
						System.out.println("고객님은 돈까스를 선택 하셨습니다. "); break;
					case 2 :	
						System.out.println("고객님은 비프스테이크를 선택 하셨습니다. "); break;
					case 3 :
						System.out.println("고객님은  카레라이스를 선택 하셨습니다. "); break;
					}
					switch (chn) {
					case 1 :
						System.out.println("고객님은 짜장면을 선택 하셨습니다. "); break;
					case 2 :
						System.out.println("고객님은 짬뽕을 선택 하셨습니다. "); break;
					case 3 :
						System.out.println("고객님은  탕수육을 선택 하셨습니다. "); break;
					}
						}
					}
					}
				}
	





