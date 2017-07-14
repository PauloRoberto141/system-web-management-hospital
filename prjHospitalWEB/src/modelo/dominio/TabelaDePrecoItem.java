package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class TabelaDePrecoItem {

	private String nomeTabelaDePrecoItem;

	private Set<Preco> listaPrecos;
	private Set<TabelaXItem> listaTabelaXItens;

	public TabelaDePrecoItem(String nome, Set<Preco> listaPrecos) {
		setNomeTabelaDePrecoItem(nome);
		this.listaPrecos = new TreeSet<Preco>();
		for(Preco p : listaPrecos)
			this.adicionarPreco(p);
		this.listaTabelaXItens = new TreeSet<TabelaXItem>();
	}

	// Getters e Setters
	public String getNomeTabelaDePrecoItem() {
		return nomeTabelaDePrecoItem;
	}

	public void setNomeTabelaDePrecoItem(String nomeTabelaPrecoItem) {
		this.nomeTabelaDePrecoItem = nomeTabelaPrecoItem;
	}

	// Metodo adicionar e remover.
	public void adicionarPreco(Preco novoPreco) {

	}

	public void removerPreco(Preco exPreco) {

	}
	
	public void adicionarTabelaXItem(TabelaXItem novaTabelaXItem){
		
	}
	
	public void removerTabelaXItem(TabelaXItem exTabelaXItem){
		
	}

	@Override
	public String toString() {
		return "TabelaDePrecoItem [nomeTabelaDePrecoItem=" + nomeTabelaDePrecoItem + ", listaItens=" + listaPrecos + "]";
	}

}
