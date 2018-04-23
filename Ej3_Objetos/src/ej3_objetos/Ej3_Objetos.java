/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3_objetos;

/**
 *
 * @author neftali
 */
import java.util.Scanner;
public class Ej3_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Variables
        double longitud;
        int opcion, opcion1;
        boolean menu = false;
        
        //Valor que ingresa el usuario
        System.out.println("INTRODUCE LA LONGITUD DE UN LADO");
        longitud = entrada.nextInt();
        //Instancia de clase Cuadrado
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setLado(longitud);
        //Instanciar clase Cubo
        Cubo cubo1 = new Cubo();
        cubo1.setLado(longitud);
        do {
        //Opciones
        System.out.println("ELIJE LA OPCIÓN QUE DESEAS REALIZAR: \n1:Área de Cuadrado \n2: Perimetro de Cuadrado \n3: Volumen de Cubo \n4:Perimetro de Cubo \n5: Cancelar \n6:Salir");
        opcion = entrada.nextInt();
        
            //Switch Case
            switch(opcion){
                case 1:
                    System.out.println("RESULTADO: \nLongitud = "+longitud +"\nEl área de cuadrado es: " + cuadrado1.calcularArea());
                    break;
                case 2: 
                    System.out.println("RESULTADO: \nLongitud = "+longitud +"\nEl perimetro del cuadrado es: " +cuadrado1.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("RESULTADO: \nLongitud = "+longitud +"\nEl volumen de cubo es: " +cubo1.calcularVolumen());
                    break;
                case 4:
                    System.out.println("RESULTADO: \nLongitud = "+longitud +"\nEl perimetro del cubo es: " +cubo1.calcularPerimetro());
                    break;
                case 5:
                    Ej3_Objetos.main(null);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                   System.out.println("Elije opciones entre 1 y 6");
            }
            
            System.out.println("ELIJE UNA OPCIÓN: \n1:Menú de Calculos(Misma longitud) \n2:Ingresar nueva longitud \n3:Salir");
            opcion1 = entrada.nextInt();
            switch (opcion1){
                case 1:
                    menu = true;
                    break;
                case 2:
                    Ej3_Objetos.main(null);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Elige una opción entre 1 y 2");
            }
        } while(menu = true);    
    }
    
   
    
}
