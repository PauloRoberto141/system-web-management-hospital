package modelo.dominio;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class TabelaXItem {
	
	private Date dtVigencia;
	
	 private Convenio convenio;
	 private TabelaDePrecoItem tabelaDePrecoItem;
	 private Set<Empresa> listaEmpresas;
	 
	 public TabelaXItem(Date dtVigencia, Convenio convenio, TabelaDePrecoItem tabelaDePrecoItem){
		 
		setDtVigencia(dtVigencia);
		setConvenio(convenio);
		setTabelaDePrecoItem(tabelaDePrecoItem);
		this.listaEmpresas = new TreeSet<Empresa>();
	 }
	 
	// Getters e Setters.
	public Date getDtVigencia() {
		return dtVigencia;
	}

	public void setDtVigencia(Date dtVigencia) {
		this.dtVigencia = dtVigencia;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public TabelaDePrecoItem getTabelaDePrecoItem() {
		return tabelaDePrecoItem;
	}

	public void setTabelaDePrecoItem(TabelaDePrecoItem tabelaDePrecoItem) {
		this.tabelaDePrecoItem = tabelaDePrecoItem;
	}
	
	// toString
	@Override
	public String toString() {
		return "TabelaXItem [dtVigencia=" + dtVigencia + ", convenio=" + convenio + ", tabelaDePrecoItem="
				+ tabelaDePrecoItem + "]";
	}

	 
}
