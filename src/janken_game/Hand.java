package janken_game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hand {
	private int hand;

	//手を入力で指定
	public void setHand() {
		System.out.println("何を出しますか？");
        System.out.println("グー：1、チョキ：2、パー：3");

        while(true) {
        	try {
        		Scanner scan = new Scanner(System.in);
                this.hand = scan.nextInt();
                if(hand == 0 || hand >= 4) {
                	System.out.println("数値は1,2,3から選んでください");
                	this.hand = scan.nextInt();
                	//連続でできない　２回連続で正しくない数値を入れるとnullが返ってくる
                }
                break;
        	}catch(InputMismatchException e) {
        		System.out.println("数値で入力してください。");
        	}
        }
	}

	//手をランダムに設定
	public void setRandomHand() {
		Random random = new Random();
		this.hand = random.nextInt(3)+1;
	}

	//手の名称を返す
	public String handName() {
		String handName = null;
		if(this.hand == 1) handName = "グー";
        if(this.hand == 2) handName = "チョキ";
        if(this.hand == 3) handName = "パー";
        return handName;
	}

	//手の値を返す
	public int hand() {
		return this.hand;
	}

}
