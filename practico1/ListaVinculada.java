package practico1;
//Ejercicio 1.
//Implemente los métodos indicados del esqueleto de Lista desarrollado en Teoría
//insertFront, extractFront, isEmpty, size). Agregar también el método: T get(index)
import java.util.Iterator;

public class ListaVinculada<T> implements Iterable<T>{
	private Node<T> first;
	private Node<T> last;
	private int _size;
	
	public ListaVinculada() {
		this.first = null;//guarda el primer nodo.
		this.last = null;//guarda el ultimo nodo.
		//this.invertir = false;//define de q modo se lee la lista.
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null,null);
		tmp.setNext(this.first);
		if(this.first==null) {
			this.last=tmp;
			this.first = tmp;
		}else {
			this.first = tmp;
			Node<T> posible = this.first.getNext();
			posible.setBack(this.first);
		}
		this._size++;		
	}
	
	public T extractFront() {
		T info = this.first.getInfo();
		this.first= this.first.getNext();
		this.first.setBack(null);
		this._size--;
		return info;
	}
	
	public void insertLast(T info) {
		Node<T> tmp = new Node<T>(info,null,this.last);
		this.last.setNext(tmp);
		this.last=tmp;
	}
	
	public T extractLast() {
		T info = this.last.getInfo();
		this.last= this.last.getBack();
		this.last.setNext(null);
		this._size--;
		return info;
		
	}

	public boolean isEmpty() {
		return (this._size == 0);
	}
	
	//0(size) donde size es el tamaño de la lista
	public T get(int index) {
		int _index=0;
		if(_index< (this._size - 1)) {
			Node<T> cursor = this.first;
			while(cursor != null) {
				if( index==_index) {
					return cursor.getInfo();
				}	
				_index++;
				cursor= cursor.getNext();
			}	
		}
		return null;
	}
	
	public int size() {
		return this._size;
	}
	public Node<T> getFirst() {
		return this.first;
	}

	public Node<T> getLast() {
		return this.last;
	}

	public void imprimir() {
		Node<T> cursor = this.first;
		while(cursor != null) {
			System.out.print(cursor.getInfo());
			cursor= cursor.getNext();
		}
	}

//A la implementación de la clase Lista realizada en el ejercicio 1, agregue un método
//indexOf, que reciba un elemento y retorne el indice donde esta almacenado ese elemento, o
//-1 si el elemento no existe en la lista.
	public int indexOf(T info) {
		int index=0;
		Node<T> cursor = this.first;
		while(cursor != null) {
			if(cursor.getInfo()==info) {
				return index;
			}
			index++;
			cursor= cursor.getNext();
		}
		return -1;
	}
	
	@Override
	public String toString() {
		// TODO
		return "";
	}
	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(this.first);
	}

	
	public MyIterator<T> iteratorReverse() {
		return new MyIterator<T>(this.last);
	}
}
