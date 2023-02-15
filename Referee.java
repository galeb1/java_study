
public class Referee {
	
	int comWin;
	int userWin;
	int draw;
	
	public void rullbook() {
		System.out.println("[ 하나빼기 게임 ]");
		System.out.println("1 : 가위 | 2 : 바위 | 3 : 보");
		System.out.println("======================================");
	}
	
	public int comSelect1(Computer c) {
		return c.randomRPS1();
	}
	
	public int comSelect2(Computer c) {
		return c.randomRPS2();
	}
	
	public int userSelect1(User u) {
		return u.selectRPS1();
	}
	
	public int userSelect2(User u) {
		return u.selectRPS2();
	}
	
	public int comFinal(Computer c, User u) {
		return c.finalSelect(u);
	}
	
	public int userFinal(User u, Referee r) {
		return u.finalSelect(r);
	}

	public String convertKOR(int select) {
		switch (select) {
		case 1:
			return "가위";
			
		case 2:
			return "바위";
			
		case 3:
			return "보";
		}
		return null;
	}
	
	public void compareRPS(Computer c, User u) {
		System.out.println("결과를 발표합니다!!");
		System.out.printf("컴퓨터 : %s | 유저 : %s\n", c.rps, u.rps);
		
		if (c.finalSelect - u.finalSelect == 0) {
			System.out.println("비겼습니다.");
			draw++;
		} else if (c.finalSelect - u.finalSelect == 1 || c.finalSelect - u.finalSelect == -2 ) {
			System.out.println("유저가 졌습니다.");
			comWin++;
		} else if (c.finalSelect - u.finalSelect == -1 || c.finalSelect - u.finalSelect == 2 ){
			System.out.println("유저가 이겼습니다.");
			userWin++;
		}
		System.out.println("======================================");
		
	}
	
	public void howManyWin() {
		System.out.printf("유저 전적 : %d승, %d무\n", userWin, draw);
	}
	
	public void playGame(Computer c, User u, Referee r) {
		rullbook();
		
		while(comWin == 0) {
		c.select1 = comSelect1(c);
		c.select2 = comSelect2(c);
		u.select1 = userSelect1(u);
		u.select2 = userSelect2(u);
		c.comSelect(r);
		c.finalSelect = comFinal(c, u);
		u.finalSelect = userFinal(u, r);
		c.rps = convertKOR(c.finalSelect);
		u.rps = convertKOR(u.finalSelect);
		compareRPS(c, u);
		}
		howManyWin();
	}
}
