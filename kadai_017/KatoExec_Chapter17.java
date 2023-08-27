package kadai_017;

public class KatoExec_Chapter17 {
	public static void main(String[] args) {
		// 各子クラスのインスタンスを作成する
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		// setGivenNameメソッドで名前を与える
		taro.setGivenName("太郎");
		ichiro.setGivenName("一郎");
		hanako.setGivenName("花子");
		
		// execIntroduceを実行する
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
	}

}