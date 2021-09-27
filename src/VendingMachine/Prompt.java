package VendingMachine;

import java.util.Scanner;

public class Prompt {
	String[] sodaName = { "코카콜라", "사이다", "오렌지주스", "사과주스", "포도주스" };
	int[] sodaPrice = { 900, 1000, 1700, 1900, 2200 };
	int[] sodaStock = { 5, 4, 3, 2, 1 };
	String[] light = { "□", "□", "□", "□", "□" };
	static int money = 0;
	String order = "명령 : a.돈을 투입한다. q.종료 ";
	static boolean onLoop = true;

	public void printMenu(String order) {
		// 음료 메뉴 출력 +현재 투입된 돈 최신화 하면서 출력 인터페이스

		System.out.println("┌-------------------------------");
		System.out.println("|        < 시원한 음료수 자판기 >");
		System.out.printf("| %s 코카콜라(%s원)\n", light[0], sodaPrice[0]);
		System.out.printf("| %s 사이다(%s원)\n", light[1], sodaPrice[1]);
		System.out.printf("| %s 오렌지주스(%s원)\n", light[2], sodaPrice[2]);
		System.out.printf("| %s 사과주스(%s원)\n", light[3], sodaPrice[3]);
		System.out.printf("| %s 포도주스(%s원)\n", light[4], sodaPrice[4]);
		System.out.printf("|       < 투입한 금액 :%4d원 >\n", money);
		System.out.println("└-------------------------------");
		System.out.println(order);

	}

	public int inputMoney(Scanner scanner) {
		String inputOrder = scanner.next();
		if (inputOrder.equals("a")) {
			System.out.println("투입할 금액을 입력하세요.");
			int inputMoney = scanner.nextInt();
			money = money + inputMoney;
		}
		if (inputOrder.equals("q")) {
			System.out.println(money + "원을 반환하고 종료합니다.");
			money = 0;
			onLoop = false;

		}

		return money;

	}

	public boolean canBuy() {
		if (money >= 900) {
			return true;

		} else {
			return false;
		}

	}

	public String sodaLightHandler() {
		if (money >= 2200) {
			light[0] = "■";
			light[1] = "■";
			light[2] = "■";
			light[3] = "■";
			light[4] = "■";
			return order = "명령: 1.코카콜라 2.사이다 3.오렌지주스 4.사과주스 5.포도주스 a.돈을 추가로 투입한다. q.거스름돈 받고 종료";
		}
		if (money < 2200 && money >= 1900) {
			light[0] = "■";
			light[1] = "■";
			light[2] = "■";
			light[3] = "■";
			light[4] = "□";
			return order = "명령: 1.코카콜라 2.사이다 3.오렌지주스 4.사과주스 a.돈을 추가로 투입한다. q.거스름돈 받고 종료";

		}
		if (money < 1900 && money >= 1700) {
			light[0] = "■";
			light[1] = "■";
			light[2] = "■";
			light[3] = "□";
			light[4] = "□";
			return order = "명령: 1.코카콜라 2.사이다 3.오렌지주스 a.돈을 추가로 투입한다. q.거스름돈 받고 종료";

		}
		if (money < 1700 && money >= 1000) {
			light[0] = "■";
			light[1] = "■";
			light[2] = "□";
			light[3] = "□";
			light[4] = "□";
			return order = "명령: 1.코카콜라 2.사이다 a.돈을 추가로 투입한다. q.거스름돈 받고 종료";

		}
		if (money < 1000 && money >= 900) {
			light[0] = "■";
			light[1] = "□";
			light[2] = "□";
			light[3] = "□";
			light[4] = "□";
			return order = "명령: 1. 코카콜라 a.돈을 추가로 투입한다. q.거스름돈 받고 종료";

		}
		if (money < 900) {
			light[0] = "□";
			light[1] = "□";
			light[2] = "□";
			light[3] = "□";
			light[4] = "□";
			return order = "명령: a.돈을 추가로 투입한다. q.거스름돈 받고 종료";

		}
		return order;

	}

	public void selectSoda(String input, Scanner scanner) {
		if (input.equals("1")) {
			int a = Integer.parseInt(input);
			if (sodaStock[a - 1] >= 1) {
				sodaStock[a - 1]--;
				money = money - sodaPrice[a - 1];
				System.out.println(sodaName[a - 1] + "구매 완료!");
			} else {
				System.out.printf("%s의 재고가 없습니다.", sodaName[a - 1]);
			}
		}
		if (input.equals("2")) {
			int a = Integer.parseInt(input);
			if (sodaStock[a - 1] >= 1) {
				sodaStock[a - 1]--;
				money = money - sodaPrice[a - 1];
				System.out.println(sodaName[a - 1] + "구매 완료!");
			} else {
				System.out.printf("%s의 재고가 없습니다.", sodaName[a - 1]);
			}
		}
		if (input.equals("3")) {
			int a = Integer.parseInt(input);
			if (sodaStock[a - 1] >= 1) {
				sodaStock[a - 1]--;
				money = money - sodaPrice[a - 1];
				System.out.println(sodaName[a - 1] + "구매 완료!");
			} else {
				System.out.printf("%s의 재고가 없습니다.", sodaName[a - 1]);
			}
		}
		if (input.equals("4")) {
			int a = Integer.parseInt(input);
			if (sodaStock[a - 1] >= 1) {
				sodaStock[a - 1]--;
				money = money - sodaPrice[a - 1];
				System.out.println(sodaName[a - 1] + "구매 완료!");

			} else {
				System.out.printf("%s의 재고가 없습니다.", sodaName[a - 1]);
			}
		}
		if (input.equals("5")) {
			int a = Integer.parseInt(input);
			if (sodaStock[a - 1] >= 1) {
				sodaStock[a - 1]--;
				money = money - sodaPrice[a - 1];
				System.out.println(sodaName[a - 1] + "구매 완료!");
			} else {
				System.out.printf("%s의 재고가 없습니다.", sodaName[a - 1]);
			}
		}
		if (input.equals("a")) {
			System.out.println("투입할 금액을 입력하세요.");

			int inputMoney = scanner.nextInt();
			money = money + inputMoney;
			sodaLightHandler();
			printMenu(order);

		}

		if (input.equals("q")) {
			if (money > 0) {
				System.out.println(money + "원을 반환하고 종료합니다.");
			}
			money = 0;
			onLoop = false;

		}

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		Scanner scanner = new Scanner(System.in);

		// 주문가능할때까지 반복문 실행. 자판기 투입금액 업데이트.
		while (money < 900) {
			p.printMenu(p.order);
			p.inputMoney(scanner);
			if (p.canBuy()) {
				break;
			}
		}

		// 주문 가능하면 실행되기 시작함.
		while (p.canBuy()) {
			p.sodaLightHandler(); // 투입한 금액에 따라 주문가능한 음료수 표시해준 후 그에 따른 명령 변경.
			p.printMenu(p.order); // 변경된 자판기 다시 출력
			String input = scanner.next();
			p.selectSoda(input, scanner);

			// 주문후 주문가능금액 미달과 동시에 종료를 원하지 않을 때 실행
			if (!(p.canBuy()) && !(input.equals("q"))) {
				while (true) {
					p.sodaLightHandler();
					p.printMenu("a.추가로 투입 q.취소하고 종료");
					p.inputMoney(scanner);
					if (p.canBuy() || money == 0) {
						break;
					}

				 }
				}
			
			if (input.equals("q") || !(onLoop)) {
				if (money > 0) {
					System.out.println(money + "원을 반환하고 종료합니다.");
				}
				break;

			}
		}
	}
}
