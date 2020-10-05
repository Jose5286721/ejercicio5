/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.ejercicio5.excepciones;

/**
 *
 * @author jose-arco
 */
public class PosicionFueraRangoException extends ArrayIndexOutOfBoundsException{
    public PosicionFueraRangoException(String msg){
        super("La posicion se encuentra fuera de rango");
    }

    public PosicionFueraRangoException() {
        throw new UnsupportedOperationException("La posicion se encuentra fuera de rango"); //To change body of generated methods, choose Tools | Templates.
    }
}
