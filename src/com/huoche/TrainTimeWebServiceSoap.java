package com.huoche;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.13
 * 2017-10-10T17:38:30.559+08:00
 * Generated source version: 3.1.13
 * 
 */
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "TrainTimeWebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface TrainTimeWebServiceSoap {

    /**
     * <br /><h3>通过火车车次查询本火车时刻表 DataSet</h3><p>输入参数：车次代号字符串，空字符串默认上海到北京D32次，UserID = 商业用户ID（普通用户不需要）；返回数据：DataSet，Item.(TrainCode)=车次、Item.(FirstStation)=始发站、Item.(LastStation)=终点站、Item.(StartStation)=发车站、Item.(StartTime)=发车时间、Item.(ArriveStation)=到达站、Item.(ArriveTime)=到达时间、Item.(KM)=里程(KM)、Item.(UseDate)=历时</p><br />
     */
    @WebResult(name = "getStationAndTimeDataSetByTrainCodeResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getStationAndTimeDataSetByTrainCode", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationAndTimeDataSetByTrainCode")
    @WebMethod(action = "http://WebXml.com.cn/getStationAndTimeDataSetByTrainCode")
    @ResponseWrapper(localName = "getStationAndTimeDataSetByTrainCodeResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationAndTimeDataSetByTrainCodeResponse")
    public com.huoche.GetStationAndTimeDataSetByTrainCodeResponse.GetStationAndTimeDataSetByTrainCodeResult getStationAndTimeDataSetByTrainCode(
        @WebParam(name = "TrainCode", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String trainCode,
        @WebParam(name = "UserID", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String userID
    );

    /**
     * <br /><h3>通过发车站和到达站查询火车时刻表 DataSet</h3><p>输入参数：StartStation = 发车站，ArriveStation = 到达站（支持第一个字匹配模糊查询），空字符串默认发车站上海和到达站北京，UserID = 商业用户ID（普通用户不需要）；返回数据：DataSet，Item.(TrainCode)=车次、Item.(FirstStation)=始发站、Item.(LastStation)=终点站、Item.(StartStation)=发车站、Item.(StartTime)=发车时间、Item.(ArriveStation)=到达站、Item.(ArriveTime)=到达时间、Item.(KM)=里程(KM)、Item.(UseDate)=历时</p><br />
     */
    @WebResult(name = "getStationAndTimeByStationNameResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getStationAndTimeByStationName", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationAndTimeByStationName")
    @WebMethod(action = "http://WebXml.com.cn/getStationAndTimeByStationName")
    @ResponseWrapper(localName = "getStationAndTimeByStationNameResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationAndTimeByStationNameResponse")
    public com.huoche.GetStationAndTimeByStationNameResponse.GetStationAndTimeByStationNameResult getStationAndTimeByStationName(
        @WebParam(name = "StartStation", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String startStation,
        @WebParam(name = "ArriveStation", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String arriveStation,
        @WebParam(name = "UserID", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String userID
    );

    /**
     * <br /><h3>通过火车车次查询本火车时刻表（支持模糊查询） DataSet</h3><p>输入参数：车次代号字符串（支持模糊查询），空字符串默认上海到北京D32次，UserID = 商业用户ID（普通用户不需要）；返回数据：DataSet，Item.(TrainCode)=车次、Item.(FirstStation)=始发站、Item.(LastStation)=终点站、Item.(StartStation)=发车站、Item.(StartTime)=发车时间、Item.(ArriveStation)=到达站、Item.(ArriveTime)=到达时间、Item.(KM)=里程(KM)、Item.(UseDate)=历时</p><br />
     */
    @WebResult(name = "getStationAndTimeDataSetByLikeTrainCodeResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getStationAndTimeDataSetByLikeTrainCode", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationAndTimeDataSetByLikeTrainCode")
    @WebMethod(action = "http://WebXml.com.cn/getStationAndTimeDataSetByLikeTrainCode")
    @ResponseWrapper(localName = "getStationAndTimeDataSetByLikeTrainCodeResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationAndTimeDataSetByLikeTrainCodeResponse")
    public com.huoche.GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult getStationAndTimeDataSetByLikeTrainCode(
        @WebParam(name = "TrainCode", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String trainCode,
        @WebParam(name = "UserID", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String userID
    );

    /**
     * <br /><h3>通过火车车次查询列车经由车站明细 DataSet</h3><p>输入参数：车次代号字符串，空字符串默认上海到北京D32次，UserID = 商业用户ID（普通用户不需要）；返回数据：DataSet，Item.(TrainStation)=车站名称、Item.(ArriveTime)=到站时间、Item.(StartTime)=发车时间、Item.(KM)=里程(KM)</p><br />
     */
    @WebResult(name = "getDetailInfoByTrainCodeResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getDetailInfoByTrainCode", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetDetailInfoByTrainCode")
    @WebMethod(action = "http://WebXml.com.cn/getDetailInfoByTrainCode")
    @ResponseWrapper(localName = "getDetailInfoByTrainCodeResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetDetailInfoByTrainCodeResponse")
    public com.huoche.GetDetailInfoByTrainCodeResponse.GetDetailInfoByTrainCodeResult getDetailInfoByTrainCode(
        @WebParam(name = "TrainCode", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String trainCode,
        @WebParam(name = "UserID", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String userID
    );

    /**
     * <br /><h3>获得本火车时刻表Web Services的数据库版本更新时间</h3><p>输入参数：无，输出参数 String</p><br />
     */
    @WebResult(name = "getVersionTimeResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getVersionTime", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetVersionTime")
    @WebMethod(action = "http://WebXml.com.cn/getVersionTime")
    @ResponseWrapper(localName = "getVersionTimeResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetVersionTimeResponse")
    public java.lang.String getVersionTime();

    /**
     * <br /><h3>获得本火车时刻表Web Services的全部始发站名称</h3><p>输入参数：无，输出参数 String()</p><br />
     */
    @WebResult(name = "getStationNameResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getStationName", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationName")
    @WebMethod(action = "http://WebXml.com.cn/getStationName")
    @ResponseWrapper(localName = "getStationNameResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationNameResponse")
    public com.huoche.ArrayOfString getStationName();

    /**
     * <br /><h3>通过火车车次查询火车时刻表 String()</h3><p>输入参数：车次代号字符串，空字符串默认上海到北京D32次，UserID = 商业用户ID（普通用户不需要）；返回数据：一个一维字符串数组 String(9)，String(0)=车次、String(1)=始发站、String(2)=终点站、String(3)=发车站、String(4)=发车时间、String(5)=到达站、String(6)=到达时间、String(7)=里程(KM)、String(8)=历时、String(9)=空字符串(备用)</p><br />
     */
    @WebResult(name = "getStationAndTimeByTrainCodeResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getStationAndTimeByTrainCode", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationAndTimeByTrainCode")
    @WebMethod(action = "http://WebXml.com.cn/getStationAndTimeByTrainCode")
    @ResponseWrapper(localName = "getStationAndTimeByTrainCodeResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationAndTimeByTrainCodeResponse")
    public com.huoche.ArrayOfString getStationAndTimeByTrainCode(
        @WebParam(name = "TrainCode", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String trainCode,
        @WebParam(name = "UserID", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String userID
    );

    /**
     * <br /><h3>获得本火车时刻表Web Services支持的全部站台名称和拼音缩写 DataSet</h3><p>输入参数：无；返回数据：结构为 站台名称、拼音缩写，按拼音缩写升序排列</p><br />
     */
    @WebResult(name = "getStationNameDataSetResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getStationNameDataSet", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationNameDataSet")
    @WebMethod(action = "http://WebXml.com.cn/getStationNameDataSet")
    @ResponseWrapper(localName = "getStationNameDataSetResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.huoche.GetStationNameDataSetResponse")
    public com.huoche.GetStationNameDataSetResponse.GetStationNameDataSetResult getStationNameDataSet();
}
