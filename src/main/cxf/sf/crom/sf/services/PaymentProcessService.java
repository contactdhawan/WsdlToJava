
package sf.crom.sf.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import sf.crom.sf.services.PaymentProcess;

/**
 * This class was generated by Apache CXF 2.0.9
 * Sun Aug 28 19:14:39 CDT 2016
 * Generated source version: 2.0.9
 * 
 */

@WebServiceClient(name = "PaymentProcessService", 
                  wsdlLocation = "file:/C:/Users/nk839683/webservices/wsdlTwoJava/src/main/resources/paymentProcess.wsdl",
                  targetNamespace = "http://services.sf.crom.sf/") 
public class PaymentProcessService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://services.sf.crom.sf/", "PaymentProcessService");
    public final static QName PaymentProcessPort = new QName("http://services.sf.crom.sf/", "PaymentProcessPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/nk839683/webservices/wsdlTwoJava/src/main/resources/paymentProcess.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/Users/nk839683/webservices/wsdlTwoJava/src/main/resources/paymentProcess.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public PaymentProcessService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PaymentProcessService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaymentProcessService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns PaymentProcessPort
     */
    @WebEndpoint(name = "PaymentProcessPort")
    public PaymentProcess getPaymentProcessPort() {
        return super.getPort(PaymentProcessPort, PaymentProcess.class);
    }

}