package subsistema2.cep;

public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		
			return instancia;

	}
	
	//Vamos criar os métodos de instância públicos, pois quem quiser usar, vai pegar a instância e vai ter acesso aso métodos de instância que criarmos aqui
	
	public String recuperarCidade(String cep) {

		//Criar sem medo, porque eu sei que quem for usar essa classe, vai ter acesso da instância do singleton tranquilamente
		
		return "Araraquara";
		
	}
	
	public String recuperarEstado(String cep) {
		
		return "SP";
		
	}

}
