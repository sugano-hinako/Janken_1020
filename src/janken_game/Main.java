package janken_game;

public class Main {

	public static void main(String[] args) {
		GameControll gc = new GameControll();
		gc.start(); // ゲーム開始
		for (int count = 1; count < 4; count++) {
			gc.game();
		}
		gc.judge();
		gc.end(); // ゲーム終了

	}

}
