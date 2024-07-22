package com.mycompany.mavenproject1.clases;

public class Alumno extends Persona{
    private String codigoAlumno;
    private String carreraProfesional;
    private String correoInstitucional;
    private String modalidadIngreso;

    public Alumno(String nombre, String documentoIdentidad, String edad, String dirección, String distrito, String celular
                  , String codigoAlumno, String modalidadIngreso, String carreraProfesional) {
        super(nombre,documentoIdentidad,edad,dirección,distrito,celular);
        this.codigoAlumno = codigoAlumno;
        this.carreraProfesional = carreraProfesional;
        this.modalidadIngreso = modalidadIngreso;
        this.correoInstitucional = codigoAlumno+"@unsaac.edu.pe";
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getCarreraProfesional() {
        return carreraProfesional;
    }

    public void setCarreraProfesional(String carreraProfesional) {
        this.carreraProfesional = carreraProfesional;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getModalidadIngreso() {
        return modalidadIngreso;
    }

    public void setModalidadIngreso(String modalidadIngreso) {
        this.modalidadIngreso = modalidadIngreso;
    }
    
    
}
