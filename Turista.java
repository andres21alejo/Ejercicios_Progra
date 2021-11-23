/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author User
 */
public class Turista extends Vehiculo {
     private int puertas;
    
    public Turista (String matricula, String marca, String modelo, int puertas){
        super (matricula, marca, modelo);
        this.puertas=puertas;
    }
    @Override
    public String mostrardatos(){
        return "Matricula: "+matricula+" Marca: "+marca+" Modelo: "+modelo+" Número de puertas: "+puertas;
    }
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
