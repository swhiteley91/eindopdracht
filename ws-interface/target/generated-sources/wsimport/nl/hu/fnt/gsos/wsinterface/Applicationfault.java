
package nl.hu.fnt.gsos.wsinterface;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MorseServiceException", targetNamespace = "http://www.example.org/morseservice/exception/")
public class Applicationfault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MorseServiceException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public Applicationfault(String message, MorseServiceException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public Applicationfault(String message, MorseServiceException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: nl.hu.fnt.gsos.wsinterface.MorseServiceException
     */
    public MorseServiceException getFaultInfo() {
        return faultInfo;
    }

}
