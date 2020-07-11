package com.wtf.po;

public class Mouse extends Animal{

	private Cat cat;

	@Override
	public boolean hasCall() {
		return true;
	}

	@Override
	public boolean hasTrain() {
		return false;
	}

	@Override
	public String naturalEnemies() {
		return cat.getName();
	}
}
