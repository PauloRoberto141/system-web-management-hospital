package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class Empresa extends PessoaJuridica{
	
	private Set<Convenio> listaConvenios;
	private Set<Leito> listaLeitos;
	private Set<Internacao> listaInternacaos;
	private Set<Atendimento> listaAtendimentos;
	
	public Empresa(){
		this.listaConvenios = new TreeSet<Convenio>();
		this.listaLeitos = new TreeSet<Leito>();
		this.listaInternacaos = new TreeSet<Internacao>();
		this.listaAtendimentos = new TreeSet<Atendimento>();
	}

}
