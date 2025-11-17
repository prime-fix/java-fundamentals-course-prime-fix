import java.util.Scanner;
import java.util.Random;

/*
 * EJERCICIO: Completar la clase GuessGame usando POO
 * - Crear atributos privados
 * - Inicializarlos en el constructor
 * - Implementar un método para verificar el intento
 * - Crear getters para intentos y número secreto
 */

class GuessGame {

    // TODO: 1. Crear un atributo privado llamado numeroSecreto (tipo int)
    // private int numeroSecreto;

    // TODO: 2. Crear un atributo privado llamado intentos (tipo int)
    // private int intentos;

    // TODO: 3. Crear el constructor de GuessGame
    public GuessGame() {
        // Debe:
        // - Crear un objeto Random
        // - Asignar un número aleatorio entre 1 y 100 al atributo numeroSecreto
        // - Inicializar el contador intentos en 0

        // Ejemplo de guía:
        // Random random = new Random();
        // numeroSecreto = random.nextInt(100) + 1;

        // Completar aquí
    }

    // TODO: 4. Crear un método llamado verificarIntento que:
    // - Reciba un int (el número del usuario)
    // - Aumente el contador de intentos
    // - Compare con el número secreto usando if / else
    // - Devuelva un mensaje indicando si es mayor, menor o correcto
    public String verificarIntento(int intentoUsuario) {

        // intentos++;  // (Sugerencia)

        // TODO: Implementar comparaciones:
        // if (intentoUsuario < numeroSecreto) { ... }
        // else if (intentoUsuario > numeroSecreto) { ... }
        // else { ... }

        return ""; // TODO: reemplazar con el mensaje correcto
    }

    // TODO: 5. Crear un método getIntentos() que devuelva la variable intentos
    // public int getIntentos() { }

    // TODO: 6. Crear un método getNumeroSecreto() que devuelva numeroSecreto
    // public int getNumeroSecreto() { }
}


/*
 * EJERCICIO: Completar el método main
 * - Crear un objeto GuessGame
 * - Usar Scanner para pedir números al usuario
 * - Repetir hasta que adivine
 * - Mostrar resultados finales
 */

public class Main {
    public static void main(String[] args) {

        // TODO: 7. Crear objeto Scanner para leer datos del usuario
        // Scanner scanner = new Scanner(System.in);

        // TODO: 8. Crear un objeto GuessGame llamado juego
        // GuessGame juego = new GuessGame();

        System.out.println("Bienvenido al Juego de Adivinanza");
        System.out.println("Estoy pensando en un número entre 1 y 100. Intenta adivinarlo.");

        // TODO: 9. Crear variable booleana llamada adivinado y ponerla en false
        // boolean adivinado = false;

        // TODO: 10. Crear un bucle while que siga hasta que se adivine
        // while (!adivinado) {

            // TODO: 11. Pedir al usuario que ingrese un número
            // System.out.print("Ingresa tu intento: ");
            // int intento = scanner.nextInt();

            // TODO: 12. Llamar al método verificarIntento del objeto juego
            // String resultado = juego.verificarIntento(intento);

            // TODO: 13. Mostrar el resultado
            // System.out.println(resultado);

            // TODO: 14. Verificar si el resultado contiene la palabra "Correcto"
            // y cambiar adivinado a true si es así
        // }

        // TODO: 15. Mostrar al final:
        // • El número secreto
        // • La cantidad de intentos
        // • Un mensaje de despedida

        // System.out.println("Número secreto: " + ... );
        // System.out.println("Intentos: " + ... );
        // System.out.println("Gracias por jugar.");
    }
}