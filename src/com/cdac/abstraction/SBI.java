 package com.cdac.abstraction;

public interface SBI extends RBI{

	@Override
	default void withdraw() {
		System.out.println("SBI withdraw() ");	
	}

	@Override
	default void deposite() {
		System.out.println("SBI deposite() ");
		
	}
}
