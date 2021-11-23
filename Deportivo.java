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
public class Deportivo extends Vehiculo {
     private int  cilindrada;
    
    public Deportivo (String matricula, String marca, String modelo, int cilindrada){
        super (matricula, marca, modelo);
        this.cilindrada=cilindrada;
    }
    @Override
    public String mostrardatos(){
        return "Matricula: "+matricula+" Marca: "+marca+" Modelo: "+modelo+" Cilindrada: "+cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
