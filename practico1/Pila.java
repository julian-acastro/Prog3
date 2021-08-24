package practico1;

public class Pila<T> {
	ListaVinculada<T> lista;
	Boolean invertir;
	
	public Pila() {
		this.lista = new ListaVinculada<T>();
		this.invertir= false;
	}
	//Implemente una Pila utilizando la Lista del ejercicio 1. A una pila se le pueden agregar
	//elementos utilizando el método push(T o). Para retirar elementos de la colección se utiliza el
	//método pop(), que retorna el último elemento agregado a la colección y lo elimina de la
	//misma. Es posible consultar el tope de la pila (sin eliminarlo) utilizando el método top(). Por
	//último, es posible invertir el orden de los elementos de la pila mediante el método reverse().
	
	public void push (T info) {
		if(this.invertir== false) {
			this.lista.insertFront(info);
		}else {
			this.lista.insertLast(info);
		}
	}
	public T pop() {
		if(this.invertir== false) {
			return this.lista.extractFront();
		}else {
			return this.lista.extractLast();
		}
	}
	public T top() {
		if(this.invertir== false) {
			return this.lista.get(0);
		}else {
			return this.lista.get(this.lista.size()-1);
		}
	}
	public void reverse() {
		if(this.invertir==false) {
			this.invertir=true;
		}else {
			this.invertir=false;
		}
	}
	
}
