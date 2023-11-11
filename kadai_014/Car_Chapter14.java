package kadai_014;

public class Car_Chapter14 {
	
	// フィールド
	private int gear = 1; // 	1速から5速のギア
	private int speed = 10; //  ギアチェンジ後の速度
	
	// メソッド
	// ギアの値により速度を変える
	public void gearChange(int afterGear) {
		
		switch(afterGear) {
			case 1:
				this.speed = 10;
				break;
			case 2:
				this.speed = 20;
				break;
			case 3:
				this.speed = 30;
				break;
			case 4:
				this.speed = 40;
				break;
			case 5: 
				this.speed = 50;
				break;
			default: 
				this.speed = 10;
			    break;
		}
		
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
