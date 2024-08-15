/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.delgada;

import edu.unisabana.pizzafactory.model.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaDelgada implements Amasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "Amasando la pizza delgada con masa convencional.");
        // Código para comunicar con el microcontrolador
    }
}
