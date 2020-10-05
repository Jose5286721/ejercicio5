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
public class ListaVaciaException extends NullPointerException{
    public ListaVaciaException(String msg){
        super("Error. La lista se encuentra vacia");
    }

    public ListaVaciaException() {
        throw new UnsupportedOperationException("Error. La lista se encuentra vacia"); //To change body of generated methods, choose Tools | Templates.
    }
}
