package com.example.shoot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")// table name in BD
public class PlayerModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PLAYER_ID")
	private Long id;
	@Column
	private Long code;
	@Column
	private String nom;
	@Column
	private String raisonSocial;
	@Column
	private String adress;
	@Column
	private Long tel;
	
	public Long getId() {
		return id;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRaisonSocial() {
		return raisonSocial;
	}
	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	
}
