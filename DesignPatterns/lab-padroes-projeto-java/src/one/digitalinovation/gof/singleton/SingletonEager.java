package one.digitalinovation.gof.singleton;
	/*
	 * 
	 * SingletonEager
	 * @author T_Wasabi17
	 * */
	
	public class SingletonEager {
	
		private static SingletonEager instancia = new SingletonEager();
	
		private SingletonEager() {
			super();
		}
		
		public static SingletonEager getInstancia() {
			
				return instancia;
	
		}
}