package bean;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import dao.DaoGeneric;
import model.Contato;

@ViewScoped
@Named(value = "contatoBean")
public class ContatoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Contato contato = new  Contato();
	private DaoGeneric<Contato> daoGeneric = new DaoGeneric<Contato>();
	
	public String salvar() {
		daoGeneric.salvar(contato);
		contato = new  Contato();
		return "";
	}
	
	public String merge() {
		contato = daoGeneric.merge(contato);
		return "";
	}


	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public DaoGeneric<Contato> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<Contato> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}
	
}
