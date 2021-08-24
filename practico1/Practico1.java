package practico1;

import java.util.Iterator;

public class Practico1 {
	/**
	 * @param args
	 */
	private static int cantNodos=10;
	static ListaVinculada<Integer> lista= new ListaVinculada<Integer>(); 
	
	public static void main(String[] args) {
		crearNodos(cantNodos);
		lista.extractFront();
		lista.extractLast();
		lista.insertLast(33);
		lista.imprimir();
		//System.out.print(lista.get(0));

		Iterator<Integer> it1 = lista.iterator();
			while(it1.hasNext()) {
				int valor = it1.next();
				System.out.println(valor);
			}
		MyIterator<Integer> it2 = lista.iteratorReverse();
			while(it2.hasNext()) {
				int valor = it2.back();
				System.out.println(valor);
			}
	}
	
	
	public static void crearNodos(int cN) {
		for(int i=0;i < cN ;i++) {
			lista.insertFront(i);
		}
	}
}
