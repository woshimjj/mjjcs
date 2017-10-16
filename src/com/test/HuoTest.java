package com.test;

import java.util.List;

import com.huoche.ArrayOfString;
import com.huoche.GetDetailInfoByTrainCodeResponse.GetDetailInfoByTrainCodeResult;
import com.huoche.TrainTimeWebService;
import com.huoche.TrainTimeWebServiceSoap;

/**
 * 火车时刻查询
 * @author Administrator
 *
 */
public class HuoTest {
	public static void main(String[] args) {
		TrainTimeWebService huo = new TrainTimeWebService();
		TrainTimeWebServiceSoap trainTimeWebServiceSoap = huo.getTrainTimeWebServiceSoap();
		ArrayOfString code = trainTimeWebServiceSoap.getStationAndTimeByTrainCode ("K9015","");
		List<String> string = code.getString();
		System.out.println(string);
		
		/* ArrayOfString stationName = trainTimeWebServiceSoap.getStationName();
		 List<String> string = stationName.getString();
		 for (String string2 : string) {
			System.out.println(string2);
		}*/
	}
	
	
}
