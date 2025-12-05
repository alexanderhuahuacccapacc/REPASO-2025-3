package animales;

public class Animal {
    public void comer(){
        System.out.println("Comiendo animal 1");
    }
    public void dormir(){
        System.out.println("Durmiendo del animal 1");
    }
}
//Usamos extends para heredar propiedades de la clase padre
//Usamos public para poder usarla en otra clase
class Perro extends Animal {
    public void hablar(){
        System.out.println("Hablar");

    }

}
class Prueba {
    public static void main(String[] args) {
        System.out.println("Prueba");
        Perro perro = new Perro();
        perro.hablar();
        perro.comer();
        perro.dormir();
    }
}
