package personamin;

import personas.Persona;

public class Personamain {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Variables estaticas: " + Persona.contador);
        var objeto1 = new Persona("Miguel", 30);
        System.out.println(objeto1);
        System.out.println("Variables estaticas: " + Persona.contador);

        var Objeto2 = new Persona("Juan", 26);
        System.out.println("Objeto2 = " + Objeto2);
        System.out.println("Variables estaticas: " + Persona.contador);
        //var persona = new Persona();
        //persona.setNombre("Miguel");
        //persona.setEdad(30);
        //persona.saludar();

        //System.out.println("");

        //var persona2 = new Persona();
        //persona2.setNombre("Juan");
        //persona2.setEdad(26);
        //persona2.saludar();

    }
}
