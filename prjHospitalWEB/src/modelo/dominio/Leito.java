package modelo.dominio;

public class Leito {
	
	private String nomeLeito;
	private String descricao;
	private String localidade;
	
	private Empresa empresa;
	private Internacao internacao;
	
	public Leito(String nomeLeito, String localidade, Empresa empresa, Internacao internacao){
		this.setNomeLeito(nomeLeito);
		this.setLocalidade(localidade);
		this.setEmpresa(empresa);
		this.setInternacao(internacao);
		
	}
	
	// Metodos gets e sets
	public String getNomeLeito() {
		return nomeLeito;
	}
	public void setNomeLeito(String nomeLeito) {
		this.nomeLeito = nomeLeito;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public Internacao getInternacao() {
		return internacao;
	}

	public void setInternacao(Internacao internacao) {
		this.internacao = internacao;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Leito [nomeLeito=" + nomeLeito + ", descricao=" + descricao + "]";
	}	

}
