package kadai_011;

public  class Prime_Chapter11 {

	public static void main(String[] args) {
		//boolean型の配列を作成し、初期化
		boolean[] primeNumber = new boolean[101];
		//変数i=1～100の範囲で繰り返す
		for( int i = 0; i < primeNumber.length ; i++ ) {
		    primeNumber[i] = true;
		}
		
        //割る数
		for( int num = 2; num < primeNumber.length ; num++ ) {
			
		//割り切れない場合、素数を求める
			for( int i = num + 1; i < primeNumber.length ; i++ ) {
				
		//割り切れる場合、素数ではない
				if(i % num == 0) {
					primeNumber[i] = false;
					continue;
				}
			}
		}

		// 素数を出力する
		for (int i = 2; i <  primeNumber.length ; i++ ) {
			 if (primeNumber[i]) {
				 System.out.println(i);
			 }
		}
	}
}

	



