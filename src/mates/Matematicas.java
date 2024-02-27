package mates;

import java.util.Random;


public class Matematicas {
    
    
    public static double generarNumeroPiRecursivo(long pasos, int puntosDentroCirculo, int puntosGenerados) {
        
        if (puntosGenerados == pasos) {
            return 4.0 * puntosDentroCirculo / puntosGenerados;
        }
        Random random = new Random();
        double x = random.nextDouble();
        double y = random.nextDouble();
        if (x * x + y * y <= 1) {
            return generarNumeroPiRecursivo(pasos, puntosDentroCirculo + 1, puntosGenerados + 1);
        } else {
            return generarNumeroPiRecursivo(pasos, puntosDentroCirculo, puntosGenerados + 1);
        }
    }
    }

