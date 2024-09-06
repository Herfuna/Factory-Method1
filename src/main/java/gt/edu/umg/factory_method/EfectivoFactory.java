
package gt.edu.umg.factory_method;

/**
 *
 * @author fuent
 */
public class EfectivoFactory extends PagoFactory{

    @Override
    public MetodoPago hacerpago() {

        return new Efectivo();

    }
    
}
