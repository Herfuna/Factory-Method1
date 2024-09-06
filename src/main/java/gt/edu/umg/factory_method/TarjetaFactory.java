
package gt.edu.umg.factory_method;

/**
 *
 * @author fuent
 */
public class TarjetaFactory extends PagoFactory {

    @Override
    public MetodoPago hacerpago() {
        return new Tarjeta();
        
    }
    
}
