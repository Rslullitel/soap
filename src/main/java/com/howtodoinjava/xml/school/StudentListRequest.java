package com.howtodoinjava.xml.school;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         <sch:studentList>
 *             <sch:student>
 *                <sch:name>Juan</sch:name>
 *                <sch:standard>1</sch:standard>
 *                <sch:address>CABA</sch:address>
 *             </sch:student>
 *          </sch:studentList>
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
        "studentList"

})
@XmlRootElement(name = "StudentListRequest")
public class StudentListRequest {

    @XmlElement(required = true)
    protected List<Student> studentList;

    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return
     *     possible object is
     *     {@link List<Student> }
     *
     */
    public List<Student> getStudents() {
        return studentList;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param value
     *     allowed object is
     *     {@link List<Student> }
     *
     */
    public void setStudents(List<Student> value) {
        this.studentList = value;
    }
}
