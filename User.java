import java.util.Arrays;
import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	int select1;
	int select2;
	int finalSelect;
	int[] selArr = new int[2];
	String rps;
	public int selectRPS1() {
		System.out.print("가위(1), 바위(2), 보(3) 선택 : ");
		select1 = sc.nextInt();
		if (select1 < 1 || select1 > 3) {
			System.out.println("범위를 벗어났습니다. 다시 입력하세요!!");
		}
		System.out.println("======================================");
		selArr[0] = select1;
		return select1 >= 1 && select1 <= 3 ? select1 : selectRPS1();
	}
	
	public int selectRPS2() {
		System.out.println("2번째 선택");
		System.out.print("가위(1), 바위(2), 보(3) 선택 : ");
		select2 = sc.nextInt();
		while(select1 == select2)
		{
			System.out.print("첫 번째와 같습니다. 다른 것을 고르세요 : ");
			select2 = sc.nextInt();
		}
		if (select2 < 1 || select2 > 3) {
		
			System.out.println("범위를 벗어났습니다. 다시 입력하세요!!");
		}
		System.out.println("======================================");
		selArr[1] = select2;
		Arrays.sort(selArr);
		select1 = selArr[0];
		select2 = selArr[1];
		return select2 >= 1 && select2 <= 3 ? select2 : selectRPS2();
	}
	
	
	public int finalSelect(Referee r) {
		
		System.out.println("[ 최종 선택 ]");
		System.out.printf("(%s : %d or %s : %d) 중 하나 선택 : ",r.convertKOR(select1),
				select1, r.convertKOR(select2), select2);
		finalSelect = sc.nextInt();
		while(finalSelect != select1 && finalSelect != select2) {
			System.out.print("잘못 입력했습니다. 다시 입력 : ");
			finalSelect = sc.nextInt();
		}
		System.out.println("유저 최종선택 완료");
		System.out.println("======================================");
		return finalSelect;
		
	}
}
