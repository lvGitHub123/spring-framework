package com.wtf.po;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal{

	private Mouse mouse;

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	@Override
	public boolean hasCall() {
		return false;
	}

	@Override
	public boolean hasTrain() {
		return false;
	}

	@Override
	public String naturalEnemies() {
		return mouse.getName();
	}
}
