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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo auto[] = new Vehiculo[4];
        
        auto[0] = new Vehiculo ("HA22321", "Toyota", "2021");
        auto[1] = new Turista ("ES29129", "Mazda", "2003", 4);
        auto[2] = new Deportivo ("HE20102", "Bughatti", "2000", 4);
        auto[3] = new Furgoneta ("TE20201", "Jeep", "2016", 300);
        for (Vehiculo auto2 : auto){
            System.out.println(auto2.mostrardatos());
            System.out.println("");
        }
    }
}
