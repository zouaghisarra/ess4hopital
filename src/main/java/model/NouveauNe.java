package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nouveau_ne database table.
 * 
 */
@Entity
@Table(name="nouveau_ne")
@NamedQuery(name="NouveauNe.findAll", query="SELECT n FROM NouveauNe n")
public class NouveauNe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idne;

	private String cinpere;

	private String datenaissance;

	private String nompere;

	private String prenomne;

	private String prenompere;

	public NouveauNe() {
	}

	public String getIdne() {
		return this.idne;
	}

	public void setIdne(String idne) {
		this.idne = idne;
	}

	public String getCinpere() {
		return this.cinpere;
	}

	public void setCinpere(String cinpere) {
		this.cinpere = cinpere;
	}

	public String getDatenaissance() {
		return this.datenaissance;
	}

	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}

	public String getNompere() {
		return this.nompere;
	}

	public void setNompere(String nompere) {
		this.nompere = nompere;
	}

	public String getPrenomne() {
		return this.prenomne;
	}

	public void setPrenomne(String prenomne) {
		this.prenomne = prenomne;
	}

	public String getPrenompere() {
		return this.prenompere;
	}

	public void setPrenompere(String prenompere) {
		this.prenompere = prenompere;
	}

}