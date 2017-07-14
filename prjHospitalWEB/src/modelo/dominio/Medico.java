package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class Medico extends Pessoa {
	
	private String crm;
	private String nacionalidade;
	private String sexo;
	
	private Set<Especialidade> listaEspecialidades;
	private Set<Atendimento> listaAtendimentos;
	private Set<Internacao> listaInternacao;
	
	public Medico(String nomePessoa, String logradouro, Integer numero, String bairro, String cidade, String uf,
			String pais, String cep, String crm, String nacionalidade, String sexo){
		
		super(nomePessoa, logradouro, numero, bairro, cidade, uf, pais, cep);
		this.setCrm(crm);
		this.setNacionalidade(nacionalidade);
		this.setSexo(sexo);
		this.listaEspecialidades = new TreeSet<Especialidade>();
		this.listaAtendimentos = new TreeSet<Atendimento>();
		this.listaInternacao = new TreeSet<Internacao>();
	}
	
	// Getters e Setters
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//Metodos adicionar e remover.
	public void adicionarEspecialidade(Especialidade novaEspecialidade){
		
	}
	public void removerEspecialidade(Especialidade exEspecialidade){
		
	}
	
	public void adicionarAtendimento(Atendimento novoAtendimento){
		
	}
	public void removerAtendimento(Atendimento exAtendimento){
		
	}
	
	public void adicionarInternacao(Internacao novaInternacao){
		
	}
	public void removerInternacao(Internacao exInternacao){
		
	}
	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", nacionalidade=" + nacionalidade + ", sexo=" + sexo + "]";
	}
	
	
}
