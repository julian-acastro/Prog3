package practico1;

import java.util.Iterator;

public class Eje6<T> {
	
	
	public Eje6() {
	}
	
	public ListaVinculada<T> ambasDeso(ListaVinculada<T> ld1, ListaVinculada<T> ld2) {
		ListaVinculada<T> tmp = new ListaVinculada<T>();
		//Node<T> cursor= ld1.getFirst();
		Iterator<T> it1 = ld1.iterator();
		Iterator<T> it2 = ld2.iterator();
		
		for(int i=0; i<ld1.size(); i++) {
			T val1= it1.next();
			System.out.println(val1);
			for(int j=0; j<ld2.size(); j++) {
				T val2= it2.next();
				System.out.println(val2);
				if(val1== val2) {
					tmp.insertFront(val1);
				}
			}
		}
		return tmp;
	}

	
}
