package com.cjp.sdutycommons.itcast_05_proxy.service;
/**
 * 这是一个业务的接口，这个接口中的业务就是返回衣服、裤子的价格
 * @author wilson
 *
 */
public interface IBoss {//接口
	int yifu(String size);
	public int kuzi();
	public String sayHi(String name);
}