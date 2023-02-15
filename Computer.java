import java.util.Random;
import java.util.Arrays;

public class Computer {
	Random r = new Random();
	int select1;
	int select2;
	int finalSelect;
	int[] selArr = new int[2];
	String rps;
	
	public int randomRPS1() {
		System.out.println("첫번째로 낼 것을 컴퓨터가 고민합니다.");
		select1 = r.nextInt(3) + 1;
		selArr[0] = select1;
		System.out.println("======================================");
		return select1;
	}
	
	public int randomRPS2() {
		System.out.println("두번째로 낼 것을 컴퓨터가 고민합니다.");
		select2 = r.nextInt(3) + 1;
		while(select1 == select2) {
			select2 = r.nextInt(3) + 1;
		}
		selArr[1] = select2;
		System.out.println("컴퓨터가 정했습니다!!");
		System.out.println("======================================");
		return select2;
	}
	
	public void comSelect(Referee r) {
		Arrays.sort(selArr);
		select1 = selArr[0];
		select2 = selArr[1];
		System.out.printf("컴퓨터의 선택 : [ %s ], [ %s ]", r.convertKOR(select1), r.convertKOR(select2));
	}
	
	
	public int finalSelect(User u) {
		System.out.println("컴퓨터가 둘 중 하나를 선택합니다.");
		
		if(select1 == 1 && select2 == 2) {
			if (u.select1 == 1 && u.select2 == 2) {
				finalSelect = 2;
			} else if (u.select1 == 1 && u.select2 == 3) {
				finalSelect = 1;
			} else {
				finalSelect = selArr[r.nextInt(1)];
			}
		} else if(select1 == 1 && select2 == 3) {
			if (u.select1 == 1 && u.select2 == 2) {
				finalSelect = selArr[r.nextInt(1)];
			} else if (u.select1 == 1 && u.select2 == 3) {
				finalSelect = 1;
			} else {
				finalSelect = 3;
			}
		} else if(select1 == 2 && select2 == 3) {
			if (u.select1 == 1 && u.select2 == 2) {
				finalSelect = 2;
			} else if (u.select1 == 1 && u.select2 == 3) {
				finalSelect = selArr[r.nextInt(1)];
			} else {
				finalSelect = 3;
			}
		}

		return finalSelect;
	}
}
