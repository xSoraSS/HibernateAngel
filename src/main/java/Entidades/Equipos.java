package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "equipos")
@Entity
public class Equipos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "Nombre", nullable = false)
    private String Nombre;

    @Column(name = "Ciudad")
    private String Ciudad;

    @Column(name = "Conferencia")
    private String Conferencia;

    @Column(name = "Division")
    private String Division;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getConferencia() {
        return Conferencia;
    }

    public void setConferencia(String Conferencia) {
        this.Conferencia = Conferencia;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String Division) {
        this.Division = Division;
    }

    public String toString() {
      return "Equipos{Nombre=" + Nombre + 
        ", Ciudad=" + Ciudad + 
        ", Conferencia=" + Conferencia + 
        ", Division=" + Division + 
        "}";
    }
}