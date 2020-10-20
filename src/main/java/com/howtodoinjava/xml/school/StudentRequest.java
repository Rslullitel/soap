package com.howtodoinjava.xml.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sch="http://www.howtodoinjava.com/xml/school">
         <soapenv:Header/>
             <soapenv:Body>
                 <sch:StudentRequest>
                     <sch:Student>
                         <sch:name>Rama</sch:name>
                         <sch:standard>5</sch:standard>
                         <sch:address>Void</sch:address>
                     </sch:Student>
                 </sch:StudentRequest>
         </soapenv:Body>
 </soapenv:Envelope>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "student"
})
@XmlRootElement(name = "StudentRequest")
public class StudentRequest {

    @XmlElement(required = true)
    private Student student;

    public StudentRequest(){}
    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return
     *     possible object is
     *     {@link Student }
     *
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param value
     *     allowed object is
     *     {@link Student }
     *
     */
    public void setStudent(Student value) {
        this.student = value;
    }

}
