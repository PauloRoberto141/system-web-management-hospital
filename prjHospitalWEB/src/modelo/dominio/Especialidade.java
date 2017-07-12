package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class Especialidade {
	
	private String nomeEspecialidade;
	private String cbo;
	
	private Set<Medico> listaMedicos;
	
	public Especialidade(String nomeEspecialidade){
		this.setNomeEspecialidade(nomeEspecialidade);
		this.listaMedicos = new TreeSet<Medico>();
	}
	
	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}
	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}
	public String getCbo() {
		return cbo;
	}
	public void setCbo(String cbo) {
		this.cbo = cbo;
	}
	@Override
	public String toString() {
		return "Especialidade [nomeEspecialidade=" + nomeEspecialidade + ", cbo=" + cbo + "]";
	}
	
	

}
