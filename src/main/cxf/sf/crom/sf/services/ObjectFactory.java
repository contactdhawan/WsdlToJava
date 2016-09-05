
package sf.crom.sf.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sf.crom.sf.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreatePaymentProcess_QNAME = new QName("http://services.sf.crom.sf/", "createPaymentProcess");
    private final static QName _CreatePaymentProcessResponse_QNAME = new QName("http://services.sf.crom.sf/", "createPaymentProcessResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sf.crom.sf.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentProcessRequest }
     * 
     */
    public PaymentProcessRequest createPaymentProcessRequest() {
        return new PaymentProcessRequest();
    }

    /**
     * Create an instance of {@link PaymentProcessResponse }
     * 
     */
    public PaymentProcessResponse createPaymentProcessResponse() {
        return new PaymentProcessResponse();
    }

    /**
     * Create an instance of {@link CreatePaymentProcessResponse }
     * 
     */
    public CreatePaymentProcessResponse createCreatePaymentProcessResponse() {
        return new CreatePaymentProcessResponse();
    }

    /**
     * Create an instance of {@link CreatePaymentProcess }
     * 
     */
    public CreatePaymentProcess createCreatePaymentProcess() {
        return new CreatePaymentProcess();
    }

    /**
     * Create an instance of {@link CreditCardInfo }
     * 
     */
    public CreditCardInfo createCreditCardInfo() {
        return new CreditCardInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePaymentProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sf.crom.sf/", name = "createPaymentProcess")
    public JAXBElement<CreatePaymentProcess> createCreatePaymentProcess(CreatePaymentProcess value) {
        return new JAXBElement<CreatePaymentProcess>(_CreatePaymentProcess_QNAME, CreatePaymentProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePaymentProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sf.crom.sf/", name = "createPaymentProcessResponse")
    public JAXBElement<CreatePaymentProcessResponse> createCreatePaymentProcessResponse(CreatePaymentProcessResponse value) {
        return new JAXBElement<CreatePaymentProcessResponse>(_CreatePaymentProcessResponse_QNAME, CreatePaymentProcessResponse.class, null, value);
    }

}
