package net.bank;

public class BankAccount {
	private String account;
	private String name;
	private String date;
	private int extraMoney;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getExtraMoney() {
		return extraMoney;
	}

	public void setExtraMoney(int extraMoney) {
		this.extraMoney = extraMoney;
	}

	public void playDeposit(int depositMoney){
		this.extraMoney += depositMoney;
		
	}
		
	public void playWithdraw(int withdrawMoney){
		this.extraMoney -= withdrawMoney;

	}
	
	

	public void showMyBalance(){
	
		System.out.println( "[계좌번호 : "+ account + " ] 입니다. \n"+ "이름 : " + name + "\n" + "잔액 : " + extraMoney + " 입니다. \n");
	}
}

