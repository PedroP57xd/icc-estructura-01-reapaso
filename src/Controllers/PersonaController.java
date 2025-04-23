package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {

        for (int i = 1; i < personas.length; i++) {
            Persona key = personas[i]; 
            int j = i - 1; 
            while (j >= 0 && personas[j].getEdad() > key.getEdad()) {
                personas[j + 1] = personas[j]; 
                j = j - 1; 
            }
            personas[j + 1] = key;
        }
        // throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public static int buscarPorEdad(Persona[] personas, int edad, int bajo, int alto) {
        
        if (bajo > alto) {
            return -1; 
        }
    
        int centro = bajo + (alto - bajo) / 2;
        int valorCentro = personas[centro].edad;
    
    
        if (valorCentro == edad) {
            while (centro > 0 && personas[centro - 1].edad == edad) {
                centro--;
            }
            System.out.println("ENCONTRADO");
            return centro;
        // throw new UnsupportedOperationException("Not implemented yet.");

    }
        return valorCentro;
}
}
