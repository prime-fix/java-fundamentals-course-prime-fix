import java.util.Scanner;
import java.util.Random;


class GuessGame {

    private int numeroSecreto;
    private int intentos;

    // Constructor
    public GuessGame() {
        Random random = new Random();
        this.numeroSecreto = random.nextInt(100) + 1; // número de 1 a 100
        this.intentos = 0;
    }

    // Método que verifica el intento del usuario
    public String verificarIntento(int intentoUsuario) {
        intentos++;

        if (intentoUsuario < numeroSecreto) {
            return "El numero es mayor ";
        } else if (intentoUsuario > numeroSecreto) {
            return "El numero es menor ";
        } else {
            return "¡Correcto! Adivinaste el numero.";
        }
    }

    public int getIntentos() {
        return intentos;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GuessGame juego = new GuessGame();

        System.out.println("Bienvenido al Juego de Adivinanza");
        System.out.println("Estoy pensando en un numero entre 1 y 100. Intenta adivinarlo");

        boolean adivinado = false;

        while (!adivinado) {
            System.out.print("Ingresa tu intento: ");
            int intento = scanner.nextInt();

            String resultado = juego.verificarIntento(intento);
            System.out.println(resultado);

            if (resultado.contains("Correcto")) {
                adivinado = true;
            }
        }

        System.out.println("\nNumero secreto: " + juego.getNumeroSecreto());
        System.out.println("Lo lograste en " + juego.getIntentos() + " intentos.");
        System.out.println("Gracias por jugar");
    }
}