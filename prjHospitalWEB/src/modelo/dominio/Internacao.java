package modelo.dominio;

import java.util.Date;

public class Internacao {
	
	private Date dataInternacao;
	
	private Empresa empresa;
	
	public Internacao(Date dataInternacao, Empresa empresa){
		setDataInternacao(dataInternacao);
		setEmpresa(empresa);
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
	
	// Metodo toString
}
