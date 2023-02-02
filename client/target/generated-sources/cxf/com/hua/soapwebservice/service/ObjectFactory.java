
package com.hua.soapwebservice.service;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hua.soapwebservice.service package. 
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

    private final static QName _Hello_QNAME = new QName("http://service.soapwebservice.hua.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://service.soapwebservice.hua.com/", "helloResponse");
    private final static QName _Hua_QNAME = new QName("http://service.soapwebservice.hua.com/", "hua");
    private final static QName _HuaResponse_QNAME = new QName("http://service.soapwebservice.hua.com/", "huaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hua.soapwebservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hua }
     * 
     */
    public Hua createHua() {
        return new Hua();
    }

    /**
     * Create an instance of {@link HuaResponse }
     * 
     */
    public HuaResponse createHuaResponse() {
        return new HuaResponse();
    }

    /**
     * Create an instance of {@link Stuff }
     * 
     */
    public Stuff createStuff() {
        return new Stuff();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapwebservice.hua.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapwebservice.hua.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hua }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hua }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapwebservice.hua.com/", name = "hua")
    public JAXBElement<Hua> createHua(Hua value) {
        return new JAXBElement<Hua>(_Hua_QNAME, Hua.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HuaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapwebservice.hua.com/", name = "huaResponse")
    public JAXBElement<HuaResponse> createHuaResponse(HuaResponse value) {
        return new JAXBElement<HuaResponse>(_HuaResponse_QNAME, HuaResponse.class, null, value);
    }

}
