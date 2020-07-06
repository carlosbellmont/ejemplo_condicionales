package com.ejemplo;

public class Main {

    public static void main(String[] args) {
        ejercicio1("Corto");
        ejercicio1("Muy largo!!");

        ejercicio2("a");
        ejercicio2("ab");
        ejercicio2("abc");
        ejercicio2("abcd");
        ejercicio2("abcde");
        ejercicio2("abcdef");

        ejercicio3("Saluda");
        ejercicio3("Despidete");
        ejercicio3("Cosas locas");

        int resultado = ejercicio4("dos");
        System.out.println("El resultado es " + resultado);
        resultado = ejercicio4("tres");
        System.out.println("El resultado es " + resultado);
        resultado = ejercicio4("cuatro");
        System.out.println("El resultado es " + resultado);
        resultado =  ejercicio4("cinco");
        System.out.println("El resultado es " + resultado);
    }

    static private void ejercicio1(String stringEjemplo){
        // Esta función escribe un texto u otro dependiendo de la longitud del String
        int numeroMin = 0;
        int numeroMax = 5;
        if (stringEjemplo.length() > numeroMin && stringEjemplo.length() < numeroMax) {
            // Se ejecutará solo si la condicion es verdadera
            System.out.println("El string tiene entre " + numeroMin + " y " + numeroMax + " letras");
        } else {
            System.out.println("El string no cumple las caracteristicas");
        }
    }


    static private void ejercicio2(String string){
        // Si recibe un numero al 1 al 5, te dice el número en letras
        if (string.length() == 1){
            System.out.println("El string tiene una letra");
        } else {
            if (string.length() == 2) {
                System.out.println("El string tiene dos letras");
            } else {
                if (string.length() == 3) {
                    System.out.println("El string tiene tres letras");
                } else {
                    if (string.length() == 4) {
                        System.out.println("El string tiene cuatro letras");
                    } else {
                        if (string.length() == 5) {
                            System.out.println("El string tiene cinco letras");
                        } else {
                            System.out.println("El string tiene más de cinco letras");
                        }
                    }
                }
            }
        }
    }

    static private void ejercicio3(String stringEjemplo){
        if (stringEjemplo.contentEquals("Saluda")){
            System.out.println("Hola que tal?");
        } else {
            if (stringEjemplo.contentEquals("Despidete")){
                System.out.println("Adios, hasta otra");
            } else {
                System.out.println("No se que decir");
            }
        }
    }

    static private int ejercicio4(String stringEjemplo){
        // Si recibe un string que contiene un numero del 1 al 5, te devuelve el interger correspondiente.

        if (stringEjemplo.contentEquals("uno")){
            return 1;
        }
        if (stringEjemplo.contentEquals("dos")) {
            return 2;
        }
        if (stringEjemplo.contentEquals("tres")){
            return 3;
        }
        if (stringEjemplo.contentEquals("cuatro")){
            return 4;
        }
        if (stringEjemplo.contentEquals("cinco")){
            return 5;
        }
        return -1;
    }
}
