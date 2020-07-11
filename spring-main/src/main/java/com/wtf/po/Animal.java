package com.wtf.po;

public abstract class Animal {

	private String type;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 是否会叫
	public abstract boolean hasCall();

	// 是否可训练
	public abstract boolean hasTrain();

	// 天敌
	public abstract String naturalEnemies();
}
