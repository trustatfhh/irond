/*
 * #%L
 * =====================================================
 *   _____                _     ____  _   _       _   _
 *  |_   _|_ __ _   _ ___| |_  / __ \| | | | ___ | | | |
 *    | | | '__| | | / __| __|/ / _` | |_| |/ __|| |_| |
 *    | | | |  | |_| \__ \ |_| | (_| |  _  |\__ \|  _  |
 *    |_| |_|   \__,_|___/\__|\ \__,_|_| |_||___/|_| |_|
 *                             \____/
 * 
 * =====================================================
 * 
 * Hochschule Hannover
 * (University of Applied Sciences and Arts, Hannover)
 * Faculty IV, Dept. of Computer Science
 * Ricklinger Stadtweg 118, 30459 Hannover, Germany
 * 
 * Email: trust@f4-i.fh-hannover.de
 * Website: http://trust.f4.hs-hannover.de/
 * 
 * This file is part of irond, version 0.5.1, implemented by the Trust@HsH
 * research group at the Hochschule Hannover.
 * %%
 * Copyright (C) 2010 - 2014 Trust@HsH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.08.12 at 05:23:43 PM CEST
//


package org.w3._2003._05.soap_envelope;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.w3._2003._05.soap_envelope package.
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

    private final static QName _Header_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Header");
    private final static QName _NotUnderstood_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "NotUnderstood");
    private final static QName _Fault_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Fault");
    private final static QName _Envelope_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Envelope");
    private final static QName _Upgrade_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Upgrade");
    private final static QName _Body_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Body");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2003._05.soap_envelope
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fault }
     *
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link Faultcode }
     *
     */
    public Faultcode createFaultcode() {
        return new Faultcode();
    }

    /**
     * Create an instance of {@link NotUnderstoodType }
     *
     */
    public NotUnderstoodType createNotUnderstoodType() {
        return new NotUnderstoodType();
    }

    /**
     * Create an instance of {@link UpgradeType }
     *
     */
    public UpgradeType createUpgradeType() {
        return new UpgradeType();
    }

    /**
     * Create an instance of {@link SupportedEnvType }
     *
     */
    public SupportedEnvType createSupportedEnvType() {
        return new SupportedEnvType();
    }

    /**
     * Create an instance of {@link Detail }
     *
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link Body }
     *
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link Subcode }
     *
     */
    public Subcode createSubcode() {
        return new Subcode();
    }

    /**
     * Create an instance of {@link Header }
     *
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Reasontext }
     *
     */
    public Reasontext createReasontext() {
        return new Reasontext();
    }

    /**
     * Create an instance of {@link Faultreason }
     *
     */
    public Faultreason createFaultreason() {
        return new Faultreason();
    }

    /**
     * Create an instance of {@link Envelope }
     *
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotUnderstoodType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "NotUnderstood")
    public JAXBElement<NotUnderstoodType> createNotUnderstood(NotUnderstoodType value) {
        return new JAXBElement<NotUnderstoodType>(_NotUnderstood_QNAME, NotUnderstoodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<Fault>(_Fault_QNAME, Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Envelope }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Envelope")
    public JAXBElement<Envelope> createEnvelope(Envelope value) {
        return new JAXBElement<Envelope>(_Envelope_QNAME, Envelope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpgradeType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Upgrade")
    public JAXBElement<UpgradeType> createUpgrade(UpgradeType value) {
        return new JAXBElement<UpgradeType>(_Upgrade_QNAME, UpgradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Body }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Body")
    public JAXBElement<Body> createBody(Body value) {
        return new JAXBElement<Body>(_Body_QNAME, Body.class, null, value);
    }

}
