
package com.huoche;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getStationAndTimeByTrainCodeResult" type="{http://WebXml.com.cn/}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStationAndTimeByTrainCodeResult"
})
@XmlRootElement(name = "getStationAndTimeByTrainCodeResponse")
public class GetStationAndTimeByTrainCodeResponse {

    protected ArrayOfString getStationAndTimeByTrainCodeResult;

    /**
     * 获取getStationAndTimeByTrainCodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetStationAndTimeByTrainCodeResult() {
        return getStationAndTimeByTrainCodeResult;
    }

    /**
     * 设置getStationAndTimeByTrainCodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetStationAndTimeByTrainCodeResult(ArrayOfString value) {
        this.getStationAndTimeByTrainCodeResult = value;
    }

}
