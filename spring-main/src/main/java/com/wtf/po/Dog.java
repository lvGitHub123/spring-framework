package com.wtf.po;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{


	@Override
	public boolean hasCall() {
		return true;
	}

	@Override
	public boolean hasTrain() {
		return true;
	}

	@Override
	public String naturalEnemies() {
		return null;
	}
}
