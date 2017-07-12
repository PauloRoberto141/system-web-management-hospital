package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class TipoDeSaida {
	
	private String nomeTipoDeSaida;
	
	private Set<Atendimento> listaAtendimentos;
	private Set<Internacao> listaInternacoes;
	
	public TipoDeSaida(String nomeTipoDeSaida){
		this.setNomeTipoDeSaida(nomeTipoDeSaida);
		this.listaAtendimentos = new TreeSet<Atendimento>();
		this.listaInternacoes = new TreeSet<Internacao>();
	}

	public String getNomeTipoDeSaida() {
		return nomeTipoDeSaida;
	}

	public void setNomeTipoDeSaida(String nomeTipoDeSaida) {
		this.nomeTipoDeSaida = nomeTipoDeSaida;
	}

	@Override
	public String toString() {
		return "TipoDeSaida [nomeTipoDeSaida=" + nomeTipoDeSaida + "]";
	}
	
	

}
