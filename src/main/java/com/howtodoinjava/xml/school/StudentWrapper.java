package com.howtodoinjava.xml.school;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(name = "", propOrder = {
        "students"
})
@XmlRootElement(name = "StudentWrapper")
public class StudentWrapper {

    @XmlElement(required = true)
    private List<Student> students;

    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return
     *     possible object is
     *     {@link List<Student> }
     *
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param students
     *     allowed object is
     *     {@link List<Student> }
     *
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
