
public class OMain1 {

	public static void main(String[] args) {
		Referee r = new Referee();
		Computer c = new Computer();
		User u = new User();
		
		r.playGame(c, u, r);
	}
}
