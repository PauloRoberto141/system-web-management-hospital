package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class Empresa extends PessoaJuridica{
	
	private Set<Convenio> listaConvenios;
	
	public Empresa(String nomePessoa, String logradouro, Integer numero, String bairro, String cidade, String uf,
			String pais, String cep, String cnpj, String razaoSocial){
		
		super(nomePessoa, logradouro, numero, bairro, cidade, uf, pais, cep, cnpj, razaoSocial);
		this.listaConvenios = new TreeSet<Convenio>();;
	}
	
	//Metodo adicionar e remover.
	public void adicionarConvenio(Convenio novoConvenio){
		
	}
	public void removerConvenio(Convenio exConvenio){
		
	}

	@Override
	public String toString() {
		return "Empresa [getCnpj()=" + getCnpj() + ", getRazaoSocial()=" + getRazaoSocial() + ", getNomePessoa()="
				+ getNomePessoa() + "]";
	}
	
	
}
