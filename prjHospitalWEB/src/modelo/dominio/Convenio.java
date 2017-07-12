package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class Convenio extends PessoaJuridica {
	
	private Set<Empresa> listaEmpresas;
	private Set<Plano> listaPlanos;
	private Set<TabelaDePrecoItem> listaTabelaDePrecoItens;
	
	public Convenio(Set<Plano> listaPlanos){
		
		this.listaEmpresas = new TreeSet<Empresa>();
		this.listaPlanos = new TreeSet<Plano>();
		this.listaTabelaDePrecoItens = new TreeSet<TabelaDePrecoItem>();
	}
	
	public boolean adicionarEmpresa(Empresa novo){
		return false;
	}

}
