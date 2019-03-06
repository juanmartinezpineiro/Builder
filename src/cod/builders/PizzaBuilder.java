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

public class PizzaBuilder {

    private float grHarina;
    private float mlAgua;
    private float grSal;
    private float mlAceite;
    private float grTomate;
    private float grQueso;
    private float grPinha;
    private String tipoAceite;
    private String tipoQueso;

    public PizzaBuilder(float grHarina,float mlAgua) {
        this.grHarina =grHarina;
        this.mlAgua= mlAgua;
    }

    public PizzaBuilder setGrHarina(float grHarina) {
        this.grHarina = grHarina;
        return this;
        // Return para añadir set al constructor
    }

    public PizzaBuilder setMlAgua(float mlAgua) {
        this.mlAgua = mlAgua;
        return this;
                // Return para añadir set al constructor
    }

    public PizzaBuilder setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
                // Return para añadir set al constructor
    }

    public PizzaBuilder setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
                // Return para añadir set al constructor
    }

    public PizzaBuilder setGrTomate(float grTomate) {
        this.grTomate = grTomate;
        return this;
                // Return para añadir set al constructor
    }

    public PizzaBuilder setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
                // Return para añadir set al constructor
    }

    public PizzaBuilder setGrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;
                // Return para añadir set al constructor
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
                // Return para añadir set al constructor
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
                // Return para añadir set al constructor
    }

    public Pizza createPizza() {
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, grTomate, grQueso, grPinha, tipoAceite, tipoQueso);
    }
    
}
