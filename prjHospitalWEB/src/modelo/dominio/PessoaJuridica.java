package modelo.dominio;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	private String razaoSocial;
	private Integer registroMunicial;
	private Integer registroEstadual;
	
	public PessoaJuridica(){
		
	}
	
	public PessoaJuridica(String nomePessoa, String logradouro, Integer numero, String bairro, String cidade, String uf,
			String pais, String cep, String cnpj, String razaoSocial){
		super(nomePessoa, logradouro, numero, bairro, cidade, uf, pais, cep);
		this.setCnpj(cnpj);
		this.setRazaoSocial(razaoSocial);		
	}
	
	// Metodos gets e sets
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public Integer getRegistroMunicial() {
		return registroMunicial;
	}
	public void setRegistroMunicial(Integer registroMunicial) {
		this.registroMunicial = registroMunicial;
	}
	public Integer getRegistroEstadual() {
		return registroEstadual;
	}
	public void setRegistroEstadual(Integer registroEstadual) {
		this.registroEstadual = registroEstadual;
	}	
	
	// Metodo toString
	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + "]";
	}
	
	

}
