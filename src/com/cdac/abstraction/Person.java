package com.cdac.abstraction;

public class Person implements BOI, SBI {
	private RBI bank;
	
	public Person(RBI bank) {
		this.bank=bank;
	}
	public static void main(String[] args) {
		Person p1=new Person(new BOI() {});
		p1.deposite();
		p1.withdraw();
		
		
		Person p2=new Person(new SBI() {});
		p2.deposite();
		p2.withdraw();
	}
	@Override
	public void deposite() {
		
		bank.deposite();
	}
	@Override
	public void withdraw() {
		bank.withdraw();
	}
}
