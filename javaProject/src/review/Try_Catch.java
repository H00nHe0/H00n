package review;

public class Try_Catch {

	
	
	public static void main(String[] args) {
		try {
			int result = 10/ 0;
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
		finally {
			System.out.println("try/catch 통과");
		}
	}

}
