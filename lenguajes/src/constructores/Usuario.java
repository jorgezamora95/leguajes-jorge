/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-102
 */
public class Usuario {
    private String nombre;
    private String paterno;
    private int edad;
    private int matricula;

    public Usuario() {
    }
    
    
    public Usuario(String nombre){
        this.nombre=nombre;
    }
    public Usuario(String nombre, String paterno){
        this.paterno=paterno;
        this.nombre=nombre;
    }
    public Usuario(int edad){
        this.edad=edad;
    }
    public Usuario(int matricula, int edad){
        this.matricula=matricula;
        this.edad=edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}