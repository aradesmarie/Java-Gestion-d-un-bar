package com.cytech.ingredients;


import com.cytech.ingredients.Boisson;

public class BoissonNonAlcoolisee extends Boisson{
	private float degreSucre;

	//constructeur
	public BoissonNonAlcoolisee(String nom, float prix, float contenance, float stock, float degreSucre) {
		super(nom, prix, contenance, stock);
		this.degreSucre = degreSucre;
	}

	// getters et setters

	public float getDegreSucre() {
		return degreSucre;
	}

	public void setDegreSucre(float degreSucre) {
		this.degreSucre = degreSucre;
	}
}
