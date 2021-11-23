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
public class Furgoneta extends Vehiculo{
    private int carga;
    
    public Furgoneta (String matricula, String marca, String modelo, int carga){
        super (matricula, marca, modelo);
        this.carga=carga;
    }
    @Override
    public String mostrardatos(){
        return "Matricula: "+matricula+" Marca: "+marca+" Modelo: "+modelo+" tamaño carga: "+carga;    
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
