
package com.huoche;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getStationAndTimeDataSetByLikeTrainCodeResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any maxOccurs="2" minOccurs="2"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "getStationAndTimeDataSetByLikeTrainCodeResult"
})
@XmlRootElement(name = "getStationAndTimeDataSetByLikeTrainCodeResponse")
public class GetStationAndTimeDataSetByLikeTrainCodeResponse {

    protected GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult getStationAndTimeDataSetByLikeTrainCodeResult;

    /**
     * ��ȡgetStationAndTimeDataSetByLikeTrainCodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult }
     *     
     */
    public GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult getGetStationAndTimeDataSetByLikeTrainCodeResult() {
        return getStationAndTimeDataSetByLikeTrainCodeResult;
    }

    /**
     * ����getStationAndTimeDataSetByLikeTrainCodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult }
     *     
     */
    public void setGetStationAndTimeDataSetByLikeTrainCodeResult(GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult value) {
        this.getStationAndTimeDataSetByLikeTrainCodeResult = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any maxOccurs="2" minOccurs="2"/&gt;
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
        "any"
    })
    public static class GetStationAndTimeDataSetByLikeTrainCodeResult {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}