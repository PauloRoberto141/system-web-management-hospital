package modelo.dominio;

import java.util.Set;

import sun.security.util.Password;

public class Usuario {
	
	private String nomeCompletoUsuario;
	private String nomeUsuario;
	private Password senha;
	
	private Set<Empresa> listaEmpresas;
	
	public Usuario(String nomeCompelto, String nomeUsuario, Password senha){
		setNomeCompletoUsuario(nomeCompelto);
		setNomeUsuario(nomeUsuario);
		setSenha(senha);
		
	}

	public String getNomeCompletoUsuario() {
		return nomeCompletoUsuario;
	}

	public void setNomeCompletoUsuario(String nomeCompletoUsuario) {
		this.nomeCompletoUsuario = nomeCompletoUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Password getSenha() {
		return senha;
	}

	public void setSenha(Password senha) {
		this.senha = senha;
	}
	

	@Override
	public String toString() {
		return "Usuario [nomeUsuario=" + nomeUsuario + "]";
	}
	
	
	

}
