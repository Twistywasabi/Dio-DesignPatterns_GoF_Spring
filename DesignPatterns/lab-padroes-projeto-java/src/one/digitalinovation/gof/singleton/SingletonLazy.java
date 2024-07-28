package one.digitalinovation.gof.singleton;

/*
 * 
 * 
 * @author T_Wasabi17
 * "*/

public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		
		if (instancia == null) {
			instancia = new SingletonLazy(); 
		}
		
		return instancia;
	}

}
