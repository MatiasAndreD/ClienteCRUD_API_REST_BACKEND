package com.mati.springbootbackendapirest.models;


import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "No puede estar vacio")
    @Size(min = 4, max=12, message = "Tiene que tener una longitud de 4 a 12 caracteres." )
    @Column(nullable = false)
    private String nombre;

    @NotBlank(message = "No puede estar vacio")
    @Size(min = 4, max=12, message = "Tiene que tener una longitud de 4 a 12 caracteres.")
    private String apellido;

    @Column(nullable = false/* , unique = true */)
    @NotBlank(message = "No puede estar vacio")
    @Email(message = "Debe ser una dirección de correo electrónico bien formada")
    private String email;

    @NotNull(message = "Este campo no puede ser nulo")
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    private String foto;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(final String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(final Date createAt) {
        this.createAt = createAt;
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}