package modelo.dominio;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Conta {
	
	private Date dtInicio; 
	private Date dtFim;
	private String matriculaConvenio;
	private String validadeCarteira;
	private String nomeTitular;
	private String parentescoTitular;
	private Date dtAutorizacao;
	private Integer senhaAutorizacao;
	
	private TipoDeAtendimento tipoDeAtendimento;
	private Internacao internacao;
	private Atendimento atendimento;	
	private Set<Item> listaItens;
		
	public Conta(Date dtInicio, Date dtFim, String matriculaConvenio, String validadeCarteira,  String nomeTitular, String parentescoTitular,
			Date dtAutorizacao, Integer senhaAutorizacao, TipoDeAtendimento tipoDeAtendimento) {
		
		super();
		this.setDtInicio(dtInicio);
		this.setDtFim(dtFim);
		this.setMatriculaConvenio(matriculaConvenio);
		this.setValidadeCarteira(validadeCarteira);
		this.setNomeTitular(nomeTitular);
		this.setParentescoTitular(parentescoTitular);
		this.setDtAutorizacao(dtAutorizacao);
		this.setSenhaAutorizacao(senhaAutorizacao);
		this.setTipoDeAtendimento(tipoDeAtendimento);
		this.listaItens = new TreeSet<Item>();
	}

	// Getters e Setters
	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	public String getMatriculaConvenio() {
		return matriculaConvenio;
	}

	public void setMatriculaConvenio(String matriculaConvenio) {
		this.matriculaConvenio = matriculaConvenio;
	}

	public String getValidadeCarteira() {
		return validadeCarteira;
	}

	public void setValidadeCarteira(String validadeCarteira) {
		this.validadeCarteira = validadeCarteira;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getParentescoTitular() {
		return parentescoTitular;
	}

	public void setParentescoTitular(String parentescoTitular) {
		this.parentescoTitular = parentescoTitular;
	}

	public Date getDtAutorizacao() {
		return dtAutorizacao;
	}

	public void setDtAutorizacao(Date dtAutorizacao) {
		this.dtAutorizacao = dtAutorizacao;
	}

	public Integer getSenhaAutorizacao() {
		return senhaAutorizacao;
	}

	public void setSenhaAutorizacao(Integer senhaAutorizacao) {
		this.senhaAutorizacao = senhaAutorizacao;
	}

	public TipoDeAtendimento getTipoDeAtendimento() {
		return tipoDeAtendimento;
	}

	public void setTipoDeAtendimento(TipoDeAtendimento tipoDeAtendimento) {
		this.tipoDeAtendimento = tipoDeAtendimento;
	}

	public Internacao getInternacao() {
		return internacao;
	}

	public void setInternacao(Internacao internacao) {
		this.internacao = internacao;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}
	
	//Metodo adiconar e remover.
	public void adicionarItem(Item novoItem){
		
	}
	
	public void removerItem(Item exItem){
		
	}
	@Override
	public String toString() {
		return "Conta [dtInicio=" + dtInicio + ", dtFim=" + dtFim + ", matriculaConvenio=" + matriculaConvenio
				+ ", validadeCarteira=" + validadeCarteira + ", parentescoTitular=" + parentescoTitular
				+ ", dtAutorizacao=" + dtAutorizacao + ", senhaAutorizacao=" + senhaAutorizacao + ", tipoDeAtendimento="
				+ tipoDeAtendimento + ", internacao=" + internacao + ", atendimento=" + atendimento + ", listaItens="
				+ listaItens + "]";
	}
	
	
}
