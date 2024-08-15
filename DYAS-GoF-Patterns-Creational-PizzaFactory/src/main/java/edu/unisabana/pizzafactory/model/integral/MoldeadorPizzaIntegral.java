/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.integral;

import edu.unisabana.pizzafactory.model.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaIntegral implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "Moldeando pizza pequeña de masa integral.");
        // Código para comunicar con el microcontrolador
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "Moldeando pizza mediana de masa integral.");
        // Código para comunicar con el microcontrolador
    }
}
