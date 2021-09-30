
package entidades;


public class Perro {
    private String nombre;
    private String color;
    private String raza;
    private Integer edad;

    public Perro() {
    }

    public Perro(String nombre, String color, String raza, Integer edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
    
    
}
