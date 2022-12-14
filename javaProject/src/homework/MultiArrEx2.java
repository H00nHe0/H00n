package homework;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {

		String[][] words = {{"chair","의자"} // word[0][0],word[0][1]
		,{"computer", "컴퓨터"} //word[1][0],word[1][1]
		,{"integer", "정수"}}; //word[2][0],word[2][1]

		Scanner scv = new Scanner(System.in);
		cls: //라벨선언
			while (true) {	
				for (int i =0 ; i < words.length; i++){
					System.out.printf("문제%d) %s의 뜻은?(종료하려면 -1입력) : ", i+1, words[i][0]);
					String tmp = scv.next();
					if(tmp.equals("-1")) {break cls;}
					else if(tmp.equals(words[i][1])) {
						System.out.printf("정답입니다.\n\n");
					}else {
						System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n", words[i][1]);
					}
				}
			}scv.close();			
	}
}



