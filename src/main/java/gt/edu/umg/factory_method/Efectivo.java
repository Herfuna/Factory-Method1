
package gt.edu.umg.factory_method;

/**
 *
 * @author fuent
 */
public class Efectivo implements MetodoPago{

    @Override
    public void pagar(double cantidad) {
        System.out.println("Usted esta pagando Q "+cantidad + " en efectivo");
        System.out.println("Muchas gracias!! ");
    }
    
    
}
