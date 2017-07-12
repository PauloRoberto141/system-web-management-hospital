package modelo.dominio;

public class TipoDeAtendimento {
	
	private String nomeTipoDeAtendimento;
	
	public TipoDeAtendimento(String nomeTipoDeAtendimento){
		this.setNomeTipoDeAtendimento(nomeTipoDeAtendimento);
	}

	public String getNomeTipoDeAtendimento() {
		return nomeTipoDeAtendimento;
	}

	public void setNomeTipoDeAtendimento(String nomeTipoDeAtendimento) {
		this.nomeTipoDeAtendimento = nomeTipoDeAtendimento;
	}

	@Override
	public String toString() {
		return "TipoDeAtendimento [nomeTipoDeAtendimento=" + nomeTipoDeAtendimento + "]";
	}
	
	

}
