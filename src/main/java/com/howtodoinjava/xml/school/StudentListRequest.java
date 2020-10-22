package com.howtodoinjava.xml.school;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "wrapper"

})
@XmlRootElement(name = "StudentListRequest")
public class StudentListRequest {

    @XmlElement(required = true)
    protected StudentWrapper wrapper;


    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return
     *     possible object is
     *     {@link StudentWrapper }
     *
     */
    public List<Student> getStudents() { return wrapper.getStudents(); }
}
