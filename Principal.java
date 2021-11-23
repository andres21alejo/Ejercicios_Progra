/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Principal {
    
    static List<Persona> lista = new ArrayList();
    static byte seleccion;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu (){
        System.out.println("\t\t\tSeleccione que quiere hacer \n\nIngresar nuevo alumno (1)\tDar listado de alumnos (2)\t"
                + "Salir y mostrar los alumnos agregados (3)");
        seleccion = sc.nextByte();
        switch (seleccion){
            case 1: registro();
                break;
            case 2: listadoalumnos();
                break;
            case 3: fin();
                break;
            default:
                break;
        }
    }
    
    public static void registro(){
        Persona persona = new Persona ();
        System.out.println("Ingrese el nombre del alumno: ");
        persona.setNombre(sc.next());
        System.out.println("Ingrese el apellido del alumno: ");
        persona.setApellido(sc.next());
        System.out.println("Ingrese la dirección del alumno: ");
        persona.setDirección(sc.next());
        System.out.println("Ingrese el ID del alumno: ");
        persona.setId(sc.nextInt());
        
        existente();
        if(existente()){
            System.out.println("El registro ya existe\n"
                    + "Intente agregar otro\n");
        }
        else{
            lista.add(persona);
        }
        
        menu();
        
    }
    
    public static boolean existente(){
        Persona alumnos = new Persona ();
        Iterator<Persona> iterador = lista.iterator();
        while(iterador.hasNext()){
            if(alumnos.getId() == iterador.next().getId()){
                return true;
            }
        }
        return false;
    }
    
    public static void listadoalumnos(){
        System.out.println("NOMBRE\tAPELLIDO\tID\tDIRECCION");
        for (Persona persona : lista) {
            System.out.print(persona.getNombre()+"\t");
            System.out.print(persona.getApellido()+"\t");
            System.out.print(persona.getId()+"\t");
            System.out.println(persona.getDirección()+"\n");
            
        }
        menu();  
}
    public static void fin (){
        System.out.println("NOMBRE\tAPELLIDO\tID");
        for (Persona persona : lista) {
            System.out.print(persona.getNombre()+"\t");
            System.out.print(persona.getApellido()+"\t");
            System.out.println(persona.getId()+"\n");
        }
    }
}


