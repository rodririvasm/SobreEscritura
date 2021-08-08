package Test;

import DOmain.Empleado;
import DOmain.Gerente;

public class TestEmpleado {
    public static void main(String[] args) {
        Gerente gerente =new Gerente("rodrigo",15000,"sistemas");
        System.out.println("gerente: "+gerente.toString());
    }
}
