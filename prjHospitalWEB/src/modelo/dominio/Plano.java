package modelo.dominio;

public class Plano {
	
	private String nomePlano;
	
	private Convenio convenio;
	
	public Plano(String nomePlano, Convenio convenio){
		setNomePlano(nomePlano);
		setConvenio(convenio);
	}
	
	// Metodos gets e sets.
	public String getNomePlano() {
		return nomePlano;
	}

	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	
	// Metodo toString.
	@Override
	public String toString() {
		return "Plano [nomePlano=" + nomePlano + ", convenio=" + convenio + "]";
	}	

}
