package VendingMachine;

import java.util.Scanner;

// 객체: 자판기(음료수, 메뉴창출력, 구입, 반환)

class Product {    //음료수 객체가 상속받는 클래스
	int price;
	int stock;
	String name;

	Product(String name, int price, int stock) {
		this.price = price;
		this.stock = stock;
		this.name = name;
	}

}

class CocaCola extends Product {
	CocaCola() {
		super("코카콜라", 900, 5);
	}

	public String toString() {
		return "코카콜라";
	}
}

class OrangeJuice extends Product {
	OrangeJuice() {
		super("오렌지주스", 1000, 2);
	}

	public String toString() {
		return "오렌지주스";
	}
}

class AppleJuice extends Product {
	AppleJuice() {
		super("사과주스", 1700, 3);
	}

	public String toString() {
		return "사과주스";
	}
}
class MangoJuice extends Product {
	MangoJuice() {
		super("망고주스", 1900, 5);
	}
	
	public String toString() {
		return "망고주스";
	}
}
class GrapeJuice extends Product {
	GrapeJuice() {
		super("포도주스", 2200, 2);
	}
	
	public String toString() {
		return "포도주스";
	}
}

class SodaMachine {
	int money = 0; // 자판기에 투입된 돈
	Product[] item = {  // 자판기가 보유한 음료
			new CocaCola(),
			new OrangeJuice(),
			new AppleJuice(),
			new MangoJuice(),
			new GrapeJuice(),
			};
	
	public void buy(Product p) {    // 자판기에서 음료수 구매하기 
		if(p.stock <= 0){
			System.out.println("재고가 부족합니다.");
			return;
		}
		if(money < p.price) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		money -= p.price;
		p.stock--;
		System.out.println(p.name+" 구매 완료");
	}
	
	public void refund() {
		System.out.printf("%d원을 반환합니다.%n",this.money);
		this.money = 0;
	}
	public void putMoney(int money) {
		this.money += money;
	}
	
	void showInterface() {
		
		System.out.println("┌----------------------------------");
		System.out.println("|        < 시원한 음료수 자판기 >");
		for(int i =0 ; i < item.length; i++ ) {
			System.out.printf("| %s %-6s(%s원)  남은 수량:%d개%n",
					controlLight(i),
					item[i].name,
					item[i].price,
					item[i].stock);
		}
		System.out.printf("|       < 투입한 금액 :%4d원 >%n", money);
		System.out.println("└----------------------------------");
		String prompt = "";
		for(int i =0 ; i < item.length; i++ ) {  //현재 item 목록에 의존하는 명령 출력. 
			prompt += (i+1)+"."+item[i].name+" ";
		}
		prompt += (item.length+1)+".돈을 투입한다. "+ (item.length+2)+".반환하고 종료";
		System.out.printf("명령: %s%n",prompt); 
	}
	//구매가능한 음료 표시
	private String controlLight(int i) {
		if(money>=item[i].price) {
			return "■";
		}else {
			return "□";
		}
	}
	
	}

public class UpgradedMachine {

	public static void main(String[] args) {
		// 기존의 자판기를 리팩토링한 파일입니다.
		SodaMachine s = new SodaMachine();
		final int MAX = s.item.length;  //현재 생성된 자판기인스턴스의 음료 목록의 총 개수를 저장한다.
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			s.showInterface(); // 메뉴 출력
			int input = scanner.nextInt();  // 명령 입력
			
			if(input == s.item.length+2) {   //종료
				s.refund();
				scanner.close();
				break;
			}
			
			if(input == s.item.length+1) {   //돈 추가 투입
				System.out.println("투입할 금액을 입력하세요.");
				int money = scanner.nextInt();
				s.putMoney(money);
				s.showInterface();
				continue;
			}
		
			if(1<= input && input <= MAX) {     // 음료수 구매
				s.buy(s.item[input-1]);
			}
		} //while문 종료. 
	
	}
}

