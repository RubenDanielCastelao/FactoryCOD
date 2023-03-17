package com.billy.transportes;

import javax.swing.*;
/**
 * Clase para objetos Transporte tipo Bicicleta
 */
public class Bicicleta implements ITransportes {
    private Integer cp;
    private Float dimensionX;
    private Float dimensionY;
    private Float dimensionZ;
    private Float peso;
    /**
     *
     * @param cp Codigo postal
     * @param dimensionX Dimension X del producto a enviar
     * @param dimensionY Dimension Y del producto a enviar
     * @param dimensionZ Dimension Z del producto a enviar
     * @param peso Peso del producto a enviar
     */
    public Bicicleta(Integer cp, Float dimensionX, Float dimensionY, Float dimensionZ, Float peso) {
        this.cp = cp;
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.dimensionZ = dimensionZ;
        this.peso = peso;
    }
    /**
     * @param cp -> dar un Codigo Postal
     * @return coste total del envio
     */
    @Override
    public Float costeTotal(Integer cp) {
        while (cp > 37000 || cp < 36000){
            cp = Integer.parseInt(JOptionPane.showInputDialog("A este codigo postal non chegamos, ten que ser maior que 36000 e menor que 37000"));
        }
        Float precio = null;
        precio = (float) ((CODIGO-cp)*0.02);
        if (precio == 0){
            precio = 0.2f;
        }
        return precio;
    }
    /**
     * @param dimensionX -> Las dimensiones ancho
     * @param dimensionY -> Las dimensiones largo
     * @param dimensionZ -> Las dimensiones alto
     * @param peso -> peso
     * @return Tipo de embalaje que se usara en el envio
     */
    @Override
    public Integer tipoEmbalaje(Float dimensionX, Float dimensionY, Float dimensionZ, Float peso) {
        Integer numero = null;
        float suma = dimensionX+dimensionY+dimensionZ;

        if(suma <=150 && peso<=40){
            numero = 1;
        }
        else if(suma<=3000 && peso <=100){
            numero = 2;
        }
        else{
            numero = 0;
        }
        return numero;
    }
}
