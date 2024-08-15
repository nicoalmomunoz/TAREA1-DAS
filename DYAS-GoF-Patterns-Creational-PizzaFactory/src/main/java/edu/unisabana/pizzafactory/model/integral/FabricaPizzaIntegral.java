/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.integral;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.FabricaPizza;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.Moldeador;

public class FabricaPizzaIntegral implements FabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }
}
