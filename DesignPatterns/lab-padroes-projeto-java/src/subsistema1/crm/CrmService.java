package subsistema1.crm;

public class CrmService {

	
	//Construtor privado para garantir que quem coinsumir essa classe, vai consumir os métodos estáticos, não ficar instanciando desnecessariamente
	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		
		System.out.println("Cliente salvo no sistema de CRM");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
		
	}
	
}
