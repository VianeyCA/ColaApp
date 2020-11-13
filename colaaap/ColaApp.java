package colaapp;

import java.util.Scanner;

public class ColaApp {

     public static void main(String[] args) {
         // TODO code application logic here
         Cola obj=new Cola();
         Scanner op = new Scanner(System.in);
         int opc;
         do{
             System.out.println("*************Pilas*************");
             System.out.println("1.- Insertar");
             System.out.println("2.- Eliminar");
             System.out.println("3.- Mostrar");
             System.out.println("7.- Salir");
             System.out.print("Ingrese una opción: ");
             opc=op.nextInt();
             switch (opc){
                 case 1: 
                     int elemento;
                     System.out.print("Inserte un elemento:  ");
                     elemento=op.nextInt();
                     obj.insertar(elemento);
                     System.out.println("");
                     break;
                 case 2:
                     if(!obj.estaVacia()){
                         System.out.println("El elemento elimidado es: " +obj.eliminar());
                     }else{
                         System.out.println("No hay elementos para eliminar");
                     }
                     System.out.println("");
                     break;
                 case 3:
                     if(!obj.estaVacia()){
                         obj.mostrarCola();
                     }else{
                         System.out.println("No hay elementos");
                     }
                     
                     System.out.println("");
                     break;
                
                 case 4: 
                     break;
                 default: 
                     System.out.println(" Opción invalida, intente nuevamente. ");
             }
             
         } while(opc !=4);
     }
    
}
