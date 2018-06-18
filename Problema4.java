import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int mayor = 0;
        int menor = 0;
        int total = 0;
        boolean inicio = false;
        int tnegativo = 0;
        int tpositivo = 0;
        int n;
        int cantidadn = 0;
        int mediatotal = 0;
        do {
            if (inicio == false) {
                System.out.println("Ingresa un numero:");
                n = leer.nextInt();
                if (n != -1) {
                    if (n > mayor) {
                        mayor = n;
                    }
                    menor = n;
                    total += n;
                    if (n < 0) {
                        tnegativo += n;
                    }
                    if (n > 0) {
                        tpositivo += n;
                    }
                }
                inicio = true;
                cantidadn++;
            } else {

                System.out.println("Ingresa un numero:");
                n = leer.nextInt();
                if (n != -1) {
                    if (n > mayor) {
                        mayor = n;
                    }
                    if (n < menor) {
                        menor = n;
                    }
                    total += n;
                    if (n < 0) {
                        tnegativo += n;
                    }
                    if (n > 0) {
                        tpositivo += n;
                    }
                    cantidadn++;
                }

            }

        } while (n != -1);

        mediatotal = (total / cantidadn);

        System.out.println("Mayor= " + mayor);
        System.out.println("Menor= " + menor);
        System.out.println("Total= " + total);
        System.out.println("Total negativos= " + tnegativo);
        System.out.println("Total positivos= " + tpositivo);
        System.out.println("Media de la suma= " + mediatotal);
    leer.close();
    }

}