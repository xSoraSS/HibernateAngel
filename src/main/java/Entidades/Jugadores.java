package Entidades;

import java.io.Serializable;

public class Jugadores implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer codigo;

    private String Nombre;

    private String Procedencia;

    private String Altura;

    private Integer Peso;

    private String Posicion;

    private String nombreEquipo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer Peso) {
        this.Peso = Peso;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

//    @ManyToOne
//    @JoinColumn(name = "Nombre")
    public String getNombre_equipo() {
        return nombreEquipo;
    }

    public void setNombre_equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String toString() {
      return "Jugadores{codigo=" + codigo + 
        ", Nombre=" + Nombre + 
        ", Procedencia=" + Procedencia + 
        ", Altura=" + Altura + 
        ", Peso=" + Peso + 
        ", Posicion=" + Posicion + 
        ", nombreEquipo=" + nombreEquipo + 
        "}";
    }
}