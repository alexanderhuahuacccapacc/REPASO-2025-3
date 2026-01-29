package animales;

public class Animal {
    public void comer(){
        System.out.println("Comiendo animal 1");
    }
    public void dormir(){
        System.out.println("Durmiendo del animal 1");
    }
    public void hacersonido(){
        System.out.println("Hablar del animal 1");
    }
}

//Usamos extends para heredar propiedades de la clase padre
//Usamos public para poder usarla en otra clase
// @override es para la sobre escritutra
// "super" es para llamar al metodo padre
// polimorfismo
class Perro extends Animal {
    public void hablar(){
        System.out.println("Hablar");

        super.comer();

    }
    @Override
    public void hacersonido(){
        System.out.println("Hacersonido perro");
    }

}
class Gato extends Animal {
    @Override
    public void hacersonido() {
        System.out.println("Hacersonido gato ");
            //super.hacersonido();
    }
}
class Prueba {
    public static void main(String[] args) {
        System.out.println("Prueba peroo");
        Perro perro = new Perro();
        //perro.hablar();
        //perro.comer();
        //perro.dormir();
        //perro.hacersonido();
        //System.out.println("Prueba gato");
        Gato gato = new Gato();
        gato.hacersonido();


    }
}

class pruebaPolimorfismo {

    static void imprimirsonido (Animal animal){
        animal.hacersonido();
    }
    public static void main(String[] args) {
        //var animal = new Animal();
        //var animal = new Perro();
        var animal = new Gato();
        imprimirsonido(animal);
    }
}
