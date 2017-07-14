package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class Convenio extends PessoaJuridica {
	
	private Set<Plano> listaPlanos;
	
	public Convenio(String nomePessoa, String logradouro, Integer numero, String bairro, String cidade, String uf,
			String pais, String cep, String cnpj, String razaoSocial, Set<Plano> listaPlanos){
		
		super(nomePessoa, logradouro, numero, bairro, cidade, uf, pais, cep, cnpj, razaoSocial);
		this.listaPlanos = new TreeSet<Plano>();
		for(Plano p : listaPlanos)
			this.adicionarPlano(p);
	}
	
	//Metodo adicionar e remover.
	public void adicionarPlano(Plano novoPlano){
		
	}	
	public void removerPlano(Plano exPlano){
		
	}
	

}
