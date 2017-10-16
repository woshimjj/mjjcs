package com.test;

import java.util.List;

import com.jk.test.ArrayOfString;
import com.jk.test.WeatherWS;
import com.jk.test.WeatherWSSoap;

public class test {
	/**
	 * cxf框架 天气 国家
	 * @param args
	 */
	public static void main(String[] args) {

		WeatherWS ws = new WeatherWS();
		WeatherWSSoap soap = ws.getWeatherWSSoap();

		
		ArrayOfString weather = soap.getWeather("北京",null);
		List<String> list= weather.getString();
		System.out.println(list);
		
		
		//国家信息  OK
/*		ArrayOfString regionCountry = soap.getRegionCountry();
		List<String> list = regionCountry.getString();
		
		for (String string : list) {
			System.out.println(string);
		}*/
		
		
		
		
	}
}
