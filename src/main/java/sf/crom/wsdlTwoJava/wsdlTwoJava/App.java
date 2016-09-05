package sf.crom.wsdlTwoJava.wsdlTwoJava;

import java.net.MalformedURLException;
import java.net.URL;

import sf.crom.sf.services.PaymentProcess;
import sf.crom.sf.services.PaymentProcessRequest;
import sf.crom.sf.services.PaymentProcessResponse;
import sf.crom.sf.services.PaymentProcessService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			PaymentProcessService service = new PaymentProcessService(new URL("http://localhost:8080/PaymentProcessApp/Services/paymentProcess?wsdl"));
			PaymentProcess paymentProcessPort = service.getPaymentProcessPort();
			PaymentProcessResponse response = paymentProcessPort.createPaymentProcess(new PaymentProcessRequest());
			
			System.out.println(response.isResult());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println( "Hello World!" );
    }
}
