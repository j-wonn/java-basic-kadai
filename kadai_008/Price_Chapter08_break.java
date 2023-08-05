package kadai_008;

public class Price_Chapter08_break {
	public static void main(String[] args) {
		int userAge = 30, serviceCost = 3000;
		
		switch(userAge) {
			case 10 :
				serviceCost = 1000;
				break;
			case 20 :
				serviceCost = 2000;
				break;
			case 30 :
				serviceCost = 3000;
				break;
			case 40 :
				serviceCost = 4000;
				break;
			case 50 :
				serviceCost = 5000;
				break;
			case 60 :
				serviceCost = 6000;
				break;
			case 70 :
				serviceCost = 7000;
				break;
			case 80 :
				serviceCost = 8000;
				break;
			default :
				serviceCost = 500;
		}
		
		// 教材には、switch式で作成するよう指定。break文ではエラー
		// switch式で、break文を使う場合は、yieldの方を使う？
		// テラコヤの教材には、記述はなかった。
		
		/* serviceCost = switch(userAge) {
			case 10 :
				yield 1000;
			case 20 :
				yield 2000;
			case 30 :
				yield 3000;
			case 40 :
				yield 4000;
			case 50 :
				yield 5000;
			case 60 :
				yield 6000;
			case 70 :
				yield 7000;
			case 80 :
				yield 8000;
			default :
				yield 500;
		}; */
		
		System.out.println( userAge + "代の料金は" + serviceCost + '円');
	}
}
