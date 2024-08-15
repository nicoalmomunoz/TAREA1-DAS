/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.gruesa;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.FabricaPizza;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.Moldeador;

public class FabricaPizzaGruesa implements FabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }
}
