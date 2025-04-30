public class DrivingLicense {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) que contenga los puntos del carnet de conducir que empiece con 0 puntos.
        byte punts = 0;;
        System.out.println("Has sacado tu carnet de conducir, felicidades tienes 12 puntos");
        // Actualiza los puntos aquí
        int firstpoints = punts + 12;;
        System.out.println("Te has negado a realizar pruebas de alcohol o drogas, pierdes 6 puntos");
        // Actualiza los puntos aquí
        int secondpoints = firstpoints - 6;;
        System.out.println("En este momento, tienes " + secondpoints + " puntos.");
        System.out.println("Te has negado a realizar pruebas de alcohol o drogas, pierdes 6 puntos");
        int thirdpoints = secondpoints - 6;;
        System.out.println("En este momento, tienes " + thirdpoints + " puntos.");
        System.out.println("Has conducido con cascos o auriculares, pierdes 3 puntos");
        // Actualiza los puntos aquí
        int fourthpoints = thirdpoints - 3;;
        System.out.println("En este momento, tienes " + fourthpoints + " puntos.");
        System.out.println("Tu coche detecta radares, pierdes 3 puntos");
        // Actualiza los puntos aquí
        int fifthpoints = fourthpoints - 3;;
        System.out.println("En este momento, tienes " + fifthpoints + " puntos.");
        System.out.println("Te han retirado el carnet y ahora lo has recuperado, ganas 8 puntos");
        // Actualiza los puntos aquí
        int sixthpoints = fifthpoints + 8;;
        System.out.println("En este momento, tienes " + sixthpoints + " puntos.");
        System.out.println("Has conducido sin haber cometido ninguna infracción en el transcurso de 2 años, ganas 4 puntos");
        // Actualiza los puntos aquí
        int seventhpoints = sixthpoints +4;;
        System.out.println("En este momento, tienes " + seventhpoints + " puntos.");
        System.out.println("Han pasado 3 años y sigues sin cometer infracciones, ganas 2 puntos");
        // Actualiza los puntos aquí
        int eighthpoints = seventhpoints + 2;
        System.out.println("¿Cuántos puntos tienes");
        // Imprimir el total de puntos que tienes actualmente
        System.out.println("Actualmente tienes " + eighthpoints + " puntos.");
    }
}