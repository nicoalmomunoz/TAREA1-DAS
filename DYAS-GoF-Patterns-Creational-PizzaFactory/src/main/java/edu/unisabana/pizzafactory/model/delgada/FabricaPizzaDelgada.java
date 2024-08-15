/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.delgada;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.FabricaPizza;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.Moldeador;

public class FabricaPizzaDelgada implements FabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
}
