package one.digitalinovation.gof.singleton;
	/*
	 * 
	 * SingletonLazyHolder
	 * @author T_Wasabi17
	 * */
	
	public class SingletonLazyHolder {
	
		private static class InstanceHolder {
			public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		}

	
		private SingletonLazyHolder() {
			super();
		}
		
		public static SingletonLazyHolder getInstancia() {
			
				return InstanceHolder.instancia;
	
		}
}