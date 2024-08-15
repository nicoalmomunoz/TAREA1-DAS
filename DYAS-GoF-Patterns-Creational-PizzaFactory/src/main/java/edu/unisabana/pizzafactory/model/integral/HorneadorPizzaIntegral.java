/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.integral;

import edu.unisabana.pizzafactory.model.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaIntegral implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaIntegral.class.getName())
            .log(Level.INFO, "Horneando la pizza con masa integral.");
        // Código para comunicar con el microcontrolador
    }
}
