package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para contar monedas y total ahorrado en pesos
        int monedas20 = 0, monedas50 = 0, monedas100 = 0, monedas200 = 0, monedas500 = 0;
        int total = 0;
        int opcion;

        do {
            System.out.println("\n--- Menú Alcancía ---");
            System.out.println("1. Agregar moneda");
            System.out.println("2. Ver conteo de monedas");
            System.out.println("3. Ver total ahorrado");
            System.out.println("4. Romper la alcancía");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor de la moneda: ");
                    int moneda = scanner.nextInt();

                    switch (moneda) {
                        case 20:
                            monedas20++;
                            total += 20;
                            break;
                        case 50:
                            monedas50++;
                            total += 50;
                            break;
                        case 100:
                            monedas100++;
                            total += 100;
                            break;
                        case 200:
                            monedas200++;
                            total += 200;
                            break;
                        case 500:
                            monedas500++;
                            total += 500;
                            break;
                        default:
                            System.out.println(" Moneda no válida. Use: 20, 50, 100, 200 o 500.");
                    }
                    System.out.println(" Moneda de $" + moneda + " agregada.");
                    break;

                case 2:
                    System.out.println("\n Conteo de monedas:");
                    System.out.println("$20: " + monedas20 + " monedas");
                    System.out.println("$50: " + monedas50 + " monedas");
                    System.out.println("$100: " + monedas100 + " monedas");
                    System.out.println("$200: " + monedas200 + " monedas");
                    System.out.println("$500: " + monedas500 + " monedas");
                    break;

                case 3:
                    System.out.println(" Total ahorrado: $" + total);
                    break;

                case 4:
                    System.out.println(" Alcancía rota. Se retiraron $" + total);
                    // Reiniciar valores
                    monedas20 = monedas50 = monedas100 = monedas200 = monedas500 = total = 0;
                    break;

                case 5:
                    System.out.println(" Saliendo del programa...");
                    break;

                default:
                    System.out.println(" Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}