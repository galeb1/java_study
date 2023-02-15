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
		System.out.println("ù��°�� �� ���� ��ǻ�Ͱ� ����մϴ�.");
		select1 = r.nextInt(3) + 1;
		selArr[0] = select1;
		System.out.println("======================================");
		return select1;
	}
	
	public int randomRPS2() {
		System.out.println("�ι�°�� �� ���� ��ǻ�Ͱ� ����մϴ�.");
		select2 = r.nextInt(3) + 1;
		while(select1 == select2) {
			select2 = r.nextInt(3) + 1;
		}
		selArr[1] = select2;
		System.out.println("��ǻ�Ͱ� ���߽��ϴ�!!");
		System.out.println("======================================");
		return select2;
	}
	
	public void comSelect(Referee r) {
		Arrays.sort(selArr);
		select1 = selArr[0];
		select2 = selArr[1];
		System.out.printf("��ǻ���� ���� : [ %s ], [ %s ]", r.convertKOR(select1), r.convertKOR(select2));
	}
	
	
	public int finalSelect(User u) {
		System.out.println("��ǻ�Ͱ� �� �� �ϳ��� �����մϴ�.");
		
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
