package kadai_017;

public class KatoExec_Chapter17 {
	public static void main(String[] args) {
		
	//インスタンス
	KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
	KatoIchiro_Chapter17 Ichiro = new KatoIchiro_Chapter17();
	KatoHanako_Chapter17 Hanako = new KatoHanako_Chapter17();
	
	//setGivenNameメソッドを実行
	taro.setGivenName("太郎");
	Ichiro.setGivenName("一郎");
	Hanako.setGivenName("花子");
	
	//execIntroduceメソッドを実行
	taro.execIntroduce();
	Ichiro.execIntroduce();
	Hanako.execIntroduce();

	}
}
	

