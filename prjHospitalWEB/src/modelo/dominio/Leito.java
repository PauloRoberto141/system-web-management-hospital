package modelo.dominio;

public class Leito {
	
	private String nomeLeito;
	private String descricao;
	
	private Empresa empresa;
	
	public Leito(String nomeLeito, Empresa empresa){
		setNomeLeito(nomeLeito);
		setEmpresa(empresa);
		
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
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return "Leito [nomeLeito=" + nomeLeito + ", descricao=" + descricao + "]";
	}	

}
