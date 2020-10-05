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
public class ListaLlenaException extends IllegalArgumentException{
    public ListaLlenaException(String msg){
        super("La lista esta llena");
    }

    public ListaLlenaException() {
        throw new UnsupportedOperationException("La lista esta llena"); //To change body of generated methods, choose Tools | Templates.
    }
}
