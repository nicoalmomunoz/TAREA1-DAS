/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.delgada;

import edu.unisabana.pizzafactory.model.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaDelgada implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaDelgada.class.getName())
            .log(Level.INFO, "Horneando la pizza delgada con masa convencional.");
        // Código para comunicar con el microcontrolador
    }
}

