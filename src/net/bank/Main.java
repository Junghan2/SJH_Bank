package net.bank;

import java.util.Scanner;

public class Main {
	
	private BankAccount bankAccount = new BankAccount();

	public void mediation(){
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("안녕하세요 정한은행입니다.");
		System.out.println("예금주명을 입력하세요");
		String name = input.next();
		bankAccount.setName(name);
		
		System.out.println("계좌번호를 입력하세요");
		String accountNumber =input.next();
		bankAccount.setAccount(accountNumber);
		
		System.out.println("개설일자를 입력하세요");
		String dateNumber = input.next();
		bankAccount.setDate(dateNumber);
		
		System.out.println("입금금액을 입력하세요");
		int depositMoney = input.nextInt();
		bankAccount.setExtraMoney(depositMoney);

		System.out.println("계좌가 생성되었습니다.\n"+ dateNumber);
		bankAccount.showMyBalance();
			
		int choiceNumber;
		int deposit; 
		int withdrawMoney;
		int result;
		
			while(true){
				
				bankMenu();
				choiceNumber = input.nextInt();	
				if (choiceNumber == 1 ){
					
					System.out.println("입금하실 금액을 입력하세요 ");
					deposit = input.nextInt();
					bankAccount.playDeposit(deposit);
					bankAccount.showMyBalance();
					
				}
				else if (choiceNumber == 2 ){
					
					while( true ){
						
						System.out.println("출금하실 금액을 입력하세요");
						withdrawMoney = input.nextInt();
						result =  bankAccount.getExtraMoney()-withdrawMoney;
						
						if( result > 0){
	
							System.out.println(withdrawMoney+"출금이 되었습니다.");
							bankAccount.playWithdraw(withdrawMoney);
							bankAccount.showMyBalance();
							
							
						}
						else if ( result == 0){
							
							
							System.out.println(withdrawMoney+"출금이 되었습니다.");
							bankAccount.playWithdraw(withdrawMoney);
							bankAccount.showMyBalance();
							break;
						}
						else if( result < 0){
							System.out.println("잔액이 부족합니다.");
							System.out.println("다시 입력해주시기 바랍니다.");
						
						}
					}
				}
				else if(choiceNumber  == 3 ){
					
					System.out.println("종료됩니다.");
					break;
					
				}	
				else{
					
					System.out.println("잘못 선택하셨습니다.");
					System.out.println("다시입력하세요");
					
				}
				}

		}

	private void bankMenu() {
		System.out.println("업무를 입력하세요");
		System.out.println("1. 업무");
		System.out.println("2. 출금");
		System.out.println("3. 종료");
	}

	public static void main(String[] args) {
		
		new Main().mediation(); 

	}
}
		
		

				


