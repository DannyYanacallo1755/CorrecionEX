import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        comidaS sierra=new comidaS("Sierra","Salchipapa",10,"Salchicha","4 Estrellas");
        comidaA Amazomia=new comidaA("Amazonica","mono",12,"Mono","4 estrellas","Mauricio","Mayormente positiva","Muy poco popular","Es un producto que se hace a partir de mono");
        comidaC costa =new comidaC("Costa","Ceviche",15,"Pescado","5 estrella","Marco","Mayormente Positiva");
        comidaT tipica=new comidaT();

        tipica.ComidaTipi();
        System.out.println("");
        sierra.ComidaSierra();
        System.out.println("");
        Amazomia.ComidaAmazonia();
        System.out.println("");
        costa.Comidacosta();
    }


    }
