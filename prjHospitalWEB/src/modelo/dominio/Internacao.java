package modelo.dominio;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Internacao {

	private Date dataInternacao;

	private Empresa empresa;
	private Leito leito;
	private TipoDeSaida tipoDeSaida;
	private Paciente pacinete;
	private Medico medico;
	private Set<Conta> listaContas;
	

	public Internacao(Date dataInternacao, Empresa empresa, Leito leito, Paciente pacinete, Medico medico,
			Set<Conta> listaContas) {
		
		this.setDataInternacao(dataInternacao);
		this.setEmpresa(empresa);
		this.setLeito(leito);
		this.setPacinete(pacinete);
		this.setMedico(medico);
		this.listaContas = new TreeSet<Conta>();
		for(Conta c : listaContas)
			this.adicionarConta(c);
	}

	// Metodos gets e sets.
	public Date getDataInternacao() {
		return dataInternacao;
	}

	public void setDataInternacao(Date dataInternacao) {
		this.dataInternacao = dataInternacao;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Leito getLeito() {
		return leito;
	}

	public void setLeito(Leito leito) {
		this.leito = leito;
	}

	public TipoDeSaida getTipoDeSaida() {
		return tipoDeSaida;
	}

	public void setTipoDeSaida(TipoDeSaida tipoDeSaida) {
		this.tipoDeSaida = tipoDeSaida;
	}

	public Paciente getPacinete() {
		return pacinete;
	}

	public void setPacinete(Paciente pacinete) {
		this.pacinete = pacinete;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	// Metodos adicionar e remover.
	public void adicionarConta(Conta novaConta) {

	}

	public void removerConta(Conta exConta) {

	}
	

	@Override
	public String toString() {
		return "Internacao [dataInternacao=" + dataInternacao + ", empresa=" + empresa + ", leito=" + leito
				+ ", pacinete=" + pacinete + "]";
	}

}
