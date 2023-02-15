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
		System.out.print("����(1), ����(2), ��(3) ���� : ");
		select1 = sc.nextInt();
		if (select1 < 1 || select1 > 3) {
			System.out.println("������ ������ϴ�. �ٽ� �Է��ϼ���!!");
		}
		System.out.println("======================================");
		selArr[0] = select1;
		return select1 >= 1 && select1 <= 3 ? select1 : selectRPS1();
	}
	
	public int selectRPS2() {
		System.out.println("2��° ����");
		System.out.print("����(1), ����(2), ��(3) ���� : ");
		select2 = sc.nextInt();
		while(select1 == select2)
		{
			System.out.print("ù ��°�� �����ϴ�. �ٸ� ���� ������ : ");
			select2 = sc.nextInt();
		}
		if (select2 < 1 || select2 > 3) {
		
			System.out.println("������ ������ϴ�. �ٽ� �Է��ϼ���!!");
		}
		System.out.println("======================================");
		selArr[1] = select2;
		Arrays.sort(selArr);
		select1 = selArr[0];
		select2 = selArr[1];
		return select2 >= 1 && select2 <= 3 ? select2 : selectRPS2();
	}
	
	
	public int finalSelect(Referee r) {
		
		System.out.println("[ ���� ���� ]");
		System.out.printf("(%s : %d or %s : %d) �� �ϳ� ���� : ",r.convertKOR(select1),
				select1, r.convertKOR(select2), select2);
		finalSelect = sc.nextInt();
		while(finalSelect != select1 && finalSelect != select2) {
			System.out.print("�߸� �Է��߽��ϴ�. �ٽ� �Է� : ");
			finalSelect = sc.nextInt();
		}
		System.out.println("���� �������� �Ϸ�");
		System.out.println("======================================");
		return finalSelect;
		
	}
}
