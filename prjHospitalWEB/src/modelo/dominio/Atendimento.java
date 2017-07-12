package modelo.dominio;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Atendimento {
	
	private Date dataAtendimento;
	
	private Empresa empresa;
	private Paciente paciente;
	private Medico medico;
	private TipoDeSaida tipoDeSaida;
	private Set<Conta> listaContas;
	
	public Atendimento(Date dataAtendimento, Empresa empresa, Paciente paciente, Medico medico){
		this.setDataAtendimento(dataAtendimento);
		this.setEmpresa(empresa);
		this.setPaciente(paciente);
		this.setMedico(medico);
		this.listaContas = new TreeSet<Conta>();
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public TipoDeSaida getTipoDeSaida() {
		return tipoDeSaida;
	}

	public void setTipoDeSaida(TipoDeSaida tipoDeSaida) {
		this.tipoDeSaida = tipoDeSaida;
	}

	@Override
	public String toString() {
		return "Atendimento [dataAtendimento=" + dataAtendimento + ", empresa=" + empresa + ", paciente=" + paciente
				+ ", medico=" + medico + "]";
	}
		
	
	

}
