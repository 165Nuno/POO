import java.util.*;

class main{

    public static void main (String [] args){
        Circulo cir = new Circulo (12,13,14);
        Circulo c2 = new Circulo (cir);
        System.out.println("***********Efetuou uma cópia do CIRCULO ORIGINAL***********\n" + c2.toString());
        System.out.println(cir.toString());
        System.out.println(cir.calcularArea());
        cir.alteraCentro(4,3);
        System.out.println(cir.toString());
    }
}