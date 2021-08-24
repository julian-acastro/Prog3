package practico1;

//import java.util.Iterator;

public class Practico1 {
	/**
	 * @param args
	 */
	//private static int cantNodos=10;
	static ListaVinculada<Integer> lista= new ListaVinculada<Integer>(); 
	
		
	static ListaVinculada<Integer> listaDeso1= new ListaVinculada<Integer>();
	static ListaVinculada<Integer> listaDeso2= new ListaVinculada<Integer>();
//		ListaVinculada<Integer> listaDeso3= new ListaVinculada<Integer>();
	static ListaVinculada<Integer> listaOrde1= new ListaVinculada<Integer>();
	static ListaVinculada<Integer> listaOrde2= new ListaVinculada<Integer>();
//		ListaVinculada<Integer> listaOrde3= new ListaVinculada<Integer>();
	public static void main(String[] args) {
//		crearNodos(cantNodos);
//		lista.extractFront();
//		lista.extractLast();
//		lista.insertLast(33);
//		lista.imprimir();
//		//System.out.print(lista.get(0));
//		
//		Iterator<Integer> it1 = lista.iterator();
//			while(it1.hasNext()) {
//				int valor = it1.next();
//				System.out.println(valor);
//			}
//		MyIterator<Integer> it2 = lista.iteratorReverse();
//			while(it2.hasNext()) {
//				int valor = it2.back();
//				System.out.println(valor);
//			}

		listaDeso1.insertFront(4);
		listaDeso1.insertFront(2);
		listaDeso1.insertFront(13);
		listaDeso1.insertFront(7);
		listaDeso1.insertFront(6);

		listaDeso2.insertFront(9);
		listaDeso2.insertFront(4);
		listaDeso2.insertFront(6);
		listaDeso2.insertFront(5);
		listaDeso2.insertFront(13);

//		listaOrde1.insertFront(2);
//		listaOrde1.insertFront(4);
//		listaOrde1.insertFront(6);
//		listaOrde1.insertFront(8);
//		listaOrde1.insertFront(11);
//		
//		listaOrde2.insertFront(1);
//		listaOrde2.insertFront(4);
//		listaOrde2.insertFront(9);
//		listaOrde2.insertFront(11);
//		listaOrde2.insertFront(15);
		
		Eje6<Integer> ord = new Eje6<Integer>();
		
		lista=ord.ambasDeso(listaDeso1, listaDeso2);
	}
	
	
	public static void crearNodos(int cN) {
		for(int i=0;i < cN ;i++) {
			lista.insertFront(i);
		}
	}
	
}
