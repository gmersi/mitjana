package mitjana;
import java.util.Scanner;
public class Mitjana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float suma = 0;
        float mitjana = 0;
        float nou_valor;
        int numero_repeticions = 0;
        String consulta = "s";
        while(consulta.equalsIgnoreCase("s") ) {
            System.out.print("Dona la següent dad: ");
            nou_valor = input.nextFloat();
            suma = suma + nou_valor;
            numero_repeticions++;
            System.out.println("Vols continuar? (s/n)");
            consulta = input.next();
        }
        mitjana = suma / numero_repeticions;
        System.out.println("La mitjana resultant es: " + mitjana);
    }
}
