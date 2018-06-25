package com.cjp.sdutycommons.DesignPattern.AbstractFactoryPattern;

// 抽象工厂
interface KitchenFactory {
	public Food getFood();

	public TableWare getTableWare();
}