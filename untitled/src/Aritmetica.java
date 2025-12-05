public class Aritmetica {
    int numero1;
    int numero2;


    void sumar(){
        var resultado = numero1 + numero2;
        System.out.println("El resultado suma es: " + resultado);
    }
    void restar(){
        var resultado = numero1 - numero2;
        System.out.println("El resultado resta es: " + resultado);
    }
    void multiplicar(){
        var resultado = numero1 * numero2;
        System.out.println("El resultado multiplicacion es: " + resultado);
    }
    void dividir(){
        var resultado = numero1 / numero2;
        System.out.println("El resultado division es: " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("Aritmetica");
        var aritmetica = new Aritmetica();
        aritmetica.numero1 = 10;
        aritmetica.numero2 = 5;
        aritmetica.sumar();
        aritmetica.restar();
        aritmetica.multiplicar();
        aritmetica.dividir();
    }

    // public Aritmetica(){   CONSTRUCUTOR VACIO,
    // }
}
