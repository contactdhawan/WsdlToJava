
package sf.crom.sf.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPaymentProcess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPaymentProcess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentProcessRequest" type="{http://services.sf.crom.sf/}paymentProcessRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPaymentProcess", propOrder = {
    "paymentProcessRequest"
})
public class CreatePaymentProcess {

    @XmlElement(name = "PaymentProcessRequest")
    protected PaymentProcessRequest paymentProcessRequest;

    /**
     * Gets the value of the paymentProcessRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessRequest }
     *     
     */
    public PaymentProcessRequest getPaymentProcessRequest() {
        return paymentProcessRequest;
    }

    /**
     * Sets the value of the paymentProcessRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessRequest }
     *     
     */
    public void setPaymentProcessRequest(PaymentProcessRequest value) {
        this.paymentProcessRequest = value;
    }

}
