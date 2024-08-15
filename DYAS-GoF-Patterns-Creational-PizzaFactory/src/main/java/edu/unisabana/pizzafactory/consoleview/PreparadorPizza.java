
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.FabricaPizza;
import edu.unisabana.pizzafactory.model.delgada.FabricaPizzaDelgada;
import edu.unisabana.pizzafactory.model.gruesa.FabricaPizzaGruesa;
import edu.unisabana.pizzafactory.model.integral.FabricaPizzaIntegral;

import java.util.Scanner;

public class PreparadorPizza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de pizza:");
        System.out.println("1. Pizza delgada");
        System.out.println("2. Pizza gruesa");
        System.out.println("3. Pizza integral");

        int tipo = scanner.nextInt();
        FabricaPizza fabrica;

        switch (tipo) {
            case 1:
                fabrica = new FabricaPizzaDelgada();
                break;
            case 2:
                fabrica = new FabricaPizzaGruesa();
                break;
            case 3:
                fabrica = new FabricaPizzaIntegral();
                break;
            default:
                throw new IllegalArgumentException("Tipo de pizza no válido");
        }

        System.out.println("Seleccionando amasador...");
        fabrica.crearAmasador().amasar();
        System.out.println("Seleccionando moldeador...");
        System.out.println("1. Pizza pequeña");
        System.out.println("2. Pizza mediana");

        int tamano = scanner.nextInt();

        switch (tamano) {
            case 1:
                fabrica.crearMoldeador().moldearPizzaPequena();
                break;
            case 2:
                fabrica.crearMoldeador().moldearPizzaMediana();
                break;
            default:
                throw new IllegalArgumentException("Tamaño no válido");
        }

        System.out.println("Horneando pizza...");
        fabrica.crearHorneador().hornear();
        System.out.println("Pizza preparada.");
    }
}
