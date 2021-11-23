/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

 public static Persona persona = new Persona();
    public static List<Persona> lista = new ArrayList();
    static byte seleccion;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         menu();
    }
    
    public static void menu (){
    System.out.println("--------------------------------------------------------------------------");
    System.out.println("¿Qué desea hacer? \nIngresar un nuevo alumno (1)\nMostrar el listado de alumnos (2)\nEliminar el registro de algún alumno (3)\nSalir y mostrar los alumnos registrados (4)");
    System.out.println("--------------------------------------------------------------------------");
    seleccion = sc.nextByte();
        switch (seleccion){
            case 1: registrar();
                break;
            case 2: listado();
                break;
             case 3: eliminar();
                break;
             case 4: fin();
                break;
            default:
                break;
        }
    }
    
    public static void menu2(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("¿Qué desea hacer?\nEliminar otro registro(1)\nRegresar al menú principal(2)");
        System.out.println("--------------------------------------------------------------------------");
        seleccion = sc.nextByte();
        switch (seleccion){
            case 1: eliminar();
                break;
            case 2: menu();
                break;
            default:
                break;
        }
    }
    
    public static void registrar(){
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre del alumno: ");
        persona.setNombre(sc.next());
        System.out.println("Ingrese el apellido del alumno: ");
        persona.setApellido(sc.next());
        System.out.println("Ingrese la dirección del alumno: ");
        persona.setDirección(sc.next());
        System.out.println("Ingrese el ID del alumno: ");
        persona.setId(sc.nextInt());
        if(existente(persona)){
        }
        else{
            lista.add(persona);
        }
        menu();
    }
    
    public static boolean existente(Persona alumnos){
        Iterator<Persona> iterador = lista.iterator();
        while(iterador.hasNext()){
            if(alumnos.getId() == iterador.next().getId()){
                System.out.println("-------------------------");
                System.out.println("Este registro ya existe");
                System.out.println("-------------------------");
                return true;
            }
        }
        return false;
    }
    
    public static void eliminar(){
        int remover;
        Iterator<Persona> iterador = lista.iterator();
        fin();
        System.out.println("\t\tIngrese el ID del alumno que desea eliminar: ");
        remover = sc.nextInt();
            while(iterador.hasNext()){
                if(remover == iterador.next().getId()){
                iterador.remove();
                }
            }
        fin();
        menu2();
    }
    
    public static void listado(){
        System.out.println("Nombres\t\t\tApellidos\t\t\t\tID's\t\t\tDirecciones");
        Iterator<Persona> iterador = lista.iterator();
        while(iterador.hasNext()){
            iterador.next().mostrarDatos();  
        }
        menu();  
    }
    
    public static void fin (){
        System.out.println("Nombres\t\t\tApellidos\t\t\t\tID's\t\t\tDirecciones");
        Iterator<Persona> iterador = lista.iterator();
        while(iterador.hasNext()){
            iterador.next().mostrarDatos();  
        }
    }
    
}
