
package modelo.dto;

import java.io.Serializable;
import java.util.Objects;


public class UsuarioDTO implements Serializable{
    private int id;
    private String nombre;
    private String correo;
    private String clave;
    private String roll;
    public static final String ADMINISTRADOR="Administrador";
    public static final String CLIENTE="Cliente";
    public static final String VENDEDOR="Vendedor";
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public UsuarioDTO() {
    }

    public UsuarioDTO(int id, String nombre, String correo, String clave, String roll) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.roll = roll;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.correo);
        hash = 47 * hash + Objects.hashCode(this.clave);
        hash = 47 * hash + Objects.hashCode(this.roll);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioDTO other = (UsuarioDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        if (!Objects.equals(this.roll, other.roll)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", roll=" + roll;
        
    }


    
}
