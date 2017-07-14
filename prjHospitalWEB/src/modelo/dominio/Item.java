package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class Item {
	
	private String nomeItem;
	private String unidadePadrao;
	private String unidadeConsumo;
	private String referencialTuss;
	
	private Set<Preco> listaPrecos;
	
	public Item(String nomeItem, String unidadePadrao, String unidadeConsumo, String referenciaTuss){
		this.setNomeItem(nomeItem);
		this.setUnidadePadrao(unidadePadrao);
		this.setUnidadeConsumo(unidadeConsumo);
		this.setReferencialTuss(referenciaTuss);
		this.listaPrecos = new TreeSet<Preco>();
		
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public String getUnidadePadrao() {
		return unidadePadrao;
	}

	public void setUnidadePadrao(String unidadePadrao) {
		this.unidadePadrao = unidadePadrao;
	}

	public String getUnidadeConsumo() {
		return unidadeConsumo;
	}

	public void setUnidadeConsumo(String unidadeConsumo) {
		this.unidadeConsumo = unidadeConsumo;
	}

	public String getReferencialTuss() {
		return referencialTuss;
	}

	public void setReferencialTuss(String referencialTuss) {
		this.referencialTuss = referencialTuss;
	}
	
	//Metodo adicionar e remover
	public void adicionarPreco(Preco novoPreco){
		
	}
	public void removerPreco(Preco exPreco){
		
	}
	
	@Override
	public String toString() {
		return "Item [nomeItem=" + nomeItem + ", unidadePadrao=" + unidadePadrao + ", unidadeConsumo=" + unidadeConsumo
				+ ", referencialTuss=" + referencialTuss + ", listaTabelaDePrecoItens=" + listaPrecos + "]";
	}
	
	
	
}
