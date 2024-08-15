/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.delgada;

import edu.unisabana.pizzafactory.model.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaDelgada implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "Moldeando pizza pequeña de masa convencional.");
        // Código para comunicar con el microcontrolador
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "Moldeando pizza mediana de masa convencional.");
        // Código para comunicar con el microcontrolador
    }
}
