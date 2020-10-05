/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.ejercicio5;
import java.lang.reflect.Array;
import py.com.ejercicio5.excepciones.*;
import java.util.Vector;
/**
 *
 * @author jose-arco
 */
public class ListaEstatica<T> implements InterfaceListaVector<T>{

    private Vector<T> listaEstatica;
    
    /**
    * inicia la estructura con la cant indicada de elementos
    */
  public void iniciar(int cant){
      this.listaEstatica = new Vector<T>(cant);
  }

  /**
   * inserta el dato en la pos indicada, si la pos no est� libre
   * debe mover los elementos para insertar en la pos
   * si la lista est� llena debe lanzar ListaLlenaException
  */
  public void insertar(T dato, int pos) throws PosicionFueraRangoException, ListaLlenaException{
      if(pos < 1 || pos > this.listaEstatica.size()){
          throw new PosicionFueraRangoException();
      }
      if(this.listaEstatica.capacity() == 0){
          throw new ListaLlenaException();
      }
      this.listaEstatica.add(pos-1, dato);
  }

  /**
   * inserta el dato despues del �ltimo elemento insertado, 
   * si no existe lugar libre lanza ListaLlenaException
   */
  public void insertar(T dato)
            throws ListaLlenaException{
      this.listaEstatica.add(dato);
  }

  /**
   * elimina y devuelve el objeto que est� en pos, si existe 
   * si no existe, lanza PosicionFueraRangoException
   * Si la lista esta vac�a lanza ListaVaciaException
  */
  public T suprimir(int pos) throws  PosicionFueraRangoException, 
						ListaVaciaException{
      if(pos < 1 || pos > this.listaEstatica.size()){
          throw new PosicionFueraRangoException();
      }
      if(this.listaEstatica.isEmpty()){
          throw new ListaVaciaException();
      }
      T objeto = this.listaEstatica.get(pos-1);
      this.listaEstatica.remove(pos-1);
      return objeto;
  }

  /**
   * elimina y retorna el dato que se encuentra como primer elemento
   */
  public T suprimir() throws ListaVaciaException{
      if(this.listaEstatica.isEmpty()){
          throw new ListaVaciaException();
      }
      T objeto = this.listaEstatica.firstElement();
      this.listaEstatica.remove(0);
      return objeto;
  }

  /**
   * devuelve sin sacar el dato que se encuentra en pos,
   */
  public T consultar(int pos) throws ListaVaciaException,
                PosicionFueraRangoException{
      if(pos<1 || this.listaEstatica.size() < pos){
          throw new PosicionFueraRangoException();
      }
      if(this.listaEstatica.isEmpty()){
          throw new ListaVaciaException();
      }
      return this.listaEstatica.get(pos-1);
  }

  /**
   * devuelve true si la estructura esta vac�a
   */
  public boolean estaVacia(){
      return this.listaEstatica.isEmpty();
  }
  /**
   * devuelve true si la estructura estallena
   */
  public boolean estaLlena(){
      return this.listaEstatica.capacity() == 0; 
  }

   /**
    * busca un elemento y devuelve su ubicaci�n en la lista si existe, 
	* siendo 1 el primer elemento
    * retorna 0 si no existe (o la lista esta vacia)
    */ 
  public int buscar(T dato){
      if(this.listaEstatica.size() == 0 || !this.listaEstatica.contains(dato)){
          return 0;
      }
      return this.listaEstatica.indexOf(dato)+1;
  }

  /**
   * devuelve el tama�o de la estructura, no la capacidad del vector
   */
  public int tamano(){
      return this.listaEstatica.size();
  }

  /**
   * devuelve un nuevo vector con los elementos ordenados
   * el vector original no debe ordenarse
   */
  public Object[] ordenar(){
      return null;
  }

    
}
