package com.howtodoinjava.xml.school;

import javax.xml.bind.annotation.*;

/**
 * <p>Clase Java para Student complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="Student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Course", propOrder = {
        "name"
})
@XmlRootElement(name = "Course")
public class Course {

    @XmlElement(required = true)
    protected String name;

    public Course() {
    }

    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

}