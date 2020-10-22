package com.howtodoinjava.xml.school;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "msg"
})
@XmlRootElement(name = "StudentListResponse")
public class StudentListResponse {

    @XmlElement(name= "Msg", required = true)
    protected String msg;

    public StudentListResponse(){}

    /**
     * Obtiene el valor de la propiedad student.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Define el valor de la propiedad student.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMsg(String value) {
        this.msg = value;
    }
}
