package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class Paciente extends Pessoa {

	private String cpf;
	private String rg;
	private String sexo;

	private Set<Internacao> listaInternacoes;
	private Set<Atendimento> listaAtendimentos;

	public Paciente(String nomePessoa, String logradouro, Integer numero, String bairro, String cidade, String uf,
			String pais, String cep, String cpf, String rg, String sexo) {

		super(nomePessoa, logradouro, numero, bairro, cidade, uf, pais, cep);
		this.setCpf(cpf);
		this.setRg(rg);
		this.setSexo(sexo);
		this.listaInternacoes = new TreeSet<Internacao>();
		this.listaAtendimentos = new TreeSet<Atendimento>();
	}

	// Getters e Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	// Metodos adicionar e remover.
	public void adicionarInternacao(Internacao novaInternacao) {

	}

	public void removerInterncao(Internacao exInterncao) {

	}

	public void adicionarAtendimento(Atendimento novoAtendimento) {

	}

	public void removerAtendimento(Atendimento exAtendimento) {

	}

	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + "]";
	}

}
