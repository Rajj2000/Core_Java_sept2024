package com.cdac.abstraction;


public interface BOI extends RBI{

	@Override
	default void withdraw() {
		System.out.println("BOI withdraw() ");	
	}

	@Override
	default void deposite() {
		System.out.println("BOI deposite() ");	
	}

	
}
