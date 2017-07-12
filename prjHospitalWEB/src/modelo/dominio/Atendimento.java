package modelo.dominio;

import java.util.Date;

public class Atendimento {
	
	private Date dataAtendimento;
	
	private Empresa empresa;
	
	public Atendimento(Date dataAtendimento, Empresa empresa){
		setDataAtendimento(dataAtendimento);
		setEmpresa(empresa);
	}
	
	// Metodos gets e sets
	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Date dataAtandimento) {
		this.dataAtendimento = dataAtandimento;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
		
	

}
