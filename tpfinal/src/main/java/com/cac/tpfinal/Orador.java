
package com.cac.tpfinal;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;


@Entity
@Table(name = "oradores")
public class Orador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orador")
    private int idOrador;

    @Column(name = "nombre", length = 25, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 25, nullable = false)
    private String apellido;

    @Column(name = "tema", length = 100, nullable = false)
    private String tema;



    // Constructores, getters y setters

    public Orador() {
        // Constructor vacío requerido por JPA
    }

    public Orador(String nombre, String apellido, String tema ) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.tema = tema;
        
    }

    // Getters y setters

    public int getIdOrador() {
        return idOrador;
    }

    public void setIdOrador(int idOrador) {
        this.idOrador = idOrador;
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



    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }


}
