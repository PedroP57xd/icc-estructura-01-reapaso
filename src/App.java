
import Models.Persona;
import View.ViewConsole;
import Controllers.PersonaController;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan",25 ),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };
        PersonaController personaController = new PersonaController();
        ViewConsole viewConsole = new ViewConsole();
        viewConsole.printMessage("Arreglo Personas");
        viewConsole.printArray(personas);
        viewConsole.printMessage("Arreglo Personas Ordenado por Edad");
        personaController.ordenarPorEdad(personas);
        viewConsole.printMessage("Buscar personas con edad: 40 años");
        int edad= 40;
        
        
        int resultado = PersonaController.buscarPorEdad(personas, edad, 0, personas.length - 1);

        if (resultado != -1) {
            System.out.println("La persona con la edad " + edad + " es " + personas[resultado].getNombre());
        } else {
            System.out.println("No se encontró ninguna persona con esa edad.");
        }



        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
