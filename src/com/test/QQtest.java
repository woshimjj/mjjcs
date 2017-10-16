package com.test;

import com.qq.QqOnlineWebService;
import com.qq.QqOnlineWebServiceSoap;

/**
 * QQ在线功能测试
 * @author Administrator
 */
public class QQtest {
	public static void main(String[] args) {
		QqOnlineWebService qq= new QqOnlineWebService();
		QqOnlineWebServiceSoap soap = qq.getQqOnlineWebServiceSoap();
		String qqCheckOnline = soap.qqCheckOnline("21447756215");
		System.out.println(qqCheckOnline);
	}
}
