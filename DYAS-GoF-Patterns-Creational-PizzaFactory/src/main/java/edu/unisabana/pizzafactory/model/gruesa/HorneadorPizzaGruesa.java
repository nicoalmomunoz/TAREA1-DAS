/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.gruesa;

import edu.unisabana.pizzafactory.model.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaGruesa implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaGruesa.class.getName())
            .log(Level.INFO, "Horneando la pizza gruesa con masa de pan.");
        // Código para comunicar con el microcontrolador
    }
}
