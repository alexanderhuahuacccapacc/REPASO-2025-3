package gork_practica;

public class personaGork {
    private String nombre;
    private int edad = 20;

    public String getNombre() {
        return nombre ;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void Saludar(){
        System.out.println("Hola-padres");
    }

}
class Estudiante extends personaGork{
    int nota = 15;
    @Override
    public void Saludar(){
        System.out.println("Hola estudiantess" + getNombre());
        System.out.println("Nota: " + nota);
        System.out.println("edad " + getEdad());

    }


}
class Main {
    public static void main(String[] args) {
    personaGork persona = new personaGork();
    persona.setNombre("Juan");
    persona.Saludar();
    System.out.println("-----------------------");
    Estudiante estudiante = new Estudiante();
    estudiante.setNombre("Pedro");
    estudiante.Saludar();
    System.out.println("polimorfismo");
    personaGork poli = new Estudiante();
    poli.setNombre("Jose");
    poli.Saludar();
    }
}



