package personamin;

import personas.Persona;

public class Personamain {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        var persona = new Persona();
        persona.setNombre("Miguel");
        persona.setEdad(30);
        persona.saludar();

        System.out.println("");

        var persona2 = new Persona();
        persona2.setNombre("Juan");
        persona2.setEdad(26);
        persona2.saludar();

    }
}
