
package Salud;
import java.util.*;

public class Persona {
    //atributos
    private String tipoDocumento;
    private int documento;
    private String nombre;
    private String apellido;
    private int edad;
    private int peso;
    private double estatura;
    private String sexo;
    private double resultado;
    private double estatura2;
    //metodos
    public void pedirDatos(){ 
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese su tipo de documento");
        tipoDocumento = datos.next();

        System.out.println("Ingrese su documento ");
        documento = datos.nextInt();

        System.out.println("Ingrese su nombre");
        nombre = datos.next();

        System.out.println("Ingrese su apellido");
        apellido = datos.next();

        System.out.println("Ingrese su edad");
        edad = datos.nextInt();

        System.out.println("Ingrese su peso");
        peso = datos.nextInt();

        System.out.println("Ingrese su estatura");
        estatura = datos.nextDouble();

        System.out.println("Ingrese su sexo");
        sexo = datos.next();

    }
    public void operaciones(){
        estatura2 = estatura * estatura;
        resultado = peso / estatura2;
    }
    public void mostrarDatos(){
        System.out.println("su tipo de documento  es: "+tipoDocumento);
        System.out.println("Su documento es: "+documento);
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su peso es: "+peso);
        System.out.println("Su estatura es: "+estatura);
        System.out.println("Su estatura es: "+sexo);
        System.out.println("Su IMC es: "+resultado);

        if(resultado < 20){
            System.out.println("El peso esta por debajo de lo ideal");
        }else if(resultado >= 20 && resultado <= 25){
            System.out.println("El peso es ideal");
        }else if(resultado > 25){
            System.out.println("Tiene sobre peso");
        }
    
        if(edad >=18){
            System.out.println("usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }

       
    }
    
}
