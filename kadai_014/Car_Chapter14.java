package kadai_014;

public class Car_Chapter14 {
	// 車クラスは、ギアチェンジすると速度が変わり、走行した時に変わった速度が表示される
	private int gear  = 1;  // 1速から5速のギアを表す(初期値１) 
	private int speed = 10; // ギアチェンジ後の速度を表す(初期値１０)
	
	// ギアの値により速度を変えるメソッド
	public void gearChange(int afterGear) {
		speed = switch(afterGear) {
		case 1  -> 10;
		case 2  -> 20;
		case 3  -> 30;
		case 4  -> 40;
		case 5  -> 50;
		default -> 10;
		};
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
