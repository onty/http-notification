//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.09 at 07:38:30 AM COT 
//


package com.ericsson.cep.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://claro.com.pe/eai/bs/xsd/postventa/EnvioSms}EnvioSMSResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "envioSMSResponse"
})
@XmlRootElement(name = "enviarSmsResponse", namespace = "http://pe/com/claro/eai/ws/postventa/enviosms")
public class EnviarSmsResponse {

    @XmlElement(name = "EnvioSMSResponse", required = true)
    protected EnvioSMSResponseType envioSMSResponse;

    /**
     * Gets the value of the envioSMSResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EnvioSMSResponseType }
     *     
     */
    public EnvioSMSResponseType getEnvioSMSResponse() {
        return envioSMSResponse;
    }

    /**
     * Sets the value of the envioSMSResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvioSMSResponseType }
     *     
     */
    public void setEnvioSMSResponse(EnvioSMSResponseType value) {
        this.envioSMSResponse = value;
    }

}
