/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod.builders;

/**
 *
 * @author Juan Martínez
 */
public class CODBuilders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objeto creado con las elementos obligatorios
        Pizza miPizzaHawaiana= new PizzaBuilder(3,4).setGrPinha(4).setTipoAceite("Oliva").setGrQueso(9).setTipoQueso("Gouda").createPizza(); 
        System.out.println(miPizzaHawaiana);
        
    }
    
}
