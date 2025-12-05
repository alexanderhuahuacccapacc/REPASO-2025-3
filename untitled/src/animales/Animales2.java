package animales;

public class Animales2 {
    protected void comer1(){
        System.out.println("Comiendo animal-2");
    }
    protected void dormir1(){
        System.out.println("Durmiendo animal_2");
    }
}
//usamnos protected para poder usarlo en la clase hija
class Perro1 extends Animales2 {
    protected void hablar(){
        System.out.println("Hablar");

    }

}
class Prueba1 {
    public static void main(String[] args) {
        System.out.println("Prueba1");
        Perro1 perro1 = new Perro1();
        perro1.hablar();
        perro1.comer1();
        perro1.dormir1();
    }
}
