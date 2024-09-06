
package gt.edu.umg.factory_method;
import java.util.Scanner;

/**
 *
 * @author fuent
 */
public class Factory_Method {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MetodoPago tarjeta = new TarjetaFactory().hacerpago();
        MetodoPago efectivo = new EfectivoFactory().hacerpago();
        System.out.println("El precio de su compra es de 100 quetzales exactos, como desea pagar?: ");
        System.out.println("1. Tajeta");
        System.out.println("2. Efectivo");
        int total = entrada.nextInt();
        
        switch (total) {
            case 1 -> tarjeta.pagar(100.00);
            case 2 -> efectivo.pagar(100.00);
            default -> System.out.println("la opcion no existe");
        }
       
        
    }
}
