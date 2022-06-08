package com.cytech.ingredients;

import java.util.UUID;

public class Boisson {
	private UUID idBoisson;
	private String nom;
	private float prix;
	private float contenance;
	private float stock;

	// Constructeur
	public Boisson(String nom, float prix, float contenance, float stock) {
		super();
		this.idBoisson = UUID.randomUUID();
		this.nom = nom;
		this.prix = prix;
		this.contenance = contenance;
		this.stock = stock;
	}

	// getters et setters

	public UUID getIdBoisson() {
		return idBoisson;
	}

	public void setIdBoisson(UUID idBoisson) {
		this.idBoisson = idBoisson;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public float getContenance() {
		return contenance;
	}

	public void setContenance(float contenance) {
		this.contenance = contenance;
	}

	public float getStock() {
		return stock;
	}

	public void setStock(float stock) {
		this.stock = stock;
	}

	/* méthodes */

	public void ajouterStock(float s) {
		this.setStock(this.getStock() + s);
	}

	public void enleverStock(float s) {
		this.setStock(this.getStock() - s);
	}
}
