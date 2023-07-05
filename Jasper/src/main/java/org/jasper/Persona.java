package org.jasper;

import java.util.Date;

/**
 *
 * @author PC-Jose
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String telefono;
    private Date fechaNacimiento;
    private String direccion;
    private String correoElectronico;

    public Persona() {
        this(null,null);
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        //Datos tontos 
        this.telefono = "99999999";
        this.fechaNacimiento = new Date();
        this.direccion = "direccionxd";
        this.correoElectronico = "correo@gmail.com";
    }

    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
}
