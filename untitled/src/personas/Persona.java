package personas;

public class Persona {
    public static int contador = 0;
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        //incremetar el contaofr de personas del static
        Persona.contador++;
    }

    @Override
    public String toString() {
        return "Persona " + "nombre= " + this.nombre +  "edad=" + this.edad ;
    }

    //public void saludar() {
        //System.out.println("nombre = " + this.nombre);
      //  System.out.println("edad = " + this.edad);
   // }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
