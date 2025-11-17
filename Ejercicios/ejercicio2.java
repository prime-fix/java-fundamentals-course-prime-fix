/*
 Ejercicio: EvaluadorNotas

 Objetivo:
 - Implementar un programa que calcule el promedio de tres notas, determine si el estudiante aprueba
   y muestre un mensaje personalizado con su nombre usando tipos: int, double, String y boolean.

 Debes demostrar:
 - Operadores aritméticos: +, -, *, /
 - Operadores relacionales: ==, !=, >, >=, <, <=
 - Operadores lógicos: &&, ||, !

 Reglas mínimas:
 - Aprobado si promedio (o promedio ajustado) >= 13.0 y asistencia >= 70
 - Si alguna nota es 0.0, se fuerza desaprobado
 - “Destacado” si promedio (o promedio ajustado) >= 18.0
*/

public class Main {
    public static void main(String[] args) {

        // TODO 1: Declaración e inicialización
        // - String nombre = "Alicia";
        // - double nota1 = 15.5, nota2 = 17.0, nota3 = 12.0;
        // - int asistencia = 80;  // 0 a 100
        // - boolean aprobado, destacado;

        // TODO 2: Operaciones aritméticas (+ y /)
        // - double suma = nota1 + nota2 + nota3;
        // - double promedio = suma / 3.0;   // usa 3.0 para mantener double

        // TODO 3: Más aritmética (+, -, *)
        // - double bono = 0.5;              // ejemplo de suma
        // - double penalizacion = 0.25;     // ejemplo de resta
        // - double promedioAjustado = (promedio + bono) - penalizacion;
        // - double ponderada = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40);

        // TODO 4: Relacionales y lógicos (==, >=, &&, ||, !)
        // - boolean notaCero = (nota1 == 0.0) || (nota2 == 0.0) || (nota3 == 0.0);
        // - aprobado = (promedioAjustado >= 13.0) && (asistencia >= 70);
        // - Si notaCero es true, asigna aprobado = false;
        // - boolean noAprobado = !aprobado;

        // TODO 5: Destacado
        // - destacado = promedioAjustado >= 18.0;

        // TODO 6: Salidas por consola
        // - Imprime: nombre, notas, asistencia
        // - Imprime: suma, promedio, promedioAjustado, ponderada
        // - Imprime: ¿Alguna nota es 0? (notaCero)
        // - Imprime: ¿Aprobado?, ¿No aprobado? y ¿Destacado?

        // TODO 7 (opcional): Validaciones
        // - Avisar si alguna nota < 0 o > 20
        // - Avisar si asistencia < 0 o > 100

        // TODO 8 (opcional): Resumen en una línea
        // - "Alumno: <nombre> | Prom: <promedioAjustado> | Asist: <asistencia>% | Aprobado: <aprobado>"

        // TODO 9 (reto): Regla alternativa
        // - Aprueba si (promedio >= 12.0 && asistencia >= 80) || destacado
        // - Imprime qué regla determinó el resultado final
    }
}
