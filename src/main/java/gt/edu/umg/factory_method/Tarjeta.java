
package gt.edu.umg.factory_method;

/**
 *
 * @author fuent
 */
public class Tarjeta implements MetodoPago {

    @Override
    public void pagar(double cantidad) {
        System.out.println("usted esta pagando Q"+ cantidad+ " con tarjeta.");
        System.out.println("Muchas gracias!! ");
    }
    
}
