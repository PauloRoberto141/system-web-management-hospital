package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class Convenio extends PessoaJuridica {
	
	private Set<Empresa> listaEmpresas;
	private Set<Plano> listaPlanos;
	
	public Convenio(Set<Plano> listaPlanos){
		
		this.listaEmpresas = new TreeSet<Empresa>();
		this.listaPlanos = new TreeSet<Plano>();
	}
	
	public boolean adicionarEmpresa(Empresa novo){
		return false;
	}

}
