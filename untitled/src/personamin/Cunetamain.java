package personamin;

import entidad.CuentaBancaria;
import personas.Persona;

public class Cunetamain {
    public static void main(String[] args) {
        var cuenta  = new CuentaBancaria();
        cuenta.setSaldo(1000);
        cuenta.setNumeroCuenta("123456789");
        cuenta.retirar(200);

    }
}
