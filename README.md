# JavaVendingMachine

#### 0. 작동

<img width ="100%" src="https://user-images.githubusercontent.com/87915542/134854753-15fd1383-3a3b-444a-86ad-a4123b117e63.gif"/>

#### 1. [2021-09-25] 순서도 작성 
코드를 작성하기전에 논리를 구성해보는 것도 도움이 된다. 
- [Flow Chart](#4-flow-chart) 
#### 2. [2021-09-26] 콘솔창으로 구현
- 돈 투입시 자판기의 투입 금액 표시 기능 
- 투입금액에 따라 주문가능한 음료 표시 기능
- 재고가 없으면 음료 구매 할 수 없음
- 종료시 남은 돈 출력 후 종료. 

![flowChart](./img/firstupdate.png)

#### 3. [2021-10-19] 객체지향개념활용하여 구조 변경 및 리팩토링
- UpgradedMachine 클래스를 만들어서 새롭게 작성해보았습니다. 
- 자판기 객체 생성 후 사용하는 방식으로 변경하여 가독성이 향상되었습니다.
- 음료수 객체를 상속을 이용하여 구현하였습니다.
- 자판기 객체에서는 메뉴 출력, 구매, 반환, 금액 투입 기능이 구현되었습니다.
- 객체개념을 활용해보니 코드를 적게 작성하면서도 유지보수가 편리해졌습니다.

<img width ="100%" src="https://user-images.githubusercontent.com/87915542/137838346-6b13a6a3-ff6e-4761-96de-05d68b166408.gif"/>


![newMachine](./img/newMachine.png)

#### 4. Flow chart

### Flow Chart
![flowChart](./img/vendingMachine.png)