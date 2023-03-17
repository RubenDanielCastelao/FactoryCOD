import com.billy.transportes.Barco;
import com.billy.transportes.Camion;
import com.billy.transportes.Bicicleta;
import com.billy.transportes.ITransportes;

import javax.swing.*;

/**
 * Fabrica encargada de devolver el producto
 * que elegimos según el tipo
 */
public class Factoria {
    public static final int CAMION = 1;
    public static final int BICICLETA = 2;
    public static final int BARCO = 3;
    public static Integer cp = null;
    public static Float dimensionX = null;
    public static Float dimensionY = null;
    public static Float dimensionZ = null;
    public static Float peso = null;

    /**
     * @param type Tipo de transporte
     * @return
     */
    public static ITransportes getProducto(int type) {
        cp = Integer.parseInt(JOptionPane.showInputDialog("Teclee tu CP"));
        dimensionX = Float.parseFloat(JOptionPane.showInputDialog("Teclee a dimensionX"));
        dimensionY = Float.parseFloat(JOptionPane.showInputDialog("Teclee a dimensionY"));
        dimensionZ = Float.parseFloat(JOptionPane.showInputDialog("Teclee a dimensionZ"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Teclee o peso"));
        switch (type) {
            case CAMION:
                return new Camion(cp, dimensionX, dimensionY, dimensionZ, peso);
            case BICICLETA:
                return new Bicicleta(cp, dimensionX, dimensionY, dimensionZ, peso);
            case BARCO:
                return new Barco(cp,dimensionX,dimensionY,dimensionZ,peso);
            default:
                return null;
        }
    }

}