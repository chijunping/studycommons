package com.cjp.sdutycommons.weixin_saomaPay;

/**
 * 
 * @author xgchen
 *
 */
public interface UserService {
	
	String weixinPay(String userId, String productId) throws Exception;
}
