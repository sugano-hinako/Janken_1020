package janken_game;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GameControll gc = new GameControll();
		gc.start(); // ゲーム開始
		for(int count = 1; count < 4; count++) {
			System.out.println("カウント"+ count);
			gc.game();
		}
		gc.judge();
        gc.end();   // ゲーム終了

	}

}
