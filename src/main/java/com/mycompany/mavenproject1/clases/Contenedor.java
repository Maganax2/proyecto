package com.mycompany.mavenproject1.clases;

import java.util.List;
import java.util.ArrayList;

public class Contenedor {
    
    private static List<Alumno> alumnos = new ArrayList<>();
    private static List<Carrera> carreras = new ArrayList<>();
    private static List<Curso> cursos = new ArrayList<>();
    
    public Contenedor() {
    }

    public static List<Alumno> getAlumnos() {
        return alumnos;
    }

    public static List<Carrera> getCarreras() {
        return carreras;
    }

    public static List<Curso> getCursos() {
        return cursos;
    }
}