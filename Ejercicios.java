/* 
El código contiene los 7 ejercicios de la tarea, para no tener código disperso.
Cada uno es una función, en realidad método, de la clase Ejercicios.
*/

import java.util.Scanner;

class Ejercicios{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Múltiples opciones para diferentes ejercicios
        int opcion;

        System.out.println("\nQué código desea ejecutar:");
        System.out.println("\nCódigo 1: Área del Triángulo.");
        System.out.println("Código 2: Tabla de multiplicar.");
        System.out.println("Código 3: Año bisiesto.");
        System.out.println("Código 4: Número negativo.");
        System.out.println("Código 5: Suma de dígitos.");
        System.out.println("Código 6: Número aleatorio.");
        System.out.println("Código 7: Reloj de arena.");

        System.out.print("\n(Ingrese un entero): ");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                // Area del triángulo
                AreaTriangulo();
                break;
            case 2:
                // Tabla de multiplicar de un número n
                TablaMultiplicar();
                break;
            case 3:
                // verificar si es año bisiesto
                AñoBisiesto();
                break;
            case 4:
                // Promedio con números hasta ingresar un negativo
                NumeroNegativo();
                break;
            case 5:
                // Suma de los dígitos de un número entero
                SumaDigitos();
                break;
            case 6:
                // Suma de los dígitos de un número entero
                AdivinarNumero();
                break;
            case 7:
                // Reloj de arena con asteríscos
                RelojArena();
                break;
        }

        sc.close();
    }

    // Los ejercicios como funciones (Métodos)
    private static void AreaTriangulo(){
        System.out.print("\nIngrese la base del triángulo: ");
        Double base = sc.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        Double altura = sc.nextDouble();

        Double area = (base * altura) / 2;
        System.out.println("\nEl área es: " + area);
    }

    private static void TablaMultiplicar(){
        System.out.print("\nDe qué número desea conocer \"la tabla de multiplicar\": ");
        int numero = sc.nextInt();

        for (int i = 1; i < 13; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    private static void AñoBisiesto(){
        for (int i = 1; i <= 5; i++){
            System.out.print("\nIngrese el año " + i + ": ");
            int año = sc.nextInt();

            if (!(año % 4 == 0)){
                System.out.println("El año " + año + " no es bisiesto");
            }
            else{
                if (!(año % 100 == 0)){
                    System.out.println("El año " + año + " es bisiesto");
                }
                else if (año % 400 == 0){
                    System.out.println("El año " + año + " es bisiesto");
                }
                else{
                    System.out.println("El año " + año + " no es bisiesto");
                }
            }
        }
    }

    private static void NumeroNegativo(){
        int sumaDeNumeros = 0;
        int contador = 0;
        int numero;

        do {
            System.out.print("\nIngrese un número: ");
            numero = sc.nextInt();

            if (numero > 0){
                sumaDeNumeros += numero;
                contador++;
            }
        } while (numero >= 0);
        
        if (contador > 0){
            double promedio = (double) sumaDeNumeros / contador;
            System.out.print("\nEl promedio es: " + promedio);
        }
        else{
            System.out.println("\nNo fue posible calcular el promedio.");
        }
    }

    private static void SumaDigitos(){
        // Si n es un entero se cumple que:
        // n % 10 "retorna el último dígito de n"
        // n / 10 "retorna el número sin el último dígito"
        int sumaDeDigitos = 0;
        int numeroTemp;

        System.out.print("\nIngrese un número entero positivo: ");
        int numero = sc.nextInt();

        numeroTemp = numero;

        while (numeroTemp != 0) {
            int ultimoDigito = numeroTemp % 10;

            sumaDeDigitos += ultimoDigito;
            numeroTemp /= 10;
        }

        System.out.println("La suma de los digitos de " + numero + " es: " + sumaDeDigitos);
    }

    private static void AdivinarNumero(){
        short numeroAleatorio = (short) (100*Math.random()+1);
        short numeroUsuario;
        short intentos = 5;

        do {
            System.out.print("\nIntenta adivinar el número (Del 1 al 100): ");
            numeroUsuario = sc.nextShort();

            if (numeroUsuario > numeroAleatorio){
                System.out.println("El número ingresado es mayor al número aleatorio");
            }
            else if (numeroUsuario < numeroAleatorio){
                System.out.println("El número ingresado es menor al número aleatorio");
            }
            else{
                System.out.println("Acertaste!");
                System.out.println("El número aleatorio es " + numeroAleatorio + ".");
                return;
            }

            intentos--;
            System.out.println("Intentos restantes: " + intentos);
        } while (intentos != 0);

        System.out.println("\nNo pudiste adivinar el número aleatorio!");
        System.out.println("El número aleatorio es " + numeroAleatorio + ".");
    }

    private static void RelojArena(){
        int size;
        System.out.print("Ingrese el tamaño del reloj de arena: ");
        size = sc.nextInt();

        // Marco superior
        System.out.print("+");
        for (int a = 1; a <= (2 * size); a++){
            System.out.print("-");
        }
        System.out.println("+");

        // Cuerpo superior
        for (int fila = 0; fila < size; fila++){
            System.out.print("|");

            // Espacios izquierda
            for (int espacio = 0; espacio < fila; espacio++){
                System.out.print(" ");
            }

            // Asteriscos
            for (int asterisco = 0; asterisco < ((2 * size) - (2 * fila)); asterisco++){
                System.out.print("*");
            }

            // Espacios derecha
            for (int espacio = 0; espacio < fila; espacio++){
                System.out.print(" ");
            }

            System.out.print("|\n");
        }

        // Cuerpo Inferior
        for (int fila = (size - 2); fila >= 0; fila--){
            System.out.print("|");

            // Espacios izquierda
            for (int espacio = 0; espacio < fila; espacio++){
                System.out.print(" ");
            }

            // Asteriscos
            for (int asterisco = 0; asterisco < ((2 * size) - (2 * fila)); asterisco++){
                System.out.print("*");
            }

            // Espacios derecha
            for (int espacio = 0; espacio < fila; espacio++){
                System.out.print(" ");
            }

            System.out.print("|\n");
        }

        // Marco Inferior
        System.out.print("+");
        for (int a = 1; a <= (2 * size); a++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}