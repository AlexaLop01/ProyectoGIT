
import java.util.Scanner;
/**
 * Jessica Alexandra López Franco
 */
public class Programa_2 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        double nota;

        System.out.print("Introduce una nota: ");
        nota = teclat.nextInt(); 

        if(nota < 0 || nota >10){
            System.out.println("ERROR!! Nota incorrecta.");
        }
        else if(nota >=9){
            System.out.println("Sobresaliente");
        }
        else if(nota >=7){
            System.out.println("Notable");
        }
        else if(nota >= 5){
            System.out.println("Aprobado");
        }
        else {
            if(nota < 5){
            System.out.println("Suspenso");
            }
        }
    }
}