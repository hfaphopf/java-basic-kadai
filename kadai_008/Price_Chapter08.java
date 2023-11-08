package Price_Chapter08;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		// 変数を宣言
		int userAge = 30;
		int serviceCost =3000;

		// 年代に応じた使用料金を取得
				switch(userAge) {
				case 10:
					System.out.println("1000");
					break;
				case 20:
					System.out.println("2000");
					break;
				case 30:
					System.out.println("3000");
					break;
				case 40:
					System.out.println("3000");
					break;
				case 50:
					System.out.println("4000");
					break;
				case 60:
					System.out.println("4000");
					break;
				case 70:
					System.out.println("4000");
					break;
				case 80:
					System.out.println("5000");
					break;
				default:
					System.out.println("500");
					break;
				
				}
				
				System.out.println(userAge + "代の料金は" + serviceCost + "円");
			}

		}

