package modelo.dominio;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class TipoDeSaida {

	private String nomeTipoDeSaida;
	private Date dtSaida;

	private Set<Atendimento> listaAtendimentos;
	private Set<Internacao> listaInternacoes;

	public TipoDeSaida(String nomeTipoDeSaida) {
		this.setNomeTipoDeSaida(nomeTipoDeSaida);
		this.listaAtendimentos = new TreeSet<Atendimento>();
		this.listaInternacoes = new TreeSet<Internacao>();
	}

	// Getters e Setters.
	public String getNomeTipoDeSaida() {
		return nomeTipoDeSaida;
	}

	public void setNomeTipoDeSaida(String nomeTipoDeSaida) {
		this.nomeTipoDeSaida = nomeTipoDeSaida;
	}

	public Date getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(Date dtSaida) {
		this.dtSaida = dtSaida;
	}

	// Metodos adicionar e remover.
	public void adicionarAtendimento(Atendimento novoAtendimento) {

	}

	public void removerAtendimento(Atendimento ExAtendimento) {

	}

	public void adicionarInternacao(Internacao novaInternacao) {

	}

	public void removerInternacao(Internacao exInternacao) {

	}

	@Override
	public String toString() {
		return "TipoDeSaida [nomeTipoDeSaida=" + nomeTipoDeSaida + "]";
	}

}
