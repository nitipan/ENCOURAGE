//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.18 at 01:53:03 PM GMT 
//


package encourager.generated.cim_identity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the encourager.generated.cim_identity package. 
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

    private final static QName _ElementName_QNAME = new QName("http://www.encourage-project.eu/CIM_Identity#", "ElementName");
    private final static QName _InstanceID_QNAME = new QName("http://www.encourage-project.eu/CIM_Identity#", "InstanceID");
    private final static QName _CIMIdentity_QNAME = new QName("http://www.encourage-project.eu/CIM_Identity#", "CIM_Identity");
    private final static QName _Description_QNAME = new QName("http://www.encourage-project.eu/CIM_Identity#", "Description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: encourager.generated.cim_identity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CIM_Identity }
     * 
     */
    public CIM_Identity createCIMIdentityType() {
        return new CIM_Identity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.encourage-project.eu/CIM_Identity#", name = "ElementName")
    public JAXBElement<String> createElementName(String value) {
        return new JAXBElement<String>(_ElementName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.encourage-project.eu/CIM_Identity#", name = "InstanceID")
    public JAXBElement<String> createInstanceID(String value) {
        return new JAXBElement<String>(_InstanceID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIM_Identity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.encourage-project.eu/CIM_Identity#", name = "CIM_Identity")
    public JAXBElement<CIM_Identity> createCIMIdentity(CIM_Identity value) {
        return new JAXBElement<CIM_Identity>(_CIMIdentity_QNAME, CIM_Identity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.encourage-project.eu/CIM_Identity#", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

}
