import java.util.*;
import java.lang.Math. *;


class Circulo{

    /** Variáveis de Instância */

    private double x;
    private double y;
    private double raio;

    /**
     * Construtor por omissão de Circulo 
    */
    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    /**
     * Construtor parametrizado de Circulo 
    */
    public Circulo(int cx,int cy,double craio){
        this.x = cx;
        this.y = cy;
        this.raio = craio;
    }

    public Circulo(Circulo copia){
        this.x = copia.getX();
        this.y = copia.getY();
        this.raio = copia.getRaio();
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getRaio(){
        return this.raio;
    }

    public String toString(){
        return "O valor de x é " + this.x + "  o valor de y é " + this.y + "  o valor do raio é " + this.raio;
    }

    public void setX(double x){
        this.x = x;  
    } 
    public void setY(double y){
        this.y = y;
    } 
    public void setRaio(double raio){
        this.raio = raio;
    }

    /* Alinea e) */
    public void alteraCentro(double x, double y){
        this.x = x;
        this.y = y;
    }

    /* Alinea f) */
    public double calcularArea(){
        return (this.raio * this.raio)* 3.14159;
    }
    /* Alinea g) */
    public double perimetro(){
        return (this.raio * 2) * 3.14159;
    }
}