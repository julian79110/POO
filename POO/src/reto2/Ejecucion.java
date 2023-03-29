package reto2;
import java.util.*;


public class Ejecucion {
    public static void main(String[] args) {
        int peso = 0; 
        int estatura = 0;

        Persona per = new Persona();

        per.pedirDatos();
        per.operacionPeso(peso);
        per.operacionEstatura(estatura);
        per.mostrarDatos();
    
    }
}
